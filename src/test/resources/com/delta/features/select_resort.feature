#Author: Saida


  Feature: Select the resort and verify all information


 @temp
   Scenario: Select and verify the selected resort 
  
    Given I am on home page
    
    Given I am on home page
    
    When  I click on shop hotels
    And   I click on resorts
    And   I fill out all info 
    Then  I should be able to land on the next page
  
    
    When I selct free WIFI
    And  Selct the price
    Then I do some verification

 
