package com.bouygues.fr;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScenarioBouygues {
	// Variables
	WebDriver driver = new FirefoxDriver();
	String baseUrl = "https://www.bouyguestelecom.fr";
	String mobileLink = "Mobile";
	String boxInternetLink ="Box Internet";
	String assistanceLink = "Assistance";
	
	// Selectors
	String bAndYouXpath = "//*[@href='/forfaits-mobiles/sans-engagement']/button[@class='button is-secondary is-fullwidth']";
	String searchElement = "bbox";
	String forfaitXpath = "//*[@class='title is-2']";
	String homePageXpath = "//*[@class='title is-1 is-section-title has-text-white']";
	String offreBAndYouXpath = "//*[@class='title is-2 title-byou has-text-left']";
	
	
	// Expected variables
	String expectedHomePage = "Nos offres pour être mieux connecté";
	String expectedForfait = "Choisissez votre Forfait Sensation";
	String expectedOffreBAndYou = "Nos Forfaits 4G B&You sans engagement";
	
	
	public void MyDeroulScenarios() {
		//1 launchNavigator and maximize window
		MethodsBouygues.setUp(driver, baseUrl);
		//2 get title and url
		MethodsBouygues.GetTitleAndUrlAndCompare(driver);
		// Navigation
		//3 go to Mobile page
		MethodsBouygues.FindElementByLinkText(driver, mobileLink).click();
		MethodsBouygues.waitUntilPageLoaded(driver);
		String actualText = MethodsBouygues.FindElementByxPath(driver, forfaitXpath).getText();
		Assert.assertEquals(expectedForfait, actualText);		
		
		//4 return homePage
		MethodsBouygues.returnHomePage(driver, baseUrl);
		MethodsBouygues.waitUntilPageLoaded(driver);
		String actualhomePage = MethodsBouygues.FindElementByxPath(driver, homePageXpath).getText();
		Assert.assertEquals(expectedHomePage, actualhomePage);
		
		// 5 go to box Internet
		MethodsBouygues.FindElementByLinkText(driver, boxInternetLink).click();
		
		// 6 return home
		MethodsBouygues.navigateTo(driver, baseUrl);
		
		// 7 go to B&YOU
		MethodsBouygues.FindElementByxPath(driver, bAndYouXpath).click();
		String actualoffrePage = MethodsBouygues.FindElementByxPath(driver, offreBAndYouXpath).getText();
		Assert.assertEquals(expectedOffreBAndYou, actualoffrePage);
		// 8 naviagte to Assistance
		MethodsBouygues.FindElementByLinkText(driver, assistanceLink).click();
		// 9 return back
		
		// 10 research
		MethodsBouygues.FindElementById(driver, "q").sendKeys(searchElement);
		MethodsBouygues.FindElementById(driver, "q").sendKeys(Keys.RETURN);
		MethodsBouygues.waitUntilPageLoaded(driver);
		
		
		// 11 navigate back
		MethodsBouygues.NavigateBack(driver);
		
		// 12 navigate forward
		MethodsBouygues.NavigateForwardPage(driver);
		
		//13 return home
		MethodsBouygues.returnHomePage(driver, baseUrl);
		// 14 close navigator
		MethodsBouygues.tearDown(driver);

}
}
