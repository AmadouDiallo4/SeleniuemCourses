package com.withoutpriority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Priority_In_testNG {
	
	final String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64//geckodriver.exe";
	public static WebDriver driver ;
	
	//Methode 1: Open Browser say Firefox
	@Test(priority =1)
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", exPath);
		driver = new FirefoxDriver();
		
	}
	
	//Method 2 : Launch google.com
	@Test(priority =2)
	public void launchGoogle()
	{
		
		driver.get("http://www.google.co.in");
	}
	
	//Method3 : Perform search using "Facebook"
	@Test(priority =3)
	public void performSearchAndClickLink()
	{
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Facebook");
	}
	//Method 4 : Verify Google page title
	@Test(priority =4)
	public void FaceBookPageTitleVerification() throws Exception
	{
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getTitle().contains("Facebook - Recherhe Google "), true);
	}
	

}
