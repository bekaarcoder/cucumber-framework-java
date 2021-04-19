Feature: Amazon Search

Background: 
	Given User is on Amazon login page
	When User enters username
	And User enters password
	And User click on Login button
	Then User navigates to homepage
	

Scenario: Search Apple Macbook on Amazon
Given I have a search field on Amazon home page
When I search with keyword "Apple Macbook Pro"
Then Product with name "Apple Macbook Pro" should be displayed

Scenario: Search Apple iPhone 12 on Amazon
Given I have a search field on Amazon home page
When I search with keyword "Apple iPhone 12"
Then Product with name "Apple iPhone 12" should be displayed
