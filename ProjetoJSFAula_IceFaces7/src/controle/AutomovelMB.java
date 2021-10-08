package controle;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@Named    
@ManagedBean
@SessionScoped
public class AutomovelMB implements Serializable{

	private static final long serialVersionUID = 4510192376636382914L;
	
	private ArrayList<String> tipos;
	private ArrayList<String> servicos;
	private String tipo;
	private String servico;
	
public AutomovelMB() {
		
		tipos = new ArrayList<String>();
		tipos.add("Carro");
		tipos.add("Moto");
		
		servicos = new ArrayList<String>();
		servicos.add("Troca de pneus");
		servicos.add("Troca de óleo");
		servicos.add("Troca de pastilhas de freio");
		servicos.add("Injeção eletrônica");
		servicos.add("Reparos em motores");
		servicos.add("Sistema elétrico");
		servicos.add("Suspensão");
		
	}
	
		
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public String cadastrarServicos() {
		return "cadastrarAutomovel";
	}
	
	public String cadastroServicos() {
		
		String msg = "Serviços solicitados veículo " + getTipo() + " : " + getServicos();

		FacesMessage fm = new FacesMessage(msg);
		FacesContext.getCurrentInstance().addMessage("msg", fm);
		System.out.println(getTipo());
		System.out.println(getServicos());
		
		return "listaClientes";
	}
	
	
	public ArrayList<String> getTipos() {
		return tipos;
	}
	public void setTipos(ArrayList<String> tipos) {
		this.tipos = tipos;
	}
	public ArrayList<String> getServicos() {
		return servicos;
	}
	public void setServicos(ArrayList<String> servicos) {
		this.servicos = servicos;
	}
	
	
	
	
}
