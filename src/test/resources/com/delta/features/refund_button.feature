#Author: Murad

  Feature: Refund button functionality verifying
  
  @murad4
  Scenario: Cancel and Refund a flight
    
    Given I am on home page
   
    When I click on Search field
    And I click on Refunds
    And I click on Cancel a Flight
    And I fill out all info
    Then I should be able get Whoops Not Found Page

