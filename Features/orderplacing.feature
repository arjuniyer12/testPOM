Feature: Order placing

  Background: 
    Given user is on homepage

  Scenario: placing order
    When user click on a product
    And click on Buy now button
    Then login using username as "banktest@devmail.info" and password as "password"
    And click on login
    Then user should be able to view checkout page with title "Checkout"
    When user fill details and click on checkout submit
    Then order should be placed and thank you page should be displayed
