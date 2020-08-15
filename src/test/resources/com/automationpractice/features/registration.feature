

Feature: User registration
  

   
  Scenario: Registering  a single  user
    Given I am on homepage
    When I click on sign in button
    And I enter a valid email 
    Then I should be able to register with the following details
      | First name| Last name| Password  | Address              | City       | Zip   | Phone no   |
      | Joe       | Biden    | jbiden    | 1 Observatory Circle | Washington | 20000 | 2026666666 |
      

 