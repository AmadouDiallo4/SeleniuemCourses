package com.suite1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart {
	
	final String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64//geckodriver.exe";
	public static WebDriver driver ;
	String username = ""; // Change to your username and passwrod
	String password = "";

	// This method is to navigate flipkart URL
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.gecko.driver", exPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");
	}
	/*
	// To log in flipkart
	@Test
	public void login() {
		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(
				By.cssSelector(".fk-input.login-form-input.user-email"))
				.sendKeys(username);
		driver.findElement(
				By.cssSelector(".fk-input.login-form-input.user-pwd"))
				.sendKeys(password);
		driver.findElement(By.cssSelector(".submit-btn.login-btn.btn")).click();
	}*/
	
	// Search For product
		@Test
		public void searchAndSelectProduct() {
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("moto g3");
			WebElement searchSubmit = driver.findElement(
					By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg/g/path[2]"));
			searchSubmit.submit();

			// select the first item in the search results
			String path = "/html/body/div[1]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]";
			driver.findElement(By.xpath(path)).click();
			
		}
}
