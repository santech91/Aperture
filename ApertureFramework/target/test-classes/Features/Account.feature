Feature: Create Account

Scenario Outline: Validate Create Account
   
   Given  User navigate to Aperture website with Register Mail Id & Password "https://qa.aperture.gspann.com/#/"
    Then  User able to see Apertute landing page
    When  User click on Account from header
    Then  User able to see Account landing page
    When  User click on Add Account button
    Then  User Enter "<EnterCustomerGroup>" EnterCustomerGroup
    Then  User Enter "<CustomerName>" CustomerName
    Then  User Enter "<CustomerEntity>" CustomerEntity
    Then  User Enter "<CustomerContactPerson>" CustomerContactPerson 
    Then  User search "<Manager>" Manager
    Then  User change Country 
    Then  User Enter "<ContactPersonEmail>" ContactPersonEmail
    Then  User Enter "<ContactPersonMobileNo>" ContactPersonMobileNo
    Then  User click on Create Account 
    And   User able to see Account create landing page
    
    Examples: 
    
 |EnterCustomerGroup| CustomerName | CustomerEntity |CustomerContactPerson| Manager | ContactPersonEmail |ContactPersonMobileNo|
            
 |       ECOM      | WSI#         | WSI9           | Ella                |  Santosh | b5@gmail.com      | 4345678988          |

# |        MCOM     | Ac1          | Mcos1          | Jam                 |Meenakshi |a5@gmail.com       | 2446574747         |
# |        MCOM     | Ab6          | Mcom3          | Jams                |Santosh   |a6@gmail.com       | 2546574747         |