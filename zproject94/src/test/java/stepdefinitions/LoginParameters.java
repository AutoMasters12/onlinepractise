package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginParameters {
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	 System.out.println("Homepage");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		 System.out.println("login page");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String usr, String pswd) throws Throwable {
		 System.out.println("user enter userid :"+usr+"pswd :"+pswd);
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		 System.out.println("successuful");
	}

}
