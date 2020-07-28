package com.bouygues.fr;

import org.junit.Test;

public class TestScenarios {

	@Test
	public void test() {
		
			String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64//geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", exPath);
			
			ScenarioBouygues dScenari = new ScenarioBouygues();
			
			dScenari.MyDeroulScenarios();
	}

}
