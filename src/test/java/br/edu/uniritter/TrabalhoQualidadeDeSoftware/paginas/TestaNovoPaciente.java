package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas.Home;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas.Login;

public class TestaNovoPaciente {
	
	
/*
	 
	Funcionalidade: Cadastro de novo paciente
	
	Como usuário do sistema
	Quero inserir um novo paciente
	Para gerenciar seus tratamentos
			
	Cenário: Cadastro de novo paciente
	  Quando insiro os dados no formulário a clico no botão salvar:
	  Então vejo a página principal de administração do paciente.

*/
	
	
	
	DriverBase driverBase;
    
    @Before
    public void setUp() throws Exception {
    	driverBase = new DriverBase();
    }
    
    @Test
    public void deveCadastrarNovoPaciente() {                	
    	Login login = new Login(driverBase);
    	Home home = login.acessar().logar("leandro.schildt@gmail.com", "12345");    	
    	NovoPaciente novoPaciente = home.novoPaciente();    	
    	HomePaciente homePaciente = novoPaciente.cadastrar("Paciente Selenium " + System.currentTimeMillis());
        assertTrue(homePaciente.isValida());
    }

    @After
    public void tearDown() throws Exception {
    	driverBase.fechar();;
    }        
    
}
