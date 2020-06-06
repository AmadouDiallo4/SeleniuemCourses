package com.guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.guru99.GuruMethods;
public class GuruScenarios {
	
	WebDriver driver = new FirefoxDriver();
	
	public void DeroulScenari() {
		//1 launch navigator
		GuruMethods.LaunchNavigator(driver, "https://www.guru99.com");
		//2 get title and url and compare
		GuruMethods.GetTitile_Url(driver);
		//3 text search
		GuruMethods.findElementById(driver, "gsc-i-id2").sendKeys("selenium");
		//4 click search 
		GuruMethods.findElementByXpath(driver, "/html/body/div[2]/section[3]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/form/table/tbody/tr/td[2]/button").click();
		//5 refresh page (return home)
		GuruMethods.RefrechPage(driver);
		// go to selenium page (by using image Se)
		GuruMethods.findElementByCssSelector(driver, "a[title=\"Selenium\"]").click();
		// 7 verify selenium home page
		GuruMethods.VerifyPage(driver, "Selenium Tutorials for Beginners: Learn WebDriver in 7 Days");
		// navigate to guru99 (home page)
		GuruMethods.findElementByCssSelector(driver, "a[title=\"Guru99\"]").click();
		// 9 naviguer vers un nouveau lien
		GuruMethods.LaunchNavigator(driver, "http://demo.guru99.com/test/newtours/register.php");
		// Select DropBox
		GuruMethods.findElementByname(driver, "country");
		// refresh
		
		// close navigator
		GuruMethods.closNavigator(driver);
		
	}
	
	

}
