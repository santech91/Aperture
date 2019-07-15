$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Account.feature");
formatter.feature({
  "line": 1,
  "name": "Gspann Aperture Account Create",
  "description": "",
  "id": "gspann-aperture-account-create",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9507754500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Account Create",
  "description": "",
  "id": "gspann-aperture-account-create;verify-account-create",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigate to Aperture website with Register Mail Id \u0026 Password \"https://qa.aperture.gspann.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User able to see Apertute landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User click on \"Account\" from header",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User able to see Account landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on \"Add Account\" in Account page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User able to see Account landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User fill-up form",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on \"Create Account\" to create Account",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User able to see Account create landing page",
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
  "duration": 22967002100,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_able_to_see_Apertute_landing_page()"
});
formatter.result({
  "duration": 38790900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account",
      "offset": 15
    }
  ],
  "location": "Account.user_click_on_from_header(String)"
});
formatter.result({
  "duration": 5174845100,
  "status": "passed"
});
formatter.match({
  "location": "Account.user_able_to_see_Account_landing_page()"
});
formatter.result({
  "duration": 34528500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add Account",
      "offset": 15
    }
  ],
  "location": "Account.user_click_on_in_Account_page(String)"
});
formatter.result({
  "duration": 140816700,
  "status": "passed"
});
formatter.match({
  "location": "Account.user_able_to_see_Account_landing_page()"
});
formatter.result({
  "duration": 32896600,
  "status": "passed"
});
formatter.match({
  "location": "Account.user_fill_up_form()"
});
formatter.result({
  "duration": 33344010500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create Account",
      "offset": 15
    }
  ],
  "location": "Account.user_click_on_to_create_Account(String)"
});
formatter.result({
  "duration": 5081964000,
  "status": "passed"
});
formatter.match({
  "location": "Account.user_able_to_see_Account_create_landing_page()"
});
formatter.result({
  "duration": 30033831400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[contains(text(),\u0027Account:\u0027)]\"}\n  (Session info: chrome\u003d75.0.3770.100)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027NODE772\u0027, ip: \u0027192.168.43.31\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 75.0.3770.100, chrome: {chromedriverVersion: 75.0.3770.90 (a6dcaf7e3ec6f..., userDataDir: C:\\Users\\SANTOS~1.KUM\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:61301}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 8d2eb9f994d3cd5f453a4deacda768cf\n*** Element info: {Using\u003dxpath, value\u003d//span[contains(text(),\u0027Account:\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat pages.Actions.AccountAction.displayAccount(AccountAction.java:88)\r\n\tat stepDefinations.Account.user_able_to_see_Account_create_landing_page(Account.java:63)\r\n\tat ✽.And User able to see Account create landing page(Account.feature:12)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1649919400,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Gspann Aperture Login",
  "description": "",
  "id": "gspann-aperture-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6464076900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Login page",
  "description": "",
  "id": "gspann-aperture-login;verify-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigate to Aperture website with Register Mail Id \u0026 Password \"https://qa.aperture.gspann.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User able to see Apertute landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User click on \"My-Profile\" under name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User able to see Profile landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on \"History\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User able see history details landingpage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on \"Sign-out\" able to logout",
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
  "duration": 80712843000,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_able_to_see_Apertute_landing_page()"
});
formatter.result({
  "duration": 33518100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My-Profile",
      "offset": 15
    }
  ],
  "location": "Login.user_click_on_under_name(String)"
});
formatter.result({
  "duration": 8864505800,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_able_to_see_Profile_landing_page()"
});
formatter.result({
  "duration": 3574420800,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:135)\r\n\tat org.testng.Assert.assertEquals(Assert.java:116)\r\n\tat org.testng.Assert.assertEquals(Assert.java:305)\r\n\tat org.testng.Assert.assertEquals(Assert.java:315)\r\n\tat stepDefinations.Login.user_able_to_see_Profile_landing_page(Login.java:41)\r\n\tat ✽.Then User able to see Profile landing page(Login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "History",
      "offset": 15
    }
  ],
  "location": "Login.user_click_on(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.user_able_see_history_details_landingpage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign-out",
      "offset": 15
    }
  ],
  "location": "Login.user_click_on_able_to_logout(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1669985000,
  "status": "passed"
});
});