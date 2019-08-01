Feature: Gspann Aperture Resource Create

  Scenario Outline: Validate Create Resource
    
    Given User navigate to Aperture website with Register Mail Id & Password "http://35.241.9.55/#/"
    Then User able to see Apertute landing page
    When User click on Resource from header
    Then User click on Add Resource in Resource page
    Then User able to see Add New Resource landing page
    When User Enter Resource "<Name>"
    Then User Enter other Details
    Then User click on Save & Next
    Then User able to see next landing page
    Then User Enter Employee details type
    When User click on Create Resource
    And  User able to see Resource details landing page
    
    Examples:
            
             | Name          |
             |  Suman |
           #  | Raju Kumar    |
       
