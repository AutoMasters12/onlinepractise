package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	@Given("^User navigate to the login page$")
	public void user_navigate_to_the_login_page() throws Throwable {
	   System.out.println("login page");
	}

	@When("^User submit username and password$")
	public void user_submit_username_and_password() throws Throwable {
		   System.out.println("enters userid, pswd and submit");
	}

	@Then("^User should in home page$")
	public void user_should_in_home_page() throws Throwable {
		   System.out.println("hompage");
	}
	@When("^User submit \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_submit_and(String userid, String pswd) throws Throwable {
	   System.out.println("userid :"+userid);
	   System.out.println("pswd :"+pswd);
	}

}
