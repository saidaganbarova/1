#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Hotel Verification
 

 
  Scenario:Verify all the info before booking hotel
  
  	
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
   
 
