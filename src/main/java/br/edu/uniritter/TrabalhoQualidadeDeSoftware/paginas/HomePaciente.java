package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.Pagina;

public class HomePaciente extends Pagina {

	public HomePaciente(DriverBase driverBase) {
		super(driverBase);
	}

	public boolean isValida() {
		return existeBotaoAlterarPaciente();
	}
	 
	private boolean existeBotaoAlterarPaciente() {
		return getDriverBase().encontrarElementoPorClassName("navbar") != null;
	}	 		

}
