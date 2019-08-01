package com.gspann.aperture.stepDefinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gspann.aperture.pages.Actions.ResourceAction;
import com.gspann.aperture.pages.Locators.AccountLocator;
import com.gspann.aperture.pages.Locators.ResourceLocator;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;

public class Resource {
	
	ResourceAction ra = new ResourceAction();
	Logger log = Logger.getLogger("Resource.class");
	ResourceLocator rl = null;
	
	public Resource() {
		this.rl = new ResourceLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), rl);
	}
	
	
	@When("^User click on Resource from header$")
	public void user_click_on_Resource_from_header() throws Throwable {
		ra.clickResource();
		Thread.sleep(9000);
	 
	}

	@Then("^User click on Add Resource in Resource page$")
	public void user_click_on_Add_Resource_in_Resource_page() throws Throwable {
		ra.clickAddResource();
		Thread.sleep(5000);
	}

	@Then("^User able to see Add New Resource landing page$")
	public void user_able_to_see_Add_New_Resource_landing_page() throws Throwable {
		Assert.assertEquals(ra.AddNewResourcedisplay(), true);
	}

	@When("^User Enter Resource \"([^\"]*)\"$")
	public void user_Enter_Resource(String Name) throws Throwable {
		rl.resourceName.sendKeys(Name);
	  }

	@Then("^User Enter other Details$")
	public void user_Enter_other_Details() throws Throwable {
		ra.clickgender();
		Thread.sleep(2000);
		ra.selectcompanyName();
		Thread.sleep(2000);
		ra.selectdepartment();
		Thread.sleep(2000);
		ra.selectdesignation();
		Thread.sleep(2000);
		ra.selectbaselocation();
		Thread.sleep(2000);
		ra.selectjoiningDate();
		Thread.sleep(2000);
		ra.selectpractices();
		Thread.sleep(2000);
		ra.PrimarySkills();
		Thread.sleep(2000);
		ra.SecondarySkills();
		//Thread.sleep(15000);
		//ra.SelectProfilePicture();
		//Thread.sleep(15000);
		//ra.SelecResume();
		Thread.sleep(2000);
	    
	}

	@Then("^User click on Save & Next$")
	public void user_click_on_Save_Next() throws Throwable {
		ra.clickonSaveNext();
		Thread.sleep(5000);
	   
	}

	@Then("^User able to see next landing page$")
	public void user_able_to_see_next_landing_page() throws Throwable {
		ra.selectEmployeeType();
		Thread.sleep(3000);
	   
	}

	@Then("^User Enter Employee details type$")
	public void user_Enter_Employee_details_type() throws Throwable {
		ra.selectCurrency();
		Thread.sleep(2000);
		ra.fillSalary();
		Thread.sleep(2000);
		ra.fillComission();
		Thread.sleep(2000);
		ra.fillAnnualBonus();
		Thread.sleep(2000);
		ra.fillOther();
		Thread.sleep(2000);
		ra.fillComment();
		Thread.sleep(2000);
	    
	}

	@When("^User click on Create Resource$")
	public void user_click_on_Create_Resource() throws Throwable {
		ra.clickonCreateResource();
		Thread.sleep(2000);
		ra.clickonConfirm();
		Thread.sleep(5000);
	    
	}

	@When("^User able to see Resource details landing page$")
	public void user_able_to_see_Resource_details_landing_page() throws Throwable {
		Assert.assertEquals(ra.OnBoardisdisplay(), true);
		   
	   
	}


	
	
}