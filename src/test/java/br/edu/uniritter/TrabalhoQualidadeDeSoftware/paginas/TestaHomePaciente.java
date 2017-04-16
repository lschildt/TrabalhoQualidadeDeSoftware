package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas.Home;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas.Login;

/*
 
	Funcionalidade: Visualiza��o da pagina de administra��o do paciente
	
	Como usu�rio do sistema
	Necessito acessar a p�gina de administra��o do paciente
	Para gerenciar os dados do paciente
			
	Cen�rio: Visualizar p�gina de administra��o do paciente
	  Quando abro a listagem de paciente e clico no bot�o abrir de um paciente:
	  Ent�o vejo a p�gina de administra��o do paciente.

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
