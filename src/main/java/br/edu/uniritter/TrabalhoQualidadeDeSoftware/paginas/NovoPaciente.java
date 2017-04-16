package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.Pagina;

public class NovoPaciente extends Pagina {

	public NovoPaciente(DriverBase driverBase) {
		super(driverBase);
	}
	
	public HomePaciente cadastrar(String nome) {
	    getDriverBase().setCampo("Nome", nome);	    
	    getDriverBase().encontrarElementoPorCssSelector("label.radio-inline").click();
	    getDriverBase().encontrarElementoPorCssSelector("button.btn.btn-primary").click();						
		return new HomePaciente(getDriverBase());
	}		
	
}
