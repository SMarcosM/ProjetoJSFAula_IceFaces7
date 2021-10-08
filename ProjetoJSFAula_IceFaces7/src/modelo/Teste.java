package modelo;

import dao.ClienteDAO;

public class Teste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
//		cliente.setCPF("888NOVO");
//		cliente.setNome("danielNOVO");
//		cliente.setEmail("emailNOVO@gmail.com");
//		cliente.setEndereco("EndNOVO");
//		cliente.setIdade(20);
//		cliente.setTelefone("6199999NOVO"); 
//		cliente.setId(8l);	
		
		
		
		ClienteDAO cDAO = new ClienteDAO();
		
		cliente = cDAO.consultarPorID(3l);
		
		cliente.setNome("NOME ALTERADO");
		
		cDAO.salvarModificar(cliente);
		
		//cDAO.remover(5l);
		
//		cliente = cDAO.consultarPorID(9l);
		System.out.println("NOME: " + cliente.getNome() + " - EMAIL: " + cliente.getEmail());	
		
		
	}

}
