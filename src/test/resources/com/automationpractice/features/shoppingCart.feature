Feature: Shopping cart
  @temp
  Scenario Outline: Verify Shopping cart
    Given I am on homepage
    When I click on "<product>"
    And when I increase the quantity to <quantity> and add to cart and proceed to checkout
    Then I verify the following details of the cart
     
      | <product> | <unit price> | <quantity> | <totalBefore> | <totalAfter> |

    Examples: 
      | product                        | unit price | quantity | totalBefore | totalAfter |
      | Faded Short Sleeve T-shirts |      16.51 |        3 |       49.53 |      51.53 |
      #| Blouse                      |      27.00 |        6 |      162.00 |     164.00 |
      #| Printed Dress               |      26.00 |        9 |      234.00 |     236.00 |
      #| Printed Summer Dress        |      28.98 |       30 |      869.40 |     871.40 |
      #| Printed Chiffon Dress       |      16.40 |       99 |     1623.60 |    1625.60 |
