package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Pagina Base, seguindo padão Page Objects
 * @author Valmir Correa (valmir.correa@ufrn.edu.br)
 */
public class PageObjects {

	/* Declarando um objeto do tipo WebDriver, utilizado pelo Selenium WebDriver. */
	private WebDriver driver;
	
	/* Local do driver */
	private static String driverPath = "./geckoDriver/geckodriver";
	
	/**
	 * Constructor
	 * @param driver
	 */
	public PageObjects(WebDriver driver) {
		System.setProperty("webdriver.gecko.driver", driverPath);
		this.driver = driver;
	}
	
	/**
	 * Constructor
	 */
	public PageObjects() {
		System.setProperty("webdriver.gecko.driver", driverPath);
	}
	
	/**
	 * FirefoxDriver
	 */
	public void setFirefoxDriver() {
		this.driver = new FirefoxDriver();
	}
	
	/**
	 * ChromeDriver
	 */
	public void setChromeDriver() {
		this.driver = new ChromeDriver();
	}
	
	/**
	 * 
	 * @param url
	 */
	public void navegateTo(String url) {
		driver.navigate().to(url);
	}
	
	/* get driver */
	public WebDriver getDriver() {
		return driver;
	}
	
	/* set Driver*/
	public void closeNavegator() {
		getDriver().close();
	}
	
}
