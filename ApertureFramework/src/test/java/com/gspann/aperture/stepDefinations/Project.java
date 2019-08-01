package com.gspann.aperture.stepDefinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gspann.aperture.pages.Actions.ProjectAction;
import com.gspann.aperture.pages.Locators.ProjectLocator;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;

public class Project {

	ProjectAction pc = new ProjectAction();
	Logger log = Logger.getLogger("Project.class");

	ProjectLocator al1 = null;

	public Project() {
		this.al1 = new ProjectLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), al1);
	}

	@When("^User click on Project from Header$")
	public void user_click_on_Project_from_Header() throws Throwable {
		pc.clickProject();
		Thread.sleep(5000);
	}

	@Then("^User able to see Project landing page$")
	public void user_able_to_see_Project_landing_page() throws Throwable {
		Assert.assertEquals(pc.Projectdisplay(), true);
	}

	@When("^User click on Add Project in Project page$")
	public void user_click_on_Add_Project_in_Project_page() throws Throwable {
		pc.clickAddProject();
	}

	@Then("^User Enter \"([^\"]*)\" Account$")
	public void user_Enter_Account(String Account) throws Throwable {
		al1.ClickAccount.click();
		al1.ClickAccount.sendKeys(Account);
		Thread.sleep(3000);
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

	}

	@Then("^User Enter \"([^\"]*)\" CustomerProjectCode$")
	public void user_Enter_CustomerProjectCode(String CustomerProjectCode) throws Throwable {
		al1.CustomerProjectCode.sendKeys(CustomerProjectCode);

	}

	@Then("^User Enter \"([^\"]*)\" CustomerContactPerson$")
	public void user_Enter_CustomerContactPerson(String CustomerContactPerson) throws Throwable {
		al1.CustomerContactPerson.sendKeys(CustomerContactPerson);

	}

	@Then("^User Enter \"([^\"]*)\" CustomerProjectName$")
	public void user_Enter_CustomerProjectName(String CustomerProjectName) throws Throwable {
		al1.CustomerProjectName.sendKeys(CustomerProjectName);

	}

	@Then("^User Enter \"([^\"]*)\" ProjectName$")
	public void user_Enter_ProjectName(String ProjectName) throws Throwable {
		al1.ProjectName.sendKeys(ProjectName);

	}

	@Then("^User Enter \"([^\"]*)\" OffShoreManager$")
	public void user_Enter_OffShoreManager(String OffShoreManager) throws Throwable {
		al1.OffShore.click();
		al1.OffShore.sendKeys(OffShoreManager);
		Thread.sleep(3000);
		Actions off = new Actions(SeleniumDriver.getDriver());
		off.sendKeys(Keys.DOWN).build().perform();
		off.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

	}

	@Then("^User Enter \"([^\"]*)\" OnShoreManager$")
	public void user_Enter_OnShoreManager(String OnShoreManager) throws Throwable {
		al1.OnShore.click();
		al1.OnShore.sendKeys(OnShoreManager);
		Thread.sleep(3000);
		Actions off = new Actions(SeleniumDriver.getDriver());
		off.sendKeys(Keys.DOWN).build().perform();
		off.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
	}

	@Then("^User Select Type$")
	public void user_Select_Type() throws Throwable {
		pc.clickProjectType();
	}

	@Then("^User select Practices$")
	public void user_select_Practices() throws Throwable {
		pc.clickPractice();
	}

	@Then("^User select Status$")
	public void user_select_Status() throws Throwable {
		pc.clickStatus();
	}

	@Then("^User select Technologies$")
	public void user_select_Technologies() throws Throwable {
		pc.clickTechnologies();
	}

	@Then("^User change Country$")
	public void user_change_Country() throws Throwable {
		al1.Country.clear();
		al1.Country.sendKeys("India");
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();

	}

	@Then("^User Enter  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Enter_and(String StartDate, String EndDate) throws Throwable {
		al1.StartDate.sendKeys(StartDate);
		Thread.sleep(3000);
		al1.EndDate.sendKeys(EndDate);
		Thread.sleep(3000);

	}

	@Then("^User click on Create Project to create project$")
	public void user_click_on_Create_Project_to_create_project() throws Throwable {
		pc.clickCreateProjectBtn();
		Thread.sleep(5000);

	}

	@Then("^User able to see project create landing page$")
	public void user_able_to_see_project_create_landing_page() throws Throwable {
		Assert.assertEquals(pc.displayProject(), true);

	}

}