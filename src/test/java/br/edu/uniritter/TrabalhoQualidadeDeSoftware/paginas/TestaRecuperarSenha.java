package br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;

public class TestaRecuperarSenha {

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
    
}
