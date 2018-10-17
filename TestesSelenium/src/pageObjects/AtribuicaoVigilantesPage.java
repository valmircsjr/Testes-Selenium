package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

/**
 * Pagina para atribuição de vigilantes a a uma ocorrencia.
 * @author Valmir Correa (valmir.correa@ufrn.edu.br)
 */
public class AtribuicaoVigilantesPage extends PageObjects {
	

	/**
	 * Constructor parametric
	 * @param driver
	 * @param driverPath
	 */
	public AtribuicaoVigilantesPage(WebDriver driver, String driverPath) {
		super(driver, driverPath);
	}
	
	/**
	 * Constructor parametric
	 * @param driverPath
	 */
	public AtribuicaoVigilantesPage(String driverPath) {
		super(driverPath);
	}
	
	/**
	 * Abre a janela de ocorrencia 
	 */
	public void abrirJanelaOcorrencias() {
		getDriver().manage().window().setSize(new Dimension(1024, 768));
	}
	
	/**
	 * Seleciona uma ocorrencia
	 */
	public void selecionarOcorrencia() {
		getDriver().findElement(By.id("html-ocorrencia-26")).click();
	}
	
	/**
	 * Seleciona o vigiliante para uma ocorrencia
	 */
	public void selecionarVigilante() {
		getDriver().findElement(By.id("id=html-vigilante-14")).click();
	}
}
