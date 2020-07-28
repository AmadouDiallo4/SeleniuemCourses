package com.bouygues.fr;
import org.junit.Assert;

public class ScenarioBouygues {
	
	public void myDeroulScenarios() {
		//1 launchNavigator and maximize window
		MethodsBouygues.setUp(Utils.driver, Utils.baseUrl);
		//2 get title and url
		MethodsBouygues.GetTitleAndUrlAndCompare(Utils.driver);
		
		//3 go to Mobile page
		MethodsBouygues.FindElementByLinkText(Utils.driver, Utils.mobileLink).click();
		MethodsBouygues.waitUntilPageLoaded(Utils.driver);
		String actualText = MethodsBouygues.FindElementByxPath(Utils.driver, Utils.forfaitXpath).getText();
		Assert.assertEquals(Utils.expectedForfait, actualText);		
		
		//4 return homePage
		MethodsBouygues.returnHomePage(Utils.driver, Utils.baseUrl);
		MethodsBouygues.waitUntilPageLoaded(Utils.driver);
		String actualhomePage = MethodsBouygues.FindElementByxPath(Utils.driver, Utils.homePageXpath).getText();
		Assert.assertEquals(Utils.expectedHomePage, actualhomePage);
		// 5 go to box Internet
		MethodsBouygues.FindElementByLinkText(Utils.driver, Utils.boxInternetLink).click();
		
		// 6 return home
		MethodsBouygues.navigateTo(Utils.driver, Utils.baseUrl);
		
		// 7 go to B&YOU
		MethodsBouygues.FindElementByxPath(Utils.driver, Utils.bAndYouXpath).click();
		String actualoffrePage = MethodsBouygues.FindElementByxPath(Utils.driver, Utils.offreBAndYouXpath).getText();
		Assert.assertEquals(Utils.expectedOffreBAndYou, actualoffrePage);
		// 8 naviagte to Assistance
		MethodsBouygues.FindElementByLinkText(Utils.driver, Utils.assistanceLink).click();
		String actualAssistance= MethodsBouygues.FindElementById(Utils.driver, Utils.assistanceById).getText();
		Assert.assertEquals(Utils.expectedAssistance, actualAssistance);
	}
	
}
