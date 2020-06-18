package com.ebay.fr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ebay.fr.MyMethodsEbay;

public class MyScenariEbay {
	
	WebDriver driver = new FirefoxDriver();
	
	public void DeroulScenari()
	{
		//1 setUp navigator
		MyMethodsEbay.setUp(driver, "https://www.ebay.fr ");
		//2 get Title and Url
		MyMethodsEbay.getTitleAndUrl(driver);
		
		//3 search box dsplayed ?
		//MyMethodsEbay.boxSearch(driver, "gh-ac");
		// 4 search element
		MyMethodsEbay.SeacrhElementById(driver, "gh-ac", "chat", "1281");
		// 5 optimize search
		MyMethodsEbay.optimizeSearch(driver);
		// 6 return homepage
		MyMethodsEbay.returnHomePage(driver);
		// 7 search article
		MyMethodsEbay.SeacrhElementById(driver, "gh-ac", "voiture telecommande", "9800");
		
		
		
		// tearDown navigator
		//MyMethodsEbay.tearDown(driver);
		
	}

}
