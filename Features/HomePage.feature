Feature: Home Page functionalities

  Background: 
    Given user is on homepage

  Scenario: Validate Home page functionalities
    When User gets title of the page
    Then homepage title should be "Zestimcart"
