package com.gspann.aperture.pages.Actions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.gspann.aperture.pages.Locators.ResourceLocator;

import cucumber.api.DataTable;
import utils.SeleniumDriver;

public class ResourceAction {

	ResourceLocator rl = null;

	public ResourceAction() {
		this.rl = new ResourceLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), rl);
	}

	public void clickResource() {
		rl.Resource.click();
	}

	public void clickAddResource() {
		rl.AddResource.click();
	}

	public boolean AddNewResourcedisplay() {
		return rl.AddNewResource.isDisplayed();
	}

	public void EnterresourceName(DataTable Data) throws InterruptedException{
		for (Map<String, String> field : Data.asMaps(String.class, String.class)) {
            rl.resourceName.sendKeys(field.get("Name"));
		}
	}
            
	
	public void clickgender() {
		rl.Male.click();
	}

	public void selectcompanyName() throws InterruptedException {
		rl.companyName.click();
		Thread.sleep(2000);
		rl.company.click();
	}

	public void selectdepartment() throws InterruptedException {
		rl.department.click();
		Thread.sleep(2000);
		rl.Technical.click();
	}

	public void selectdesignation() throws InterruptedException {
		rl.designation.click();
		Thread.sleep(2000);
		rl.SeniorSoftwareEngineer.click();
	}

	public void selectbaselocation() throws InterruptedException {
		rl.baseLocation.click();
		Thread.sleep(2000);
		rl.GurgaonHaryanaIndia.click();
	}

	public void selectjoiningDate() {
		rl.joiningDate.sendKeys("31 Jul, 2019");
	}

	public void selectpractices() throws InterruptedException {
		rl.practices.click();
		Thread.sleep(2000);
		rl.Performance.click();
	}

	public void PrimarySkills() {
		rl.PrimarySkills.sendKeys("J");
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
	}

	public void SecondarySkills() {
		rl.SecondarySkills.sendKeys("j");
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
	}

	public void SelectProfilePicture() throws InterruptedException {
		rl.SelectProfilePicture.sendKeys("E:\\upload\\pic.jpg");
		Thread.sleep(8000);
		rl.save.click();
	}

	public void SelecResume() {
		rl.SelectProfilePicture.sendKeys("E:\\upload\\resume.doc");
	}

	public void clickonSaveNext() {
		rl.SaveNext.click();
	}

	public void selectEmployeeType() {
		rl.employeeType.click();
	}

	public void selectCurrency() throws InterruptedException {
		rl.currency.click();
		Thread.sleep(2000);
		rl.INR.click();
	}

	public void fillSalary() {
		rl.salary.sendKeys("1000000");
	}

	public void fillComission() {
		rl.commision.sendKeys("10000");
	}

	public void fillAnnualBonus() {
		rl.Annualbonus.sendKeys("5000");
	}

	public void fillOther() {
		rl.other.sendKeys("2000");
	}

	public void fillComment() {
		rl.comments.sendKeys("Regular Employee");
	}

	public void clickonCreateResource() {
		rl.CreateResource.click();
	}

	public void clickonConfirm() {
		rl.Confirm.click();
	}

	public boolean OnBoardisdisplay() {
		return rl.OnBoard.isDisplayed();
	}

}
