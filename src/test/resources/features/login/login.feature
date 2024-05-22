Feature: Login to SwagLabs
  Scenario: Successful login
    Given the user is on the login screen
    When the user enters valid credentials
    And the user clicks on the login button
    Then the user should see the title "PRODUCTS"
    And at least one item should be displayed