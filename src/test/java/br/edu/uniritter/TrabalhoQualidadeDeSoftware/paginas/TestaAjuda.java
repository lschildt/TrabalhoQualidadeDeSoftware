package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;

/*

	Funcionalidade: Solicitação de ajuda através de formulário
	
	Como usuário do sistema
	Quero solicitar ajuda 
	Para sanar dúvidas do sistema
			
	Cenário: Solicitar ajuda através do formulário
	  Quando insiro os dados no formulário a clico no botão enviar:
	  Então vejo a mensagem de Sucesso.

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
