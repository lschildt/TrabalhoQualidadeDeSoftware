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
		getDriverBase().setCampo("Email", usuario);
		getDriverBase().setCampo("Senha", senha);
		getDriverBase().clicar("button.btn.btn-primary");
		return new Home(getDriverBase());
	}		

}
