package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before(order=1)
	public void beforeScenario1() {
		System.out.println("This will run before the Scenario1");
	}

	@After(order=2)
	public void afterScenario1() {
		System.out.println("This will run after the Scenario1");
	}
	@Before(order=2)
	public void beforeScenario2() {
		System.out.println("This will run before the Scenario2");
	}

	@After(order=1)
	public void afterScenario2() {
		System.out.println("This will run after the Scenario2");
	}

}
