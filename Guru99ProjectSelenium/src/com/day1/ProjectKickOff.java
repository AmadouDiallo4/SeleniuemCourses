package com.day1;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

@Test
public class ProjectKickOff {
	public int scc = 0;
	public WebDriver driver;
	final String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64//geckodriver.exe";
	final String expectedTitle = "Home page";
	public String Url = "http://live.guru99.com/index.php/";
	
	@Test(priority=0)
	//Launch Browser
	public void Launcbrowser()
	{
		//String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exPath);
		driver = new FirefoxDriver();
		
		driver.get(Url);
	}
	
	@Test(priority=1)
	//VerifyTitle of the page
	public void VerifyTitlePage()
	{
		String actualTitle = driver.getTitle();;
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong homePage Title");
		System.out.println(expectedTitle);
	}
	
	@Test(priority=2)
	//click on mobile menu
	public void ClickOnMenuMobile()
	{
		WebElement mobile = driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/nav/ol/li[1]/a"));
		mobile.click();
	}
	
	@Test(priority=3)
	//VerifyTitle of the page
	public void VerifyTitlePageMobile()
	{
		String actualTitle = driver.getTitle();;
		Assert.assertEquals(actualTitle, "Mobile", "Wrong Mobile Page Title");
		System.out.println("Mobile");
	}
	
	@Test(priority=4)
	//Select sort By
	public void SelectDropBox()
	{
		Select elem = new Select(driver.findElement(By.cssSelector("select[title=\"Sort By\"]")));
		elem.selectByVisibleText("Name");
	}
	
	@Test(priority=5)
	// close browser
	public void CloseBrowser()
	{
		driver.quit();
	}

}
