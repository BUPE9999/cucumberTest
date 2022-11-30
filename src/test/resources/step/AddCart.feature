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