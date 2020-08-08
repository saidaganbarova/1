Feature: Login feature
  As a customer, I want to be able to login using login page

  Background: 
    Given I am on homepage
    When I click on sign in button

  @smoke
  Scenario: Verify login page title #Title
    As a user, I should be able to land on login page #Description

    Then I should land on login page and the title should be Login - My store

  @smoke 
  Scenario: Verify login page url
    Then I should land on login page and the url should be correct

  @smoke
  Scenario: Verify login page elements
    Then The username, password and login button elements should be enabled
