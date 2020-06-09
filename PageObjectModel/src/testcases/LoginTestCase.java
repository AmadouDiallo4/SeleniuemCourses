package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.Browser;
import library.ScreenShot;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestCase {
	
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	
	int i =0;
	//Launch of the given browser
	@BeforeTest
	public void browserlaunch()
	{
		driver = Browser.StartBrowser("Firefox", "http://demostore.kenticolab.com/Special-Pages/Logon.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		lp = new LoginPage(driver);
		hp = new HomePage(driver);	
		
	}
	
	// login o the site
	@Test(priority = 1)
	public void Login()
	{
		lp.LoginToSite("gaurav.3n@gmail.com", "Test@123");
	}
	
	// verify the Home Page
	@Test(priority = 2)
	public void HomePageVerify()
	{
		String HomeText = hp.pageverify();
		Assert.assertEquals(HomeText, "Logged on as");
	}
	
	//logout to the site
	@Test(priority = 3)
	public void Logout()
	{
		hp.logout();
	}
	
	//Taking Screen shot on test fail
	@AfterMethod
	public void screenshot(ITestResult result)
	{
		i = i+1;
		String name = "ScreenShot";
		String x = name+String.valueOf(i);
		if(ITestResult.FAILURE == result.getStatus())
		{
			ScreenShot.captureScreenShot(driver, x);
		}
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
