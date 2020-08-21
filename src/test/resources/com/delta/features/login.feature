#Author: iuliia young
Feature: login

  
  Scenario: Click on Login
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
    
    
    @tempi 
  Scenario: While adding passport info display error
    Given I am on the homepage
    When I click on LogIn
    Then I logged in
     And I click on my name and pick profile
   	And Try to add passport info
   	Then confirm error is displayed
   	
    
    
    