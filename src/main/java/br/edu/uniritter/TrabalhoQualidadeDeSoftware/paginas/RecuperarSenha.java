package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.Pagina;

public class RecuperarSenha extends Pagina {

	public RecuperarSenha(DriverBase driverBase) {
		super(driverBase);
	}

	public RecuperarSenha acessar() {
		getDriverBase().abrirUrl("RecuperarSenha/");
	    return this;
	}
	
	public RecuperarSenha informarEmail(String email) {
		getDriverBase().setCampoByName("Email", email);
		getDriverBase().localizarElementoPorCssSelector("button.btn.btn-primary").click();;
		return this;
	}
	
	public boolean isSucesso() {
		return existeMensagemSucesso();
	}
	
	private boolean existeMensagemSucesso() {						
		return getDriverBase().localizarElementoPorCssSelector("h3.title.text-center").getText().equals("Instruções enviadas com sucesso!");
	}	
	
}
