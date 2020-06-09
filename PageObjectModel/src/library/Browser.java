package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	static WebDriver driver;
	
	public static WebDriver StartBrowser(String browsername, String url)
	{
		//if the browsername is firefox 
		if(browsername.equalsIgnoreCase("Firefox"))
		{
			//set the path for geckodriver.exe
			String driverPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
		}
		// if the browser is Chrome
		else if(browsername.equalsIgnoreCase("Chrome"))
		{
			//set the path for chromedriver
			String driverPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/chromedriver_win32//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
