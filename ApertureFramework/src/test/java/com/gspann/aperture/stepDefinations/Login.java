package com.gspann.aperture.stepDefinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gspann.aperture.pages.Actions.LoginAction;
import com.gspann.aperture.pages.Locators.LoginLocator;
import com.gspann.aperture.pages.Locators.ProjectLocator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;

public class Login {
	LoginAction loginaction = new LoginAction();
	Logger log = Logger.getLogger("Login.class");

	LoginLocator login = null;

	public Login() {
		this.login = new LoginLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), login);
	}

	@Given("^User navigate to Aperture website with Register Mail Id & Password \"([^\"]*)\"$")
	public void user_navigate_to_Aperture_website_with_Register_Mail_Id_Password(String websiteURL) throws Throwable {
		SeleniumDriver.openPage(websiteURL);
		log.info("Login Sucessfully");
	}

	@Then("^User able to see Apertute landing page$")
	public void user_able_to_see_Apertute_landing_page() throws Throwable {
		Assert.assertEquals(loginaction.aperturelogodisplay(), true);
		log.info("Aperture Landing page is showing");
		Thread.sleep(5000);
		String Text = login.Name.getText();
		log.info("Account Name- " + Text);

	}

	@When("^User click on \"([^\"]*)\" under name$")
	public void user_click_on_under_name(String name) throws Throwable {
		loginaction.clickOnName();
		Thread.sleep(3000);
		loginaction.clickOnmyProfile();
		log.info("My Profile is Clickable");
		Thread.sleep(3000);
	}

	@Then("^User able to see Profile landing page$")
	public void user_able_to_see_Profile_landing_page() throws Throwable {
		Assert.assertEquals(loginaction.resourceDetailsdisplay(), true);
		log.info("My Profile Landing page is showing");
	}

	@When("^User click on \"([^\"]*)\"$")
	public void user_click_on(String history) throws Throwable {
		loginaction.clickOnHistory();
		log.info("History is clickable");
		Thread.sleep(3000);
	}

	@Then("^User able see history details landingpage$")
	public void user_able_see_history_details_landingpage() throws Throwable {
		Assert.assertEquals(loginaction.emailIddisplay(), true);
		log.info("History Landing page is showing");
	}

	@Then("^User click on \"([^\"]*)\" able to logout$")
	public void user_click_on_able_to_logout(String logout) throws Throwable {
		loginaction.clickOnName();
		Thread.sleep(3000);
		loginaction.clickOnsignOut();
		log.info("Log out Successfully");
	}

}
