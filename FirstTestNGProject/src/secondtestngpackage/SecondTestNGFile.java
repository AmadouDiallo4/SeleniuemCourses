package secondtestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

@Test
public class SecondTestNGFile {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64//geckodriver.exe";
	public WebDriver driver;
	public String expected = null;
	public String actual = null;
	
	@BeforeTest
	  public void launchBrowser() {
		  System.out.println("Launching firefox browser");
		  System.setProperty("webdriver.gecko.driver", exPath);
		  driver = new FirefoxDriver();
		  driver.get(baseUrl);
	  }
	
	@BeforeMethod
	  public void verifyHomepageTitle() {
		  String expectedTitle = "Welcome: Mercury Tours";
		  String actualTitle = driver.getTitle();
		  Assert.assertEquals(actualTitle, expectedTitle);
	  }
	
		@Test(priority = 0)
	public void register() {
	  driver.findElement(By.linkText("REGISTER")).click();
	  expected = "Register: Mercury Tours";
	  actual = driver.getTitle();
	  Assert.assertEquals(actual, expected);
  }		
		@Test(priority = 1)
		public void support() {
			driver.findElement(By.linkText("SUPPORT")).click();
			expected = "Under Construction: Mercury Tours";
			actual = driver.getTitle();
			Assert.assertEquals(actual, expected);
		}
  

	@AfterMethod
	public void goBackToHomePage() {
		driver.findElement(By.linkText("Home")).click();
		
	}

	@AfterTest
	public void afterTest() {
		driver.close();
  }

}
