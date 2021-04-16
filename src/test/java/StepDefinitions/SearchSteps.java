package StepDefinitions;

import ProjectImplementation.Product;
import ProjectImplementation.Search;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class SearchSteps {
	
	Product product;
	Search search;

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
