package example;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	private WebDriver driver;
	
  @Test
  public void testEasy() 
  {
	  driver.get("http://demo.guru99.com/test/guru99home/");
	  String title = driver.getTitle();
	  
	  Assert.assertTrue(title.contains("Demo Guru99 Page"));
  }
  
  
  @BeforeTest
  public void beforeTest() 
  {
	  String driverPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64/geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
