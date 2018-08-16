//package stepDefinitions;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//public class TaggedHooksStepDefinitions {
//
//	@Before
//	public void setUp(){
//		System.out.println("Inside Before");
//	}
//
//	@After
//	public void tearDown(){
//		System.out.println("Inside After");
//	}
//	
//	@Before("@Second")
//	public void setUpAccessMyfamily(){
//		System.out.println("Inside setUpAccessMyfamily");
//	}
//	
//	@Before("@Third")
//	public void setUpTransferGroup(){
//		System.out.println("Inside setUpTransferGroup");
//	}
//
//	
//	@After("@Second")
//	public void removeAccessMyfamily(){
//		System.out.println("Inside removeAccessMyfamily");
//	}
//	
//	@After("@Third")
//	public void removeTransferGroup(){
//		System.out.println("Inside removeTransferGroup");
//	}
//	
//	@Given("^user is on Loginpage$")
//	public void user_is_on_Loginpage() throws Throwable {
//		System.out.println("Inside  Fist Scenario Given");
//	}
//
//	@Then("^user logs into homepage$")
//	public void user_logs_into_homepage() throws Throwable {
//
//	}
//
//	@Given("^user is on homepage$")
//	public void user_is_on_homepage() throws Throwable {
//		System.out.println("Inside  Second Scenario Given");
//	}
//
//	@Then("^User creates a child$")
//	public void user_creates_a_child() throws Throwable {
//
//	}
//
//	@Given("^Child is created by User$")
//	public void child_is_created_by_User() throws Throwable {
//		System.out.println("Inside  Third Scenario Given");
//	}
//
//	@Then("^User creates an A&T application$")
//	public void user_creates_an_A_T_application() throws Throwable {
//
//	}
//
//}
