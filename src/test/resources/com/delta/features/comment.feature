#Author: Murad
Feature: Comment/Complain verification

  @murad1
  Scenario: Verify that user can leave comment
    
    Given I am on home page
    And click on need help button
    Then I click on Give feedback
    And click on Did you find the information you were looking for on this page?
    And click on yes
    Then fill out feedback form
    And click submit
