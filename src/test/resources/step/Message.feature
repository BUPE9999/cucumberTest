Feature: Message subscribed

  Scenario Outline:
    Given user Test
    When the Name as "<name>"  and Email Address as "<email>" and the "<message>" as message
    Then  submit button clicked
    Examples:
      | name             | email            | message                                                |
      | newsletter-input | 123123           | Newsletter : Invalid email address.
      | newsletter-input | abcd.com         | Newsletter : Invalid email address.                    |
      | newsletter-input | abcdef@email.com | Newsletter : This email address is already registered. |
