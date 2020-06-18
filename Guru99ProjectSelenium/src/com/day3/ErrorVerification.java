package com.day3;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ErrorVerification {
	
	final String driverPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64/geckodriver.exe";
	public  WebDriver driver;
	public String Url = "http://live.guru99.com/";
	
	@BeforeTest
	//launch browser
	public void setUp()
	{		
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(Url);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void clickMobileMenu()
	{
		WebElement element = driver.findElement(By.linkText("MOBILE"));
		element.click();
	}
	
	@Test(priority = 2)
	public void addToCard()
	{
		WebElement element =driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span"));
		element.click();
	}
	
	@Test(priority = 3)
	public void changeQty()
	{
		WebElement qty = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/input"));
		qty.clear();
		qty.sendKeys("1000");
		WebElement update = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/button"));
		update.click();
	}
	
	@Test(priority = 4)
	public void VeriyErrorMesage()
	{
		WebElement errorMessage = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[2]/p"));
		//String expectedError = "The maximum quantity allowed for purchase is 500. ";
		errorMessage.getText().contains("maximum");
		System.out.println(errorMessage);
	}
	
	@Test(priority = 5)
	public void clickOnEmptycard() 
	{
		driver.findElement(By.xpath("//*[@id=\"empty_cart_button\"]")).click();
		WebElement noItem = driver.findElement(By.cssSelector("div[class='main-container col1-layout']"));
		System.out.println(noItem.getText());
	}
	
	@AfterTest
	public void teraDown()
	{
		driver.close();
	}
	
	
	
	
	
	

}
