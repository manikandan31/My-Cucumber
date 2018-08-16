//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
//
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//	   
//		
//		 System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Software\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		 driver.get("https://www.freecrm.com/index.html");
//
//	    
//	}
//
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() throws Throwable {
//		
//	}
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password){
//		 driver.findElement(By.name("username")).sendKeys(username);
//		 driver.findElement(By.name("password")).sendKeys(password);
//	    
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() throws Throwable {	
//		 WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();", loginBtn);
//	    
//	}
//
//	@Then("^user is on homepage$")
//	public void user_is_on_homepage() throws Throwable {
//	  
//	}
//
//
//}
