package main;

import pageObjects.AtribuicaoVigilantesPage;

/**
 * Classe principal
 * @author Valmir Correa (valmir.correa@ufrn.edu.br)
 */
public class SeleniumDriver {
	
	/* Local do driver */
	private static String driverPath = "geckodriver/geckodriver";
	
	/* url */
	private static String url = "http://campussegurohomolog.imd.ufrn.br/SIGOc-SINFO-Dashboard-Orion/";

	public static void main(String[] args) {

		
		AtribuicaoVigilantesPage atribuirVigilante = new AtribuicaoVigilantesPage ();
		
		atribuirVigilante.navegateTo(url);				// direciona para o site
		atribuirVigilante.abrirJanelaOcorrencias();
		atribuirVigilante.selecionarOcorrencia();
		atribuirVigilante.selecionarVigilante();
	}

}
