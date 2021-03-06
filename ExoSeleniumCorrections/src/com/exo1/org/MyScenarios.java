package com.exo1.org;

import com.exo1.org.MyMethods;  

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyScenarios {
	
	//MyMethods scenari = new MyMethods();
	//1. launch Navigator
	
	

	WebDriver driver = new FirefoxDriver();
	
	public void MyDeroulScenarios() {
		//1 launchNavigator and maximize window
		MyMethods.LaunchNavigator(driver, "https://www.eurosport.fr");
		//2 get title and url
		MyMethods.GetTitleAndUrlAndCompare(driver);
		// Navigation
		//3 go to FOOTBALL
		MyMethods.FindElementByLinkText(driver, "FOOTBALL").click();
		//4 return homePage
		MyMethods.returnHomePage(driver, "https://www.eurosport.fr");
		// 5 go to TENNIS
		MyMethods.FindElementByLinkText(driver, "TENNIS").click();
		// 6 return home
		MyMethods.returnHomePage(driver, "https://www.eurosport.fr");
		// 7 go to RUGBY
		MyMethods.FindElementByLinkText(driver, "RUGBY").click();
		// 8 naviagte to home page
		MyMethods.navigateTo(driver, "https://www.eurosport.fr");
		// 7 go to REGARDER
		MyMethods.FindElementByLinkText(driver, "REGARDER").click();
		// 10 navigate to FOOTBALL
		MyMethods.navigateTo(driver, "https://www.eurosport.fr/football/");
		// 11 return back
		MyMethods.NavigateBack(driver);
		// 12 close navigator
		MyMethods.QuietNaviagtor(driver);
		
	}
		
	
	
}
