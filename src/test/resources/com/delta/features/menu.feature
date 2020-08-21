#Author: Murad
Feature: Explore Menus verification

  @murad5
  Scenario: Onboard Menu
   
    Given I am on home page
  
    When I click on Travel Info
    And I click Main Cabin
    And I click on Explore All Onboard Menus
    Then I should have land on Food and Drinks page
