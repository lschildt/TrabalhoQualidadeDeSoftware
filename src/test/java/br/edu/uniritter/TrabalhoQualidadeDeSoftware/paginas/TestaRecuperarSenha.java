package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;

public class TestaRecuperarSenha {

/*

	Funcionalidade: Recuperar senha
	
	Como usuário do sistema
	Necessito recuperar minha senha
	Para acessar o sistema
			
	Cenário: No formulário de recuperação de senha
	  Quando informo e-mail e clico em enviar instruções:
	  Então vejo a mensagem "Instruções enviadas com sucesso!".

*/	
	
	DriverBase driverBase;
    
    @Before
    public void setUp() throws Exception {
    	driverBase = new DriverBase();
    }
    
    @Test
    public void deveEnviarSolicitacaoDeAlteracaoDeSenha() {                	
    	RecuperarSenha recuperarSenha = new RecuperarSenha(driverBase);
    	assertTrue(recuperarSenha.acessar().informarEmail("leandro.schildt@gmail.com").isSucesso());
    }    

    @After
    public void tearDown() throws Exception {
    	driverBase.fechar();;
    }        
        
}
