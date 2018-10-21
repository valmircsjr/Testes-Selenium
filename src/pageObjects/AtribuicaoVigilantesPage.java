package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

/**
 * Pagina para atribuição de vigilantes a uma ocorrencia.
 * @author Valmir Correa (valmir.correa@ufrn.edu.br)
 */
public class AtribuicaoVigilantesPage extends PageObjects {

	/**
	 * Constructor parametric
	 * @param driver
	 * @param driverPath
	 */
	public AtribuicaoVigilantesPage() {
	}
	
	/**
	 * Abre a janela de ocorrencia 
	 */
	public void abrirJanelaOcorrencias() {
		getDriver().manage().window().setSize(new Dimension(683, 716));
	}
	
	/**
	 * Seleciona uma ocorrencia
	 */
	public void selecionarOcorrencia(String numOcorrencia) {
		getDriver().findElement(By.id("html-ocorrencia-" + numOcorrencia)).click();
		getDriver().findElement(By.xpath("//li[@id='html-ocorrencia-" + numOcorrencia + "']/div[2]/div[2]/button")).click();
		
	}
	
	/**
	 * Seleciona o vigiliante para uma ocorrencia
	 */
	public void selecionarVigilante(String idVigilante) {
		getDriver().findElement(By.id("html-vigilante-" + idVigilante)).click();
		getDriver().findElement(By.xpath("//div[@id='sidebar-switch']/div[3]/button")).click();
	}
}
