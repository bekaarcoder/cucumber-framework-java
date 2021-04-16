Feature: Amazon Search

Scenario: Search a product
Given I have a search field on Amazon home page
When I search with keyword "Apple Macbook Pro"
Then Product with name "Apple Macbook Pro" should be displayed
