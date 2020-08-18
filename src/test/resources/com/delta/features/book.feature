#Author: Saida


Feature: Verification book page
 @temp
  Scenario:  Verify that the user can enter all information and land on the next page
    Given  I am on home page
    When   I click on from button and enter a destination
    And    when I click on to button and enter a destinatin 
    And    when I click on trip button and select one
    And    when select the dates and passenger amount 
    And    yet when I click on submit button
    Then   I shoul be able to land on the next page
   

 
  