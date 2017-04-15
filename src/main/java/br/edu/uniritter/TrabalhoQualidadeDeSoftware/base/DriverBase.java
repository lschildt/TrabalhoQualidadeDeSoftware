package br.edu.uniritter.TrabalhoQualidadeDeSoftware.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverBase {
	
	public final static String urlBase = "http://www.woundsmonitor.com.br/";	
	private WebDriver driver;			

	public DriverBase(WebDriver driver) {
		this.driver = driver;
	}

	public DriverBase() {
	    System.setProperty("webdriver.firefox.marionette","C:\\leandro\\projetos\\java\\lib\\selenium\\geckodriver.exe");
	    this.driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);				
	}

	public void abrirUrl() { 		
		abrirUrl("");
	}			
	
	public void abrirUrl(String complemento) { 		
		driver.get(urlBase + complemento);
	}	
	
	public void fecharNavegador() {
		driver.close();
	}	
		
	public void setCampo(String campo, String valor) {
		driver.findElement(By.id(campo)).clear();
	    driver.findElement(By.id(campo)).sendKeys(valor);
	}
	
	public void clicar(String identificador) {
		driver.findElement(By.cssSelector(identificador)).click();
	}

	public WebElement encontrarElementoPorClasse(String nome) {		 
		return driver.findElement(By.className(nome));
	}

	
}
