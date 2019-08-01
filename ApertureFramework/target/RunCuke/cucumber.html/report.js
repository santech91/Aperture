$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/OrderToCash.feature");
formatter.feature({
  "line": 1,
  "name": "Gspann Apeture SOW Create",
  "description": "",
  "id": "gspann-apeture-sow-create",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate OrderToCash",
  "description": "",
  "id": "gspann-apeture-sow-create;validate-ordertocash",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User navigate to Aperture website with Register Mail Id \u0026 Password \"https://qa.aperture.gspann.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User able to see Apertute landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User click on OrderTOCash",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User able to see drop-down value of SOW",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click on SOW",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User able to see landing page of SOW",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click On AddSOW",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User select Account in SOW",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User Enter \"\u003cSOWname\u003e\" SOWname",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Select \"\u003cStartDate\u003e\" StartDate",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Select \"\u003cEndDate\u003e\" EndDate",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User Select the Currency",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User Enter \"\u003cMiscBill\u003e\" MiscBill",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User Enter \"\u003cRemarks\u003e\" Remarks",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User able to see WBS",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User Select the Project",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User Select the Alloction type Billable",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User Enter \"\u003cRollid\u003e\" IstRollid",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User Enter \"\u003cHourlyRate\u003e\" IstHourly",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User Enter \"\u003cContractedHour\u003e\" IstContractedHour",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User click on Action to Add Project",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Select the SecProject",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Select the Alloction type Non-Billable",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User Enter \"\u003cRollid2\u003e\" SecRollid",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User Enter \"\u003cContractedHour2\u003e\" SecContractedHour",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User click on Action to Add Project",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User Select the ThrProject",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User Select the Alloction type Buffer",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User Enter \"\u003cRollid3\u003e\" ThrRollId",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User Enter \"\u003cContractedHour3\u003e\" ThrContractedHour",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User click on Create button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User able to see SOW landing page",
  "keyword": "And "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "gspann-apeture-sow-create;validate-ordertocash;",
  "rows": [
    {
      "cells": [
        "SOWname",
        "StartDate",
        "EndDate",
        "MiscBill",
        "Remarks",
        "Rollid",
        "HourlyRate",
        "ContractedHour",
        "Rollid2",
        "ContractedHour2",
        "Rollid3",
        "ContractedHour3"
      ],
      "line": 40,
      "id": "gspann-apeture-sow-create;validate-ordertocash;;1"
    },
    {
      "cells": [
        "Test2",
        "30 Jul, 2019",
        "10 Aug, 2019",
        "10000",
        "Good",
        "Dev",
        "500",
        "100",
        "Testing",
        "100",
        "Devops",
        "100"
      ],
      "line": 41,
      "id": "gspann-apeture-sow-create;validate-ordertocash;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6672527300,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Validate OrderToCash",
  "description": "",
  "id": "gspann-apeture-sow-create;validate-ordertocash;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User navigate to Aperture website with Register Mail Id \u0026 Password \"https://qa.aperture.gspann.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User able to see Apertute landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User click on OrderTOCash",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User able to see drop-down value of SOW",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click on SOW",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User able to see landing page of SOW",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click On AddSOW",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User select Account in SOW",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User Enter \"Test2\" SOWname",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Select \"30 Jul, 2019\" StartDate",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Select \"10 Aug, 2019\" EndDate",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User Select the Currency",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User Enter \"10000\" MiscBill",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User Enter \"Good\" Remarks",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User able to see WBS",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User Select the Project",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User Select the Alloction type Billable",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User Enter \"Dev\" IstRollid",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User Enter \"500\" IstHourly",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User Enter \"100\" IstContractedHour",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User click on Action to Add Project",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Select the SecProject",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Select the Alloction type Non-Billable",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User Enter \"Testing\" SecRollid",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User Enter \"100\" SecContractedHour",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User click on Action to Add Project",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User Select the ThrProject",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User Select the Alloction type Buffer",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User Enter \"Devops\" ThrRollId",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User Enter \"100\" ThrContractedHour",
  "matchedColumns": [
    11
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User click on Create button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User able to see SOW landing page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://qa.aperture.gspann.com",
      "offset": 68
    }
  ],
  "location": "Login.user_navigate_to_Aperture_website_with_Register_Mail_Id_Password(String)"
});
formatter.result({
  "duration": 76847373500,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_able_to_see_Apertute_landing_page()"
});
formatter.result({
  "duration": 5077429300,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_click_on_OrderTOCash()"
});
formatter.result({
  "duration": 3084590600,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_able_to_see_drop_down_value_of_SOW()"
});
formatter.result({
  "duration": 32786300,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_click_on_SOW()"
});
formatter.result({
  "duration": 3067507800,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_able_to_see_landing_page_of_SOW()"
});
formatter.result({
  "duration": 41936600,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_click_On_AddSOW()"
});
formatter.result({
  "duration": 3174467900,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_select_Account_in_SOW()"
});
formatter.result({
  "duration": 5189904500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test2",
      "offset": 12
    }
  ],
  "location": "OrderToCash.user_Enter_SOWname(String)"
});
formatter.result({
  "duration": 86436200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30 Jul, 2019",
      "offset": 13
    }
  ],
  "location": "OrderToCash.user_Select_StartDate(String)"
});
formatter.result({
  "duration": 226569500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10 Aug, 2019",
      "offset": 13
    }
  ],
  "location": "OrderToCash.user_Select_EndDate(String)"
});
formatter.result({
  "duration": 140408600,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_Select_the_Currency()"
});
formatter.result({
  "duration": 2166127500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10000",
      "offset": 12
    }
  ],
  "location": "OrderToCash.user_Enter_MiscBill(String)"
});
formatter.result({
  "duration": 163889800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Good",
      "offset": 12
    }
  ],
  "location": "OrderToCash.user_Enter_Remarks(String)"
});
formatter.result({
  "duration": 94126400,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_able_to_see_WBS()"
});
formatter.result({
  "duration": 34374600,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_Select_the_Project()"
});
formatter.result({
  "duration": 2167141100,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_Select_the_Alloction_type_Billable()"
});
formatter.result({
  "duration": 2161996700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dev",
      "offset": 12
    }
  ],
  "location": "OrderToCash.user_Enter_IstRollid(String)"
});
formatter.result({
  "duration": 101930400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 12
    }
  ],
  "location": "OrderToCash.user_Enter_IstHourly(String)"
});
formatter.result({
  "duration": 120152500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 12
    }
  ],
  "location": "OrderToCash.user_Enter_IstContractedHour(String)"
});
formatter.result({
  "duration": 114072800,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_click_on_Action_to_Add_Project()"
});
formatter.result({
  "duration": 141960100,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_Select_the_SecProject()"
});
formatter.result({
  "duration": 2155884200,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_Select_the_Alloction_type_Non_Billable()"
});
formatter.result({
  "duration": 2158714200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testing",
      "offset": 12
    }
  ],
  "location": "OrderToCash.user_Enter_SecRollid(String)"
});
formatter.result({
  "duration": 200140800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 12
    }
  ],
  "location": "OrderToCash.user_Enter_SecContractedHour(String)"
});
formatter.result({
  "duration": 116428200,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_click_on_Action_to_Add_Project()"
});
formatter.result({
  "duration": 104188600,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_Select_the_ThrProject()"
});
formatter.result({
  "duration": 2130036300,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_Select_the_Alloction_type_Buffer()"
});
formatter.result({
  "duration": 6178816400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Devops",
      "offset": 12
    }
  ],
  "location": "OrderToCash.user_Enter_ThrRollId(String)"
});
formatter.result({
  "duration": 149980200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 12
    }
  ],
  "location": "OrderToCash.user_Enter_ThrContractedHour(String)"
});
formatter.result({
  "duration": 118842200,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_click_on_Create_button()"
});
formatter.result({
  "duration": 3079300000,
  "status": "passed"
});
formatter.match({
  "location": "OrderToCash.user_able_to_see_SOW_landing_page()"
});
formatter.result({
  "duration": 35202500,
  "status": "passed"
});
formatter.after({
  "duration": 1127044500,
  "status": "passed"
});
});