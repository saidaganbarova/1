#Author: elshan guliyev



Feature: As a user I want to create an account so that I can manage my account
 

  @Elshan
  Scenario: sign up
    Given  I am on home page
    When I click on Sign Up button
    And I fill out all the required fields
    And I click on complete 
    Then I verify account is created

    
    
    
    
    
 @Iuliia
   Scenario Outline: Create multipe accounts using datatable
    Given  I am on home page
  	When I click on Sign Up button
  	
  	|firstNAme|lastName|address|city|postalCode|
  	|murad2020|Murad|Safarzade|murayoung@gmail.com|murad123|
  	
  	Then I shoudl be able to login
  	And The database user table should contain the corret information about the new user
  	