Feature: Gspann Aperture Login

  Scenario: Validate Login page
    Given User navigate to Aperture website with Register Mail Id & Password "https://qa.aperture.gspann.com"
    Then  User able to see Apertute landing page
    When  User click on "My-Profile" under name
    Then  User able to see Profile landing page
    When  User click on "History"
    Then  User able see history details landingpage
    And   User click on "Sign-out" able to logout
