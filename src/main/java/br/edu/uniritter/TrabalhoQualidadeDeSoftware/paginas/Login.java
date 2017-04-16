package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.Pagina;

public class Login extends Pagina {		
	
	public Login(DriverBase driverBase) {
		super(driverBase);
	}

	public Login acessar() {
		getDriverBase().abrirUrl();
	    return this;
	}
		 
	public Home logar(String usuario, String senha) {
		getDriverBase().setCampoById("Email", usuario);
		getDriverBase().setCampoById("Senha", senha);
		getDriverBase().localizarElementoPorCssSelector("button.btn.btn-primary").click();;
		return new Home(getDriverBase());
	}		

}
