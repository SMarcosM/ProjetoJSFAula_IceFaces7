package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Cliente;

public class ClienteDAO {

	// conexao com o BD
	public EntityManager getEM() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		return factory.createEntityManager();

	}

	// Salvar Cliente
	public Cliente salvarModificar(Cliente cliente) {
		EntityManager em = getEM();

		try {
			em.getTransaction().begin(); // iniciar a transacao
			if (cliente.getId() == null) {
				em.persist(cliente);
			} else {
				if (!em.contains(cliente)) {
					if (em.find(Cliente.class, cliente.getId()) == null) {
						throw new Exception("Erro ao atualizar o cliente");
					}

				}
				cliente = em.merge(cliente);
			}
			em.getTransaction().commit();

		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}

		return cliente;

	}

	// Remover Cliente
	public void remover(Long id) {
		EntityManager em = getEM();
		Cliente c = em.find(Cliente.class, id);
		try {
			em.getTransaction().begin();
			em.remove(c);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.err.println(e);
		} finally {
			em.close();
		}

	}

	// Buscar por ID
	public Cliente consultarPorID(Long id) {
		EntityManager em = getEM();

		Cliente cliente = null;

		try {
			// Executar um SELECT
			cliente = em.find(Cliente.class, id);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			em.close();
		}

		return cliente;

	}

	// Listar todos os Clientes
	@SuppressWarnings("unchecked")
	public List<Cliente> listarTodos() {
		EntityManager em = getEM();
		List<Cliente> clientes = null;

		try {
			clientes = em.createQuery("FROM Cliente c").getResultList();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			em.close();
		}

		return clientes;
	}

}
