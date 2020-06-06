package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	
	WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable
	{
		System.out.println("#####################");
		System.out.println("This Step open the Firefox and launch the aplication");

		String exPath = "C:/Users/diall/OneDrive/Documents/Selenium/drivers/geckodriver-v0.24.0-win64//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exPath);
		
		driver = new FirefoxDriver();
		String baseUrl = "http://demo.guru99.com/v4";
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	
	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable
	{
		System.out.println("#####################");
		System.out.println("This Step enter the Username and Password on the login page");
	}
	
	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable
	{
		System.out.println("#####################");
		System.out.println("This Step click on the Reset button");
	}

}
