package com.exo1.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyMethods {
	
	public static void LaunchNavigator (WebDriver driver, String BaseUrl)
		{
			driver.get(BaseUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		}
	public static void QuietNaviagtor(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.close();
		}
	// findElement by Name
	 public static WebElement FindElementByName(WebDriver driver, String ElementName)
		{
			WebElement resultName = driver.findElement(By.name(ElementName));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return resultName;
		}
	 // find Element by Id
	 public static WebElement FindElementById(WebDriver driver, String ElementId)
		{
			WebElement resultId = driver.findElement(By.id(ElementId));
			return resultId;
		}
	 // find element by xPath
	 public static WebElement FindElementByxPath(WebDriver driver, String ElementxPath)
		{
			WebElement resultxPath = driver.findElement(By.xpath(ElementxPath));
			return resultxPath;
		}
	 
	 // find Element by LinkText
	 
	 public static WebElement FindElementByLinkText(WebDriver driver, String ElementLinkText)
	 	{
		  	WebElement resultLinkText = driver.findElement(By.linkText(ElementLinkText));
		  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  	return resultLinkText;
	 	}
	 
	 // return Back
	 public static void NavigateBack(WebDriver driver)
	 	{
		 	driver.navigate().back();
	 	}
	 
	 // return homePage
	 public static void returnHomePage(WebDriver driver, String homePage)
		 {
			 driver.navigate().to(homePage);
		 }
	// return forward
	 public static void NavigateForwardPage(WebDriver driver)
	 	{
		 	driver.navigate().forward();
	 	}
	 
	 //navigate to
	 public static void navigateTo(WebDriver driver, String destinateTo)
	 	{
		 	driver.navigate().to(destinateTo);
	 	}
	 //get Title and Url
	 public static String GetTitleAndUrlAndCompare(WebDriver driver)
	 	{
		 	String actualTitle = driver.getCurrentUrl();
		 	String expectedTitle = "Bouygues Telecom | téléphone, forfait mobile, offre internet";
		 //comapre
		 	if (actualTitle==expectedTitle)
		 		System.out.println("Test Passed: get right title");
		 	else 
		 		System.out.println("Test False: wrong title");
		 	System.out.println(actualTitle);
		 	return actualTitle;
	 	}
}
