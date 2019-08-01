Feature: Gspann Aperture Project Create

  Scenario Outline: Validate Create Project
    Given User navigate to Aperture website with Register Mail Id & Password "https://qa.aperture.gspann.com/#/"
     Then User able to see Apertute landing page
    When User click on Project from Header
    When User click on Add Project in Project page
    Then User Enter "<Account>" Account 
    Then User Enter "<CustomerProjectCode>" CustomerProjectCode
    Then User Enter "<CustomerContactPerson>" CustomerContactPerson
    Then User Enter "<CustomerProjectName>" CustomerProjectName
    Then User Enter "<ProjectName>" ProjectName
    Then User Enter "<OffShoreManager>" OffShoreManager
    Then User Enter "<OnShoreManager>" OnShoreManager
    Then User Select Type
    Then User change Country 
    Then User select Practices
    Then User select Status
    Then User select Technologies
    Then User Enter  "<StartDate>" and "<EndDate>"
    Then User click on Create Project to create project
    And User able to see project create landing page

    Examples: 
  | Account | CustomerProjectCode | CustomerContactPerson | CustomerProjectName | ProjectName | OffShoreManager | OnShoreManager | StartDate   |   EndDate   |
  |  eco      | Aperture11         | msters                | apples             | Scrums       |        Santosh  |    Santosh     | 29 Jul, 2019| 10 Aug, 2019|
                                                                                                                                                   