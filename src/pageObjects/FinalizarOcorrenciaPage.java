package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class FinalizarOcorrenciaPage extends PageObjects {

	public FinalizarOcorrenciaPage() {
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
	public void selecionarOcorrencia(String numOcorrencia) {
		getDriver().findElement(By.id("html-ocorrencia-" + numOcorrencia)).click();
	}
	
	/**
	 * cancelar uma ocorrencia
	 */
	public void finalizarOcorrencia(String numOcorrencia) {
		getDriver().findElement(By.xpath("//li[@id='html-ocorrencia-" + numOcorrencia + "']/div[2]/div/button")).click();	
	}

}
