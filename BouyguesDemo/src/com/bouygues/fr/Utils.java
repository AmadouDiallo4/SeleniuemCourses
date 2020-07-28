package com.bouygues.fr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
	
	// Variables
		static WebDriver driver = new FirefoxDriver();
		static String baseUrl = "https://www.bouyguestelecom.fr";
		static String mobileLink = "Mobile";
		static String boxInternetLink ="Box Internet";
		static String assistanceLink = "Assistance";
		
		// Selectors
		static String bAndYouXpath = "//*[@href='/forfaits-mobiles/sans-engagement']/button[@class='button is-secondary is-fullwidth']";
		static String searchElement = "bbox";
		static String forfaitXpath = "//*[@class='title is-2']";
		static String homePageXpath = "//*[@class='title is-1 is-section-title has-text-white']";
		static String offreBAndYouXpath = "//*[@class='title is-2 title-byou has-text-left']";
		static String researchElementByXpath ="//*[@class='box box-search' and @href='https://www.bouyguestelecom.fr/mon-compte/demenagement-box']";
		static String assistanceById = "titreBandeau";
		// Expected variables
		static String expectedHomePage = "Nos offres pour être mieux connecté";
		static String expectedForfait = "Choisissez votre Forfait Sensation";
		static String expectedOffreBAndYou = "Nos Forfaits 4G B&You sans engagement";
		static String expectedResearchElement = "Demandez le déménagement de ma ligne bbox";
		static String expectedAssistance = "L'ASSISTANCE DES EXPERTS BOUYGUES TELECOM";
		
		public static void tearDown()
		{
			Utils.driver.close();
		}

}
