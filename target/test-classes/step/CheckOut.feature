Feature: AddCart test

  Scenario Outline: Login functionality for a social networking site.
    Given user login to saucedemo
    When I enter Username as "<username>" and Password as "<password>"
    Then login should be unsuccessful
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario:Add First items to the shopping cart
    Given user starts shopping for the product
    When  user click ADD TO CARD
    Then AddCart should be unsuccessful and open Shopping Car

  Scenario Outline:user CheckOut
    Given user open Shopping Card And click CHECKOUT
    When  user enter FirstName as "<FirstName>" and LastName as "<LastName>" and Zip/PostalCode as "<Zip/PostalCode>"
    Then Whether the payment was successful
    Examples:
      | FirstName | LastName | Zip/PostalCode |
      | Sen       | Kou      | 100         |
      | Wen        | Ying      | 200         |
