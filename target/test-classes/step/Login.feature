Feature: Scenario Outline


  Scenario Outline: Login functionality for a social networking site.
    Given user login to saucedemo
    When I enter Username as "<username>" and Password as "<password>"
    Then login should be unsuccessful
    Examples:
      | username      | password     |
      | username1     | password1    |
      | username2     | password2    |
      | standard_user | secret_sauce |