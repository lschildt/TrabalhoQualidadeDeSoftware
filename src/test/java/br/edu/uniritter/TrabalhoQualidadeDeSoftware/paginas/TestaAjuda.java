package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;

public class TestaAjuda {
	
	DriverBase driverBase;
    
    @Before
    public void setUp() throws Exception {
    	driverBase = new DriverBase();
    }
    
    @Test
    public void deveEnviarFormularioDeAjuda() {                	
    	Login login = new Login(driverBase);
    	Home home = login.acessar().logar("leandro.schildt@gmail.com", "bolero");    	
    	Ajuda ajuda = home.ajuda();
        assertTrue(ajuda.enviar("Leandro", "leandro.schildt@gmail.com", "Mensagem de teste.").isValida());
    }

}
