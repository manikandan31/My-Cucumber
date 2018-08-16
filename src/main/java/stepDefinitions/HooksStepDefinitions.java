package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HooksStepDefinitions {
	WebDriver driver;
	
	@Before
	public void setUp()
	{
		 System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Software\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 System.out.println("In Before");

	
	}
	
	@After
	public void tearDown(){
		
		driver.quit();
		System.out.println("In Teardown ");
	}

	@Given("^user is on loginpage$")
	public void user_is_on_loginpage() throws Throwable {
		 driver.get("https://www.freecrm.com/index.html");
		System.out.println("In Login page");
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("naveenk");
		 driver.findElement(By.name("password")).sendKeys("test@123");		
		System.out.println("Enter username and password ");

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		 WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", loginBtn);
		 System.out.println("Click Login button");
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		System.out.println("In Homepage");
	}


	
}
