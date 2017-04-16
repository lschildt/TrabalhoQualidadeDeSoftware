package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas.Home;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas.Login;

/*
 
	Funcionalidade: Visualização da pagina de administração do paciente
	
	Como usuário do sistema
	Necessito acessar a página de administração do paciente
	Para gerenciar os dados do paciente
			
	Cenário: Visualizar página de administração do paciente
	  Quando abro a listagem de paciente e clico no botão abrir de um paciente:
	  Então vejo a página de administração do paciente.

*/

public class TestaHomePaciente {	
	
	DriverBase driverBase;
    
    @Before
    public void setUp() throws Exception {
    	driverBase = new DriverBase();
    }
    
    @Test
    public void deveCadastrarNovoPaciente() {                	
    	Login login = new Login(driverBase);
    	Home home = login.acessar().logar("leandro.schildt@gmail.com", "12345");    	    	
    	HomePaciente homePaciente = home.abrirHomePaciente();
        assertTrue(homePaciente.isValida());
    }

    @After
    public void tearDown() throws Exception {
    	driverBase.fechar();;
    }        
    
}
