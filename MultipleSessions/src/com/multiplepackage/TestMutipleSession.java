package com.multiplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestMutipleSession {
	
	@Test
	public void executSessionOne()
	{
		// First session of WebDriver
		String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exPath);
		WebDriver driver = new FirefoxDriver();
		// Got to guru99 site
		driver.get("http://demo.guru99.com/v4/");
		// find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 1");
	}
	
	@Test
	public void executeSessionTwo()
	{
		//Second session of WebDriver
		String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exPath);
		WebDriver driver = new FirefoxDriver();
		//Go to guru99 site
		driver.get("http://demo.guru99.com/v4/");
		//find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 2");
		
	}
	
	@Test
	public void executeSessionThree()
	{
		//Second session of WebDriver
		String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exPath);
		WebDriver driver = new FirefoxDriver();
		//Go to guru99 site
		driver.get("http://demo.guru99.com/v4/");
		//find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 3");
		
	}
	
	
}
