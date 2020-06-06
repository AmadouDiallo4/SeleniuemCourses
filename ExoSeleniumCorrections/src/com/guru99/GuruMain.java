package com.guru99;

import com.guru99.GuruScenarios;
public class GuruMain {

	public static void main(String[] args) {
		
		String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exPath);
		
		GuruScenarios dSecenari = new GuruScenarios();
		dSecenari.DeroulScenari();

	}

}
