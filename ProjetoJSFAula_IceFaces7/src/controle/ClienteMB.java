package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import dao.ClienteDAO;
import modelo.Cliente;

//@Named

//@SessionScoped
@ManagedBean
public class ClienteMB implements Serializable {
	
	
	
	private static final long serialVersionUID = 2447230083829221310L;
	

	public Cliente cliente;

	public List<Cliente> clientes = new ArrayList<Cliente>();

	public String adicionarClienteTest(Cliente cliente) {
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvarModificar(cliente);
		return "OK";
	}

	public String adicionarCliente() {
		clientes.add(cliente);
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvarModificar(cliente);		
		cliente = new Cliente();
		return "listaClientes";
	}

	public String alterarCliente(Long id) {
		ClienteDAO clienteDAO = new ClienteDAO();
		cliente = clienteDAO.consultarPorID(id);		
		clienteDAO.salvarModificar(cliente);
		return "alteraCliente";
	}
	public String criarCliente() {		
		cliente = new Cliente();		
		return "cadastroCliente";
	}
	
	public String retornaListaClientes() {
		ClienteDAO clienteDAO = new ClienteDAO();
		clientes = clienteDAO.listarTodos();
		return "listaClientes";
	}
	public void removerCliente(Long id) {
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.remover(id);
	}	

	public String retornarListaClientes() {
		ClienteDAO cDAO = new ClienteDAO();
		clientes = cDAO.listarTodos();
		return "listaClientes";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getClientes() {

		ClienteDAO cDAO = new ClienteDAO();
		clientes = cDAO.listarTodos();

		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}

	
	
/*
	private Cliente cliente = new Cliente();
	public List<Cliente> clientes = new ArrayList<Cliente>();

		
	public String adicionarAlterarCliente() {		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvarModificar(cliente);		
		return "listaClientes";
	}

	public String cadastrarClientes() {
		cliente = new Cliente();		
		return "cadastroCliente";
	}

	public String alterarCliente(Long id) {
		ClienteDAO clienteDAO = new ClienteDAO();		
		cliente = clienteDAO.consultarPorID(id);
		return "alteraCliente";
	}

	public void removerCliente(Long id) {
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.remover(id);
	}

	public String retornaListaClientes() {
		ClienteDAO clienteDAO = new ClienteDAO();
		clientes = clienteDAO.listarTodos();
		return "listaClientes";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getClientes() {
		ClienteDAO clienteDAO = new ClienteDAO();
		clientes = clienteDAO.listarTodos();
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}
*/