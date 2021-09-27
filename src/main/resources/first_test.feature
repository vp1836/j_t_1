Feature: I want to test Login Page

  Scenario: I want to login
    Given I go to Main Page
    When I enter credentials login "standard_user" with password "secret_sauce"
    And I click login
    Then I should see Products page