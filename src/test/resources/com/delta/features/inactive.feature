@Iuliia
   Scenario Outline: Create multipe accounts using datatable
    Given  I am on home page
  	When I click on Sign Up button
  	Then I fill out sign up application
  	
  	|firstNAme|lastName|address|city|postalCode|
  	| yulia|young|123 asd |asd@gmail.com|m123|
  	
  	Then I shoudl be able to login
  	And The database user table should contain the corret information about the new userAnd check more outcomes





  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
