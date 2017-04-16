package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.Pagina;

public class Ajuda extends Pagina {

	public Ajuda(DriverBase driverBase) {
		super(driverBase);
		// TODO Auto-generated constructor stub
	}

	public Ajuda enviar(String nome, String email, String mensagem) {		
	    getDriverBase().setCampoByName("Nome", nome);	  
	    getDriverBase().setCampoByName("Email", email);
	    getDriverBase().setCampoByName("Mensagem", mensagem);
	    getDriverBase().localizarElementoPorXPath("//button[@type='submit']").click();
		return this;
	}
	
	public boolean isValida() {
		return existeMensagemSucesso();
	}
	
	private boolean existeMensagemSucesso() {
		return getDriverBase().localizarElementoPorCssSelector("div.alert.alert-success") != null;
	}	

}
