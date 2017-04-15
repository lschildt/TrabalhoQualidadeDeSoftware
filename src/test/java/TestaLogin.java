import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.TrabalhoQualidadeDeSoftware.base.DriverBase;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas.Home;
import br.edu.uniritter.TrabalhoQualidadeDeSoftware.paginas.Login;

public class TestaLogin {
	
	DriverBase driverBase;
    
    @Before
    public void setUp() throws Exception {
    	driverBase = new DriverBase();
    }
    
    @Test
    public void loginComSucesso() {                	
    	Login login = new Login(driverBase);
    	Home home = login.acessar().logar("leandro.schildt@gmail.com", "bolero");
        assertTrue(home.isValida());
    }
 
}
