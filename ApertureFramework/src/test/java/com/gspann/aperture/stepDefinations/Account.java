package com.gspann.aperture.stepDefinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.gspann.aperture.pages.Actions.AccountAction;
import com.gspann.aperture.pages.Locators.AccountLocator;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;

public class Account {

	AccountAction aa = new AccountAction();
	Logger log = Logger.getLogger("Account.class");

	AccountLocator al = null;

	public Account() {
		this.al = new AccountLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), al);
	}

	@When("^User click on Account from header$")
	public void user_click_on_Account_from_header() throws Throwable {
		aa.clickAccount();
		Thread.sleep(5000);

	}

	@Then("^User able to see Account landing page$")
	public void user_able_to_see_Account_landing_page() throws Throwable {
		Assert.assertEquals(aa.Accountdisplay(), true);

	}

	@When("^User click on Add Account button$")
	public void user_click_on_Add_Account_button() throws Throwable {
		aa.clickAddAccount();

	}

	@Then("^User Enter \"([^\"]*)\" EnterCustomerGroup$")
	public void user_Enter_EnterCustomerGroup(String EnterCustomerGroup) throws Throwable {
		al.customerGroup.sendKeys(EnterCustomerGroup);

	}

	@Then("^User Enter \"([^\"]*)\" CustomerName$")
	public void user_Enter_CustomerName(String CustomerName) throws Throwable {
		al.CustomerName.sendKeys(CustomerName);

	}

	@Then("^User Enter \"([^\"]*)\" CustomerEntity$")
	public void user_Enter_CustomerEntity(String CustomerEntity) throws Throwable {
		al.CustomerEntity.sendKeys(CustomerEntity);

	}

	@Then("^User search \"([^\"]*)\" Manager$")
	public void user_search(String Manager) throws Throwable {
		al.SearchManager.click();
		al.SearchManager.sendKeys(Manager);
		Thread.sleep(3000);
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();

	}

	@Then("^User Enter \"([^\"]*)\" ContactPersonEmail$")
	public void user_Enter_ContactPersonEmail(String ContactPersonEmail) throws Throwable {
		al.customerEmailId.sendKeys(ContactPersonEmail);

	}

	@Then("^User Enter \"([^\"]*)\" ContactPersonMobileNo$")
	public void user_Enter_ContactPersonMobileNo(String ContactPersonMobileNo) throws Throwable {
		al.customerContactNumber.sendKeys(ContactPersonMobileNo);
	}

	@Then("^User click on Create Account$")
	public void user_click_on_Create_Account() throws Throwable {
		aa.clickCreateAccount();
		Thread.sleep(5000);

	}

	@Then("^User able to see Account create landing page$")
	public void user_able_to_see_Account_create_landing_page() throws Throwable {
		Assert.assertEquals(aa.displayAccount(), true);
		String Text = al.AcountId.getText();
		log.info("Account Id- " + Text);

	}

}