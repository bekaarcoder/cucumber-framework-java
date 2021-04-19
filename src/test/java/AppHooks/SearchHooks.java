package AppHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SearchHooks {
	
	@Before
	public void setup(Scenario scenario) {
		System.out.println("Scenario Name: " + scenario.getName());
		System.out.println("Open the browser and launch application");
	}
	
	@After
	public void tearDown() {
		System.out.println("Close the browser");
	}

}
