package com.bouygues.fr;

import org.junit.Test;

public class TestScenarios {
	
	String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64//geckodriver.exe";
	ScenarioBouygues dScenari = new ScenarioBouygues();
	ScenarioBouyguesFailed dScenari1 = new ScenarioBouyguesFailed();
	
	@Test
	public void testPassed() {
			System.setProperty("webdriver.gecko.driver", exPath);
			
			dScenari.myDeroulScenarios();
	}
	@Test
	public void testFailed() {
		System.setProperty("webdriver.gecko.driver", exPath);
		
		dScenari.myDeroulScenarios();
		dScenari1.myDeroulScenarios();
		Utils.tearDown();
}
}
