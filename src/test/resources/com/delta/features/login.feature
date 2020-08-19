#Author: iuliia young
Feature: login

  @tag
  Scenario: Click on Login
    Given I am on the homepage
    When I click on LogIn
    Then I logged in

  @tag
  Scenario: Click on Login
    Given I am on the homepage
    When I click on LogIn
    Then I logged in
    And I click on my name and pick profile
    Then I confirm my name and my DOB
