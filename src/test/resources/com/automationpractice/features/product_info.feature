
Feature: Verify product information


@smoke
	Scenario: Verify product name
		Given I am on homepage
		When I click on Blouse
		Then The product name should be Blouse in the product page