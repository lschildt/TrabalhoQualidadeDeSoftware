package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;

/*

	Funcionalidade: Solicita��o de ajuda atrav�s de formul�rio
	
	Como usu�rio do sistema
	Quero solicitar ajuda 
	Para sanar d�vidas do sistema
			
	Cen�rio: Solicitar ajuda atrav�s do formul�rio
	  Quando insiro os dados no formul�rio a clico no bot�o enviar:
	  Ent�o vejo a mensagem de Sucesso.

*/

public class TestaAjuda {
	
	DriverBase driverBase;
    
    @Before
    public void setUp() throws Exception {
    	driverBase = new DriverBase();
    }
    
    @Test
    public void deveEnviarFormularioDeAjuda() {                	
    	Login login = new Login(driverBase);
    	Home home = login.acessar().logar("leandro.schildt@gmail.com", "12345");    	
    	Ajuda ajuda = home.ajuda();
        assertTrue(ajuda.enviar("Leandro", "leandro.schildt@gmail.com", "Mensagem de teste.").isValida());
    }
    
    @After
    public void tearDown() throws Exception {
    	driverBase.fechar();
    }        
        

}
