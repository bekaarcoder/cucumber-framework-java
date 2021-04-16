Feature: Uber Booking Feature

Scenario: Book an uber
Given User is on the homepage of Uber App
When User selects car as "Sedan"
And User select pickup point as "Noida" and drop point as "Gurugram"
Then Driver starts the journey
And Driver ends the journey
Then User pays 500 rupees