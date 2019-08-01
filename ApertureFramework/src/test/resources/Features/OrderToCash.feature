Feature: Gspann Apeture SOW Create

  Scenario Outline: Validate OrderToCash
   
   Given User navigate to Aperture website with Register Mail Id & Password "https://qa.aperture.gspann.com/#/"
    Then User able to see Apertute landing page
    When User click on OrderTOCash
    Then User able to see drop-down value of SOW
    When User click on SOW
    Then User able to see landing page of SOW
    Then User click On AddSOW
    Then User select Account in SOW
    Then User Enter "<SOWname>" SOWname
    Then User Select "<StartDate>" StartDate
    Then User Select "<EndDate>" EndDate
    Then User Select the Currency 
    Then User Enter "<MiscBill>" MiscBill
    Then User Enter "<Remarks>" Remarks
    Then User able to see WBS
    Then User Select the Project
    Then User Select the Alloction type Billable
    Then User Enter "<Rollid>" IstRollid
    Then User Enter "<HourlyRate>" IstHourly
    Then User Enter "<ContractedHour>" IstContractedHour
    Then User click on Action to Add Project
    Then User Select the SecProject
    Then User Select the Alloction type Non-Billable
    Then User Enter "<Rollid2>" SecRollid
    Then User Enter "<ContractedHour2>" SecContractedHour
    Then User click on Action to Add Project
    Then User Select the ThrProject
    Then User Select the Alloction type Buffer
    Then User Enter "<Rollid3>" ThrRollId
    Then User Enter "<ContractedHour3>" ThrContractedHour
    When User click on Create button
    And  User able to see SOW landing page
    
    Examples: 
    
 |SOWname|StartDate   |EndDate     |MiscBill|Remarks|Rollid|HourlyRate|ContractedHour|Rollid2|ContractedHour2|Rollid3|ContractedHour3|
 | Test2  |30 Jul, 2019|10 Aug, 2019|  10000 | Good  | Dev  |    500   |    100       |Testing| 100           | Devops| 100           |
 
 
 