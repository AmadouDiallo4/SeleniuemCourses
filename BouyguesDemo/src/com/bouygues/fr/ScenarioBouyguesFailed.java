package com.bouygues.fr;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScenarioBouyguesFailed {
		
		public void myDeroulScenarios() {
			// 9 research
			MethodsBouygues.FindElementById(Utils.driver, "q").sendKeys(Utils.searchElement);
			MethodsBouygues.FindElementById(Utils.driver, "q").sendKeys(Keys.RETURN);
			
			MethodsBouygues.waitUntilElementsXpath(Utils.driver, Utils.researchElementByXpath);
			String actualResearchElement = MethodsBouygues.FindElementByxPath(Utils.driver, Utils.researchElementByXpath).getText();
			Assert.assertEquals(Utils.expectedResearchElement, actualResearchElement);
			
			// 10 navigate back
			MethodsBouygues.NavigateBack(Utils.driver);
			
			//11 return home
			MethodsBouygues.returnHomePage(Utils.driver, Utils.baseUrl);
			//12 return home
			MethodsBouygues.returnHomePage(Utils.driver, Utils.baseUrl);
		}
}
