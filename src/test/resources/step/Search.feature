Feature: Search

  Scenario Outline: Login functionality for a social networking site.
    Given user Search
    When user Search title is "<title>"
    Then Search should be successful
    Examples:
      | title |
      | java  |
      | 123   |
      |       |