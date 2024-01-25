Feature: Buying products

  Scenario: Buying products at SwagLabs
    Given UserTest login to SwagLabs app
    When adding products to the Shopping car
      | products                    |
      | Sauce Labs Backpack         |
      | Sauce Labs Fleece Jacket    |
    And complete the purchase form
    Then UserTest can complete his purchase and view the message "Thank you for your order!"