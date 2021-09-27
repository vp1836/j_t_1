Feature: I want to test Login Page

  Scenario: I want to login
    Given I go to Main Page
    When I enter credentials login "standard_user" with password "secret_sauce"
    And I click login
    Then I should see Products page

  Scenario Outline: I want to login with wrong credentials
    Given I go to Main Page
    When I enter credentials login "<login>" with password "<password>"
    And I click login
    Then I should see "<error_message>"

    Examples:
      | login | password | error_message                                                             |
      | lkjsd | lkjsdff  | Epic sadface: Username and password do not match any user in this service |
      | asdf  |          | Epic sadface: Password is required                                        |
      |       | fsldkjfs | Epic sadface: Username is required                                        |