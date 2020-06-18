package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestCaseDay5 {
	
	final String driverPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64/geckodriver.exe";
	public  WebDriver driver;
	public String Url = "http://live.guru99.com/";
	
	
	//@BeforeTest
	@Test(priority = 0)
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(Url);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void clickAccountLink()
	{
		WebElement link_account = driver.findElement(By.linkText("ACCOUNT"));
		link_account.click();
		
		WebElement my_acc = driver.findElement(By.xpath("/html/body/div/div/header/div/div[5]/div/ul/li[1]/a"));
		my_acc.click();
		
	}
	
	/*@Test(priority = 2)
	public void createAccount()
	{
		driver.findElement(By.linkText("CREATE AN ACCOUNT")).click();
		
		WebElement first_name = driver.findElement(By.id("firstname"));
		first_name.sendKeys("amadou");
		
		WebElement middle_name = driver.findElement(By.id("middlename"));
		middle_name.sendKeys("tidiane");
		
		WebElement last_name = driver.findElement(By.id("lastname")) ;
		last_name.sendKeys("diallo");
		
		//WebElement email = driver.findElement(By.id("email_address"));
		//email.sendKeys("dialloat3b@hotmail.com");
		
		WebElement pwd = driver.findElement(By.id("password")) ;
		pwd.sendKeys("testday5");
		
		WebElement conf_pwd = driver.findElement(By.id("confirmation")) ;
		conf_pwd.sendKeys("testday5");
		
		//WebElement suscribe = driver.findElement(By.id("is_subscribed"));
		//suscribe.click();
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[2]/button/span/span")).click();
	}*/
	
	@Test(priority = 4)
	public void TvMenu()
	{
		driver.findElement(By.linkText("TV")).click();
		WebElement add_product = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a"));
		add_product.click();
		
		//click share whishlist
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/div/button[1]/span/span")).click();
		
		//send message
		driver.findElement(By.name("emails")).sendKeys("dialloat3b@hotmail.com");
		driver.findElement(By.id("message")).clear();
		driver.findElement(By.id("message")).sendKeys("TestCase Day5");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div[2]/button/span/span")).click();

	}
	
	@Test(priority = 5)
	public void check()
	{
		WebElement mesage_share = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span"));
		Assert.assertEquals(mesage_share.getText(), "Your Wishlist has been shared.", "Whishlist not shared");
		
	}
	
	@Test(priority = 3)
	public  void connection()
	{
		driver.findElement(By.id("email")).sendKeys("dialloat3b@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("testday5");
		driver.findElement(By.id("send2")).click();
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
