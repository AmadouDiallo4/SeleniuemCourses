package com.ebay.fr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyMethodsEbay {
	// setUp
	public static void setUp(WebDriver driver, String Url)
	{
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	// tear down
	public static void tearDown(WebDriver driver)
	{
		driver.close();
	}
	// get title and url
	public static String getTitleAndUrl(WebDriver driver)
	{
		String actualTitle=driver.getTitle();
		String expectedTitle = "Produits électronique, Voitures, Vêtements, Objets de collection, Bons d’achats et autres achats en ligne | ebay";
		System.out.println("############################################");
		System.out.println(driver.getCurrentUrl());  
		if(actualTitle==expectedTitle)
			{
				System.out.println("############################################");	
				System.out.println("Title is:" +expectedTitle);
			}
		else
			{
				System.out.println("############################################");		
				System.out.println("Wrong Title!!");
			}
		return actualTitle;
	}
	// return homepage
	public static void returnHomePage(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.fr");
	}
	// search elemnt
	public static void SeacrhElementById(WebDriver driver, String elementByName,String element_send, String value )
	{
		 
		WebElement result_search = driver.findElement(By.id(elementByName));
		result_search.clear();
		result_search.sendKeys(element_send);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Select categ_search = new Select(driver.findElement(By.id("gh-cat")));
		
		categ_search.selectByValue(value);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("gh-btn")).click();
		
		
	}
	// optimize search
	public static void optimizeSearch(WebDriver driver)
	{
		
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[1]/ul/li[3]/div[2]/ul/li[2]/div/a/div/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[1]/ul/li[2]/ul/li[1]/div[2]/ul/li[1]/div/a/div/input")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	
	public static WebElement boxSearch(WebDriver driver, String box_search)
	{
		WebElement result_search = driver.findElement(By.id(box_search));
		if(result_search.isDisplayed())
			System.out.println("You can start your search");
		else
			System.out.println("Be ware , enable search box");
		return result_search;
	}

}
