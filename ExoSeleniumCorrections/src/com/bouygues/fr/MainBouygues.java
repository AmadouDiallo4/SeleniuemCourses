package com.bouygues.fr;

import com.bouygues.fr.ScenarioBouygues;

public class MainBouygues {

	public static void main(String[] args) {
		
			String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64//geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", exPath);
			
			ScenarioBouygues dScenari = new ScenarioBouygues();
			
			dScenari.MyDeroulScenarios();

	}

}
