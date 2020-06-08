package login_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listerner_Demo.ListenerTests.class)

public class LoginTestCase {
	
	public WebDriver driver;
	final String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64/geckodriver.exe";
	String baseUrl = "http://demo.guru99.com/v4";
	final String expectedTitle = "Guru99 Bank Home Page";
	String UserId = "mngr264349 ";
	String Password = "ugYjUmy";
	
	
	@Test(priority=0)
	//Launch Navigator
	public void LaunchNavigator()
	{
		System.setProperty("webdriver.gecko.driver", exPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		Assert.assertEquals(driver.getTitle(), expectedTitle, "Wrong hoome page Title");
		System.out.println(expectedTitle);
	}
	
	@Test(priority=1)
	// Login to the Application
	public void LoginToTheApplication()
	{
		driver.findElement(By.name("uid")).sendKeys(UserId);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Test(priority = 2)
	//Forcefully failed this test as to verify listener
	public void TestFail()
	{
		System.out.println("This method to test fail");
		Assert.assertTrue(false);
	}

}
