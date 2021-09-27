Feature: I want to add all products to cart

  Scenario: Click add to cart on every product
    Given I go to Main paige
    When I enter credentials login "standard_user" with password "secret_sauce" and click login
    And I click Add to cart on every product
    Then I should see "6" products in the cart