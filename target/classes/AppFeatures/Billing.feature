
Feature: Calculate the billing amount

Scenario Outline: Billing Amount
Given User is on billing page
When User enters "<billingAmount>" and "<tax>"
And User clicks on generate bill button
Then "<finalAmount>" is displayed

	Examples:
	|	billingAmount	|	tax	|	finalAmount	|
	|	100						|	20	|	120					|
	|	500.23				| 50	|	550.23			|