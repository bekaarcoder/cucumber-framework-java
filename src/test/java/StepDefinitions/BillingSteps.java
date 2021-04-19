package StepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class BillingSteps {
	double amount;
	double tax;
	double finalAmount;
	
	@Given("User is on billing page")
	public void user_is_on_billing_page() {
	    System.out.println("User is on billing page");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String amount, String tax) {
	    this.amount = Double.parseDouble(amount);
	    this.tax = Double.parseDouble(tax);
	}

	@When("User clicks on generate bill button")
	public void user_clicks_on_generate_bill_button() {
	    System.out.println("User click generate button.");
	}

	@Then("{string} is displayed")
	public void is_displayed(String finalAmount) {
	    this.finalAmount = this.amount + this.tax;
	    Assert.assertTrue(this.finalAmount == Double.parseDouble(finalAmount));
	}

}
