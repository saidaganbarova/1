#Author: Saida

Feature: Hotel Verification
 

 @temps
  Scenario: Verify all the info before booking hotel
  
  	
    Given I am on home page
    When  I click on shop hotels
    And   I click on resorts
    And   I fill out all info 
    Then  I should be able to land on the next page
  
    
    When I selct free WIFI
    And  Selct the price
    Then I do some verification
  	
    When I verify all the information
    Then I should be able reserve
   
 
