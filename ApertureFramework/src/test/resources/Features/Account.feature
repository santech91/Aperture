Feature:  Gspann Aperture Account Create

  Scenario: Verify Account Create
    Given User navigate to Aperture website with Register Mail Id & Password "https://qa.aperture.gspann.com"
    Then  User able to see Apertute landing page
    When  User click on "Account" from header
    Then  User able to see Account landing page
    When  User click on "Add Account" in Account page
    Then  User able to see Account landing page
    Then  User fill-up form
    Then  User click on "Create Account" to create Account 
    And   User able to see Account create landing page