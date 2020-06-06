package com.exo1.org;
import com.exo1.org.MyMethods; 
import com.exo1.org.MyScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyMainClass {

	public static void main(String[] args) {
		String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exPath);
		
		//WebDriver driver = new FirefoxDriver();
		
		//String baseUrl = "https://www.google.com";
		//driver.get(baseUrl);
		
		MyScenarios dScenari = new MyScenarios();
		
		dScenari.MyDeroulScenarios();
		
		
		
		
		
	}

}
