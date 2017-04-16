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
		
	public void setCampoById(String campo, String valor) {
		driver.findElement(By.id(campo)).clear();
	    driver.findElement(By.id(campo)).sendKeys(valor);
	}

	public void setCampoByName(String campo, String valor) {
		driver.findElement(By.name(campo)).clear();
	    driver.findElement(By.name(campo)).sendKeys(valor);
	}
	
	
	public WebElement localizarElementoPorClassName(String valor) {		 
		return driver.findElement(By.className(valor));
	}

	public WebElement localizarElementoPorCssSelector(String valor) {		 
		return driver.findElement(By.cssSelector(valor));
	}	
	
	public WebElement localizarElementoPorLinkText(String valor) {
		return driver.findElement(By.linkText(valor));
	}

	public WebElement localizarElementoPorXPath(String valor) {
		return driver.findElement(By.xpath(valor));
	}	
	
}
