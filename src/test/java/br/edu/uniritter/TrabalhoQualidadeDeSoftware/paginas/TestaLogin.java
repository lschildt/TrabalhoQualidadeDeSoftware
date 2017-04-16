package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas.Home;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas.Login;

/*
 
	Funcionalidade: Acesso ao sistema
	
	Como usuário do sistema
	Quero me logar
	Para administrar o sistema
			
	Cenário: Login de usuário
	  Quando insiro os dados no formulário a clico no botão entrar:
	  Então vejo a página principal com a listagem de pacientes.

*/


public class TestaLogin {
	
	DriverBase driverBase;
    
    @Before
    public void setUp() throws Exception {
    	driverBase = new DriverBase();
    }
    
    @Test
    public void loginDeveTerSucesso() {                	
    	Login login = new Login(driverBase);
    	Home home = login.acessar().logar("leandro.schildt@gmail.com", "12345");
        assertTrue(home.isValida());
    }

    @After
    public void tearDown() throws Exception {
    	driverBase.fechar();;
    }        
    
}
