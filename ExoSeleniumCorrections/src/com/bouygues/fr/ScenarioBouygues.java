package com.bouygues.fr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bouygues.fr.MethodsBouygues;


public class ScenarioBouygues {
	
	WebDriver driver = new FirefoxDriver();
	
	public void MyDeroulScenarios() {
		//1 launchNavigator and maximize window
		MethodsBouygues.LaunchNavigator(driver, "https://www.bouyguestelecom.fr");
		//2 get title and url
		MethodsBouygues.GetTitleAndUrlAndCompare(driver);
		// Navigation
		//3 go to Mobile page
		MethodsBouygues.FindElementByLinkText(driver, "Mobile").click();
		//4 return homePage
		MethodsBouygues.returnHomePage(driver, "https://www.bouyguestelecom.fr");
		// 5 go to box Internet
		MethodsBouygues.FindElementByxPath(driver, "/html/body/div[1]/div/nav/div[2]/div/div/div[2]/a").click();
		// 6 return home
		MethodsBouygues.navigateTo(driver, "https://www.bouyguestelecom.fr");
		// 7 go to B&YOU
		MethodsBouygues.FindElementByxPath(driver, "/html/body/main/section[3]/div/div/div/div[1]/div[3]/div/div[3]/a/button").click();
		// 8 naviagte to Assistance
		MethodsBouygues.FindElementByLinkText(driver, "Assistance").click();
		// 9 return back
		//MethodsBouygues.NavigateBack(driver);
		// 10 research
		MethodsBouygues.FindElementById(driver, "q").sendKeys("bbox");
		// 11 research
		MethodsBouygues.FindElementByxPath(driver, "/html/body/div[3]/div/div/div[4]/div[1]/div/div/form/div/button/span").click();
		// 12 navigate back
		MethodsBouygues.NavigateBack(driver);
		// 13 navigate forward
		MethodsBouygues.NavigateForwardPage(driver);
		//14 return home
		MethodsBouygues.returnHomePage(driver, "https://www.bouyguestelecom.fr");
		// 12 close navigator
		MethodsBouygues.QuietNaviagtor(driver);

}
}
