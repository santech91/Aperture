Feature: Allocate Resource

Scenario Outline: Validate Allocate Resource
   
   Given  User navigate to Aperture website with Register Mail Id & Password "https://qa.aperture.gspann.com/#/"
    Then  User able to see Apertute landing page
    When  User click on Allocation from Header
    Then  User able to see Allocations landing page
    When  User click on Add Allocate
    Then  User able to see Add Allocation landing page
    Then  User select Account
    Then  User select SOW
    Then  User select Project
    Then  User select Allocation Type
    Then  User select Resource Type
    Then  User Enter search "<Resource>"
    Then  User Enter start date "<startdate>"
    Then  User pick end date "<EndDate>"
    Then  User Enter "<Occupancy>"
    Then  User select time tracking
    Then  User click on Allocate
    
         Examples:
                   | Resource      | startdate    | EndDate      | Occupancy |
                   | Santosh Kumar      | 25 Jul, 2019 | 26 Sep, 2019 | 80        |