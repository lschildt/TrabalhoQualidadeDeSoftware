package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.Pagina;

public class Home extends Pagina {

	public Home(DriverBase driverBase) {
		super(driverBase);
	}
	
    public NovoPaciente novoPaciente() {
        getDriverBase().localizarElementoPorLinkText("Novo paciente").click();        
        return new NovoPaciente(getDriverBase());
    }		

	public Ajuda ajuda() {
        getDriverBase().localizarElementoPorLinkText("Ajuda").click();        
        return new Ajuda(getDriverBase());
	}	    
	
	public HomePaciente abrirHomePaciente() {		
        getDriverBase().localizarElementoPorCssSelector("i.fa.fa-file").click();        
        return new HomePaciente(getDriverBase());
	}
    
	public boolean isValida() {
		return existeBarraDeNavegacao();
	}
	 
	private boolean existeBarraDeNavegacao() {
		return getDriverBase().localizarElementoPorClassName("navbar") != null;
	}

}
