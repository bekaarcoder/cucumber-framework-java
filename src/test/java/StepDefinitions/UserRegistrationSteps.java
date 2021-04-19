package StepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class UserRegistrationSteps {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	    System.out.println("User is on registration page.");
	}

	@When("User enters the following details")
	public void user_enters_the_following_details(DataTable dataTable) {
	    List<List<String>> userLists =  dataTable.asLists(String.class);
	    
	    for(List<String> user : userLists) {
	    	System.out.println(user);
	    }
	}
	
	@When("User enters the following details with columns")
	public void user_enters_the_following_details_with_columns(DataTable dataTable) {
	    List<Map<String, String>> userMaps =  dataTable.asMaps(String.class, String.class);
	    for(Map<String, String> user : userMaps) {
	    	System.out.println(user.get("email"));
	    }
	}

	@Then("User is successfully registered")
	public void user_is_successfully_registered() {
	    System.out.println("User is successfully registered");
	}

}
