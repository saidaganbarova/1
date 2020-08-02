

Feature: Login feature
As a customer, I want to be able to login using login page



	Scenario: Verify login page title
		
		
		Given I am on homepage
		When I click on sign in button
		Then I should land on login page and the title should be Login - My store



Scenario: Verify login page url
		
		
		Given I am on homepage
		When I click on sign in button
		Then I should land on login page and the url should be correct
