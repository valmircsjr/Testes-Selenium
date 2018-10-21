package main;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import pageObjects.AtribuicaoVigilantesPage;
import pageObjects.CadastrarOcorrenciaPage;
import pageObjects.CancelarOcorrenciaPage;
import pageObjects.FinalizarOcorrenciaPage;

/**
 * Classe principal
 * @author Valmir Correa (valmir.correa@ufrn.edu.br)
 */
public class SeleniumDriver {
	
	/* Endereço do DashBoard */
	private static String url = "http://campussegurohomolog.imd.ufrn.br/SIGOc-SINFO-Dashboard-Orion/";

	public static void main(String[] args) {
		
		/* Cadastrar Ocorrencia  */
		CadastrarOcorrenciaPage CadastrarOcorrencia = new CadastrarOcorrenciaPage();
		
		CadastrarOcorrencia.setFirefoxDriver();
		CadastrarOcorrencia.navegateTo(url);
		
		CadastrarOcorrencia.clickCadastro();
		CadastrarOcorrencia.descricao("teste");
		CadastrarOcorrencia.meioDeFuga("teste");
		CadastrarOcorrencia.numeroDeAmeacantes("teste");
		CadastrarOcorrencia.fisionomiaSuspeito("teste");
		CadastrarOcorrencia.nomeSuspeito("teste");
		CadastrarOcorrencia.roupasSupeito("teste");
		CadastrarOcorrencia.cadastrarNovaOcorrencia();

		/* Vigilantes */
		AtribuicaoVigilantesPage atribuirVigilante = new AtribuicaoVigilantesPage ();
		
		atribuirVigilante.setFirefoxDriver();			// seta o tipo e driver, dependendo do navegador.
		atribuirVigilante.navegateTo(url);				// direciona para o site.
		
		atribuirVigilante.abrirJanelaOcorrencias();
		atribuirVigilante.selecionarOcorrencia("1");
		atribuirVigilante.selecionarVigilante("1");
		
		/* Cancelar Ocorrencia  */
		CancelarOcorrenciaPage CancelarOcorrencia = new CancelarOcorrenciaPage();		
		
		CancelarOcorrencia.setFirefoxDriver();
		CancelarOcorrencia.navegateTo(url);
		
		CancelarOcorrencia.abrirJanelaOcorrencias();
		CancelarOcorrencia.selecionarOcorrencia("2");
		CancelarOcorrencia.cancelarOcorrencia("2");
		
		/* Finalizar Ocorrencia  */
		FinalizarOcorrenciaPage FinalizarOcorrencia = new FinalizarOcorrenciaPage();
		
		FinalizarOcorrencia.setFirefoxDriver();
		FinalizarOcorrencia.navegateTo(url);
		
		FinalizarOcorrencia.abrirJanelaOcorrencias();
		FinalizarOcorrencia.selecionarOcorrencia("2");
		FinalizarOcorrencia.finalizarOcorrencia("2");

	}

}
