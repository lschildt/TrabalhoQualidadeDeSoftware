package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;

public class TestaRecuperarSenha {

/*

	Funcionalidade: Recuperar senha
	
	Como usu�rio do sistema
	Necessito recuperar minha senha
	Para acessar o sistema
			
	Cen�rio: No formul�rio de recupera��o de senha
	  Quando informo e-mail e clico em enviar instru��es:
	  Ent�o vejo a mensagem "Instru��es enviadas com sucesso!".

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
