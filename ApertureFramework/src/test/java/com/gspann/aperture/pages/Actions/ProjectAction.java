package com.gspann.aperture.pages.Actions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.gspann.aperture.pages.Locators.ProjectLocator;

import cucumber.api.DataTable;
import utils.SeleniumDriver;

public class ProjectAction {

	ProjectLocator al1 = null;

	public ProjectAction() {
		al1 = new ProjectLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), al1);
	}

	public void clickProject() {
		al1.ProjectLink.click();
	}

	public boolean Projectdisplay() {
		return al1.ProjectHeading.isDisplayed();

	}

	public void clickAddProject() {
		al1.AddProject.click();
	}

	public void clickAccount() {
		al1.ClickAccount.click();
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		//al1.SelectAccount.click();
	}

	public void EnterProjectDetails(DataTable Data) throws InterruptedException {
		for (Map<String, String> field : Data.asMaps(String.class, String.class)) {
			al1.CustomerProjectCode.sendKeys(field.get("CustomerProjectCode"));
			Thread.sleep(2000);
			al1.CustomerContactPerson.sendKeys(field.get("CustomerContactPerson"));
			Thread.sleep(2000);
			al1.CustomerProjectName.sendKeys(field.get("CustomerProjectName"));
			Thread.sleep(2000);
			al1.ProjectName.sendKeys(field.get("ProjectName"));

		}
	}

	public void clickOffShore() throws Exception {
		al1.OffShore.sendKeys("meenakshi pandey");
		Thread.sleep(5000);
		al1.OffShoreEMPID.click();
	}

	public void clickOnShore() throws Exception {
		al1.OnShore.click();
		al1.OnShore.sendKeys("meenakshi pandey");
		Thread.sleep(5000);
		al1.OnShoreId.click();
	}

	public void clickProjectType() throws Exception {
		al1.ProjectType.click();
		Thread.sleep(2000);
		al1.AddType.click();
	}

	public void clickCountry() throws Exception {
		al1.Country.clear();
		al1.Country.sendKeys("India");
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
	}

	public void clickPractice() throws Exception {
		al1.Practices.click();
		Thread.sleep(3000);
		al1.SelectPractices.click();
		Thread.sleep(3000);
		al1.Backgroundclick.click();

	}

	public void clickStatus() throws Exception {
		al1.Status.click();
		Thread.sleep(3000);
		al1.Selectstatus.click();
	}

	public void clickTechnologies() throws Exception {
		al1.Technologies.click();
		Thread.sleep(3000);
		al1.SelectTechnologies.click();
	}

	public void clickStartDate() throws Exception {
		Thread.sleep(3000);

		al1.StartDate.click();
		Thread.sleep(3000);
		al1.SelectStartDate.click();
	}

	public void clickEndDate() throws Exception {
		al1.EndDate.click();
		Thread.sleep(3000);

		al1.SelectNextButton.click();
		Thread.sleep(3000);
		al1.SelectEndDate.click();
	}

	public void clickCreateProjectBtn() throws Exception {
		al1.CreateProject.click();
		Thread.sleep(2000);
	}
	
	public boolean displayProject() {
		return al1.Details.isDisplayed();

	}


}
