package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.Pagina;

public class Home extends Pagina {

	public Home(DriverBase driverBase) {
		super(driverBase);
	}
	
	public boolean isValida() {
		return existeBarraDeNavegacao();
	}
	 
	private boolean existeBarraDeNavegacao() {
		return getDriverBase().encontrarElementoPorClasse("navbar") != null;
	}	 

}
