package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By UserID = By.xpath("//*[contains(@id,'Login1_UserName')]");
	By password = By.xpath("//*[contains(@id,'Login1_Password')]");
	By Submit = By.xpath("//*[contains(@id,'Login1_LoginButton')]");
	
	// constructor to initialize object
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void LoginToSite(String Username, String Password)
	{
		this.enterUsername(Username);
		this.enterPassword(Password);
		this.clickSubmit();
	}
	
	public void enterUsername(String Username)
	{
		driver.findElement(UserID).sendKeys(Username);
	}
	
	public void enterPassword(String Password)
	{
		driver.findElement(password).sendKeys(Password);
	}
	
	public void clickSubmit()
	{
		driver.findElement(Submit).click();
	}
}
