Feature: User Registration feature

  Scenario: Register multiple users with data
    Given User is on registration page
 		When User enters the following details
      | John  | Doe | johndoe@gmail.com  |
      | Jane  | Doe | janedoe@gmail.com  |
    Then User is successfully registered

    
  Scenario: Register multiple users with data with columns
  Given User is on registration page
	When User enters the following details with columns
		|	firstname	|	lastname	|	email							 |
    | John  		| Doe 			| johndoe@gmail.com  |
    | Jane  		| Doe 			| janedoe@gmail.com  |
  Then User is successfully registered