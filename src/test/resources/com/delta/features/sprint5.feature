#Author: Saida


 @sprint5
Feature: Testing using string

 
  Scenario: Verifying options
    Given I am on home page
    When click on shop hotel
    And click on "Hotels"
    Then I shoul be able land on 'Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations'

  
  Scenario: Verifying options
    Given I am on home page
    When click on shop hotel
    And click on "Find your booking"
    Then I shoul be able land on 'Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations'

  
  Scenario: Verifying options
    Given I am on home page
    When click on shop hotel
    And click on "Help"
    Then I shoul be able land on 'Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations'

  
  Scenario: Verify hotel details
    Given I am on home page
    When I click shop hotel
    And I enter all required information
    When I click  on "Hyatt House Austin/Downtown"
    Then The hotel details should be the following
      | hotelName                   | chechIn  | checkOut | rooms | adults | children |
      | Hyatt House Austin/Downtown | 09/28/20 | 10/04/20 |     1 |      2 |        0 |
    And click on search buttonn


  Scenario: Verify hotel details using cucumber custom type
    Given I am on home page
    When I click shop hotel
    And I enter all required information
    When I click  on "Hyatt House Austin/Downtown"
    Then The hotel details should be the following using custom type
      | hotelName                   | chechIn  | checkOut | rooms | adults | children |
      | Hyatt House Austin/Downtown | 09/28/20 | 10/04/20 |     1 |      2 |        0 |
    And click on search buttonn
    
    
 
  Scenario Outline: Verify confirmation field using multiple credentials  using SO
    Given I am on home page
    And  I click on uptaded bags & travel fees
    And  I clic on my trips
    When I click on confirmation number
    And  I enter "<First Name>" in the field
    And  I enter "<Last Name>" the field
    Then I enter "<Confirmation Number>"
    And  Verify the error text

    Examples: 
    
      | First Name | Last Name | Confirmation Number |                             
      | Alisa      | Keys      |   456672455953796   | 
      | John       | White     |   372901735708567   |
      | Bruno      | Mars      |   123455666783458   |   
      
    
    Scenario: Verify confirmation field using multiple credentials
         
          Given  I am on home page   
          When I click on my trips
          Then I should be able to submit with the following details
          | first name   | last name   | confirmation   |
          | Saida        | Ganbarova   | 35890372598    |
          
          
          And verify the text in the next page               
        