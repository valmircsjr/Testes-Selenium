package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

/**
 * Pagina de cadastro de ocorrencia, seguindo padão Page Objects
 * @author Valmir Correa (valmir.correa@ufrn.edu.br)
 */
public class CadastrarOcorrenciaPage extends PageObjects {

	public CadastrarOcorrenciaPage() {
	}
	
	/**
	 * Abre a janela de ocorrencia 
	 */
	public void clickCadastro() {
		getDriver().manage().window().setSize(new Dimension(1366, 744));
	}
	
	/**
	 * Descriçao geral da ocorrencia
	 */
	public void descricao(String descricao) {
		getDriver().findElement(By.id("descricao_ocorrencia")).click();
		getDriver().findElement(By.id("descricao_ocorrencia")).sendKeys(descricao);
		getDriver().findElement(By.xpath("//div[@id='locOcorrenciaContainer']/div/div/div/div[3]")).click();
	}
	
	/**
	 * Meio de fuga dos ameaçantes
	 */
	public void meioDeFuga(String descricao) {
		getDriver().findElement(By.id("meio_de_fuga")).click();
		getDriver().findElement(By.id("meio_de_fuga")).sendKeys(descricao);
	}
	
	/**
	 * Numero de ameançantes envolvidos na ocorrencia
	 */
	public void numeroDeAmeacantes(String descricao) {
		getDriver().findElement(By.id("numero_ameacantes")).click();
		getDriver().findElement(By.id("numero_ameacantes")).sendKeys(descricao);
	}
	
	/**
	 * Ponto de referencia do local da ocorrencia
	 */
	public void pontoDeReferencia(String descricao) {
		getDriver().findElement(By.id("pontos_referencias")).click();
		getDriver().findElement(By.id("pontos_referencias")).sendKeys(descricao);
	}
	
	/**
	 * Descrição da fisionomia do suspeito
	 */
	public void fisionomiaSuspeito(String descricao) {
		getDriver().findElement(By.id("suspeito_1_fisionomia")).click();
		getDriver().findElement(By.id("suspeito_1_fisionomia")).sendKeys(descricao);
	}
	
	/**
	 * Descrição para o nome do suspeito
	 */
	public void nomeSuspeito(String descricao) {
		getDriver().findElement(By.id("suspeito_1_nome")).click();
		getDriver().findElement(By.id("suspeito_1_nome")).sendKeys(descricao);
	}
	
	/**
	 * Descrição para a roupa do suspeito
	 */
	public void roupasSupeito(String descricao) {
		getDriver().findElement(By.id("suspeito_1_roupas")).click();
		getDriver().findElement(By.id("suspeito_1_roupas")).sendKeys(descricao);
	}
	
	/**
	 * Clica no botao de cadastrar nova ocorrencia
	 */
	public void cadastrarNovaOcorrencia() {
		getDriver().findElement(By.id("//div[@id='nova-ocorrencia-modal']/div/div/div[3]/button")).click();

	}

}
