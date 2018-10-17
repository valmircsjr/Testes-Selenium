package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Pagina Base, seguindo padão Page Objects
 * @author Valmir Correa (valmir.correa@ufrn.edu.br)
 */
public class PageObjects {

	/* Declarando um objeto do tipo WebDriver, utilizado pelo Selenium WebDriver. */
	private WebDriver driver;
	
	/**
	 * 
	 * @param driver
	 */
	public PageObjects(WebDriver driver, String driverPath) {
		System.setProperty("webdriver.gecko.driver", driverPath);
		this.driver = driver;
	}
	
	/**
	 * 
	 */
	public PageObjects(String driverPath) {
		System.setProperty("webdriver.gecko.driver", driverPath);
		this.driver = new FirefoxDriver();
	}
	
	/**
	 * 
	 * @param url
	 */
	public void navegateTo(String url) {
		driver.navigate().to(url);
	}
	
	/**
	 * 
	 * @return
	 */
	public WebDriver getDriver() {
		return driver;
	}
	
	/**
	 * 
	 */
	public void closeNavegator() {
		getDriver().close();
	}
	
}
