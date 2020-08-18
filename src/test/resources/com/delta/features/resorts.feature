#Author:Saida

Feature: Resorts book verification 
 
 
  Scenario: Verify the user can book Resorts
  
    Given I am on home page
    
    When  I click on shop hotels
    And   I click on resorts
    And   I fill out all info 
    Then  I should be able to land on the next page
  

 
 