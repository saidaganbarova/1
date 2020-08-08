Feature: Verify product information

  Scenario: Verify product name
    Given I am on homepage
    When I click on Blouse
    Then The product name should be Blouse in the product page

  Scenario: Verify product name using parametrization
    Given I am on homepage
    When I click on 'Printed Chiffon Dress'
    Then The product name should be correct

  Scenario: Verify product name using parametrization
    Given I am on homepage
    When I click on 'Printed Summer Dress'
    Then The product name should be correct

  
  Scenario: Verify default product quantity
    Given I am on homepage
    When I click on 'Faded Short Sleeve T-shirts'
    Then The product quantity should be 67 and the product price should be 16.51
    
    
    @temp
  Scenario: Verify plus minus buttons
    Given I am on homepage
    When I click on 'Faded Short Sleeve T-shirts'
    And I click on plus button 5 times
    Then The quantity should be correct
    And I click on minus button 5 times
    And I click on another button 5 times
    And I click on h button 5 times
    
