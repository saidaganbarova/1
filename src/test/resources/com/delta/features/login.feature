#Author: iuliia young
Feature: login

  
  Scenario: Login
    Given I am on the homepage
		When I click on LogIn 
  	Then I logged in

   
  Scenario: Login and confirm DOB and name
    Given I am on the homepage
    When I click on LogIn
    Then I logged in
    And I click on my name and pick profile
    Then I confirm my name and my DOB

 
  Scenario: Add Passport Info and Doublecheck it
    Given I am on the homepage
    When I click on LogIn
    Then I logged in
     And I click on my name and pick profile
    And Add Passport Info
    Then Confirm allert present

   
  Scenario: Delete Passport Info
    Given I am on the homepage
    When I click on LogIn
    Then I logged in
     And I click on my name and pick profile
    And I clicked on passport and deleted info
    Then Passport info is deleted
    
    
  
  Scenario: While adding passport info display error
    Given I am on the homepage
    When I click on LogIn
    Then I logged in
     And I click on my name and pick profile
   	And Try to add passport info
   	Then confirm error is displayed
   	
    
    
    
  #parametrs
  
    Scenario: Login with parametrs
    	Given I am on the homepage
    	When I login with parametrs
    	And I enter "caffeine4130" and "Mooncat123!" 
    	Then I logged in
    	
    	
    	
    	#use of excel file 
    	
   Scenario: Login with excel
    	Given I am on the homepage
   		And Use excel File to enter login info 
    	Then I logged in 	

    	
  
  @iuliia
    Scenario Outline: Title of your scenario outline
  	Given I am on the homepage
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
  
    	
    	
    