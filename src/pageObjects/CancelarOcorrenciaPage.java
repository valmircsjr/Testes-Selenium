package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class CancelarOcorrenciaPage extends PageObjects {

	public CancelarOcorrenciaPage() {
	}
	
	/**
	 * Abre a janela de ocorrencia 
	 */
	public void abrirJanelaOcorrencias() {
		getDriver().manage().window().setSize(new Dimension(1366, 744));
	}
	
	/**
	 * Seleciona uma ocorrencia
	 */
	public void selecionarOcorrencia(String numOcorrencia) {
		getDriver().findElement(By.id("html-ocorrencia-" + numOcorrencia)).click();	
		
	}
	
	/**
	 * cancelar uma ocorrencia
	 */
	public void cancelarOcorrencia(String numOcorrencia) {
		getDriver().findElement(By.xpath("//li[@id='html-ocorrencia-" + numOcorrencia + "']/div[2]/div/button[2]")).click();
	}
}
