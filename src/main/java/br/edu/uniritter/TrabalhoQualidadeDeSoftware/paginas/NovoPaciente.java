package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.Pagina;

public class NovoPaciente extends Pagina {

	public NovoPaciente(DriverBase driverBase) {
		super(driverBase);
	}
	
	public HomePaciente cadastrar(String nome) {
	    getDriverBase().setCampoById("Nome", nome);	    
	    getDriverBase().localizarElementoPorCssSelector("label.radio-inline").click();
	    getDriverBase().localizarElementoPorCssSelector("button.btn.btn-primary").click();						
		return new HomePaciente(getDriverBase());
	}		
	
}
