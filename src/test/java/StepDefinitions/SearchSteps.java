package StepDefinitions;

import org.junit.Assert;

import ProjectImplementation.Product;
import ProjectImplementation.Search;
import io.cucumber.java.en.*;

public class SearchSteps {
	
	Product product;
	Search search;
	
	@Given("User is on Amazon login page")
	public void user_is_on_amazon_login_page() {
	    System.out.println("User is on Login page.");
	}

	@When("User enters username")
	public void user_enters_username() {
	    System.out.println("User enters username");
	}

	@When("User enters password")
	public void user_enters_password() {
	    System.out.println("User enters password");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	    System.out.println("User clicks login button");
	}

	@Then("User navigates to homepage")
	public void user_navigates_to_homepage() {
	    System.out.println("User navigates to amazon homepage");
	}

	@Given("I have a search field on Amazon home page")
	public void i_have_a_search_field_on_amazon_home_page() {
	    System.out.println("Step 1: I have a search field on Amazon home page");
	}

	@When("I search with keyword {string}")
	public void i_search_with_keyword(String productName) {
	    System.out.println("Step 2: I search with keyword " + productName);
	    product = new Product(productName);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	    System.out.println("Step 3: Product with name " + productName + " should be displayed");
	    search = new Search();
	    String productSearched = search.displayProduct(product);
	    System.out.println("Searched Product: " + productSearched);
	    Assert.assertEquals(product.getName(), productSearched);
	}
	
}
