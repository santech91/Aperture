package com.gspann.aperture.pages.Actions;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.gspann.aperture.pages.Locators.AccountLocator;

import cucumber.api.java.en.Then;
import utils.SeleniumDriver;

public class AccountAction {

	AccountLocator al = null;

	public AccountAction() {
		this.al = new AccountLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), al);
	}

	public void clickAccount() {
		al.Accountlink.click();
	}

	public boolean Accountdisplay() {
		return al.AccountHeading.isDisplayed();
	}

	public void clickAddAccount() {
		al.AddAccount.click();
	}

	public void clickCreateAccount() {
		al.CreateAccount.click();
	}

	public boolean displayAccount() {
		return al.AccountDisplay.isDisplayed();
	}

	public void clickReset() {
		al.Reset.click();
	}

}
