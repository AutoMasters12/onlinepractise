package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flights {
	@Given("^User should be serach flights page$")
	public void user_should_be_serach_flights_page() throws Throwable {
		System.out.println("user in flights page");  
	}
	@When("^User should perform search flight with valid fields$")
	public void user_should_perform_search_flight_with_valid_fields() throws Throwable {
		System.out.println("performing serach flights with valid fields");
	}

	@Then("^User should navigate to list of flights page$")
	public void user_should_navigate_to_list_of_flights_page() throws Throwable {
		System.out.println("list of flights page");
	}

	@When("^User should perform search flight with invalid fields$")
	public void user_should_perform_search_flight_with_invalid_fields() throws Throwable {
		System.out.println("serach flighsusing in valid fields");
	}

	@Then("^User should get error msg$")
	public void user_should_get_error_msg() throws Throwable {
		System.out.println("error msg");
	}


}
