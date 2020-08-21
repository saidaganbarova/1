#Author: Murad

Feature: Change Upgrade Seat functionality negative

  @murad1
  Scenario: Verify Change Upgrade Seat functionality 
  
    Given I am on home page
    When I click on Need Help?
    And I click on Seats Help
    And I click on Change/Upgrde Your Seat
    And I fill out all info
    Then I should be able get Whoops Not Found Page
