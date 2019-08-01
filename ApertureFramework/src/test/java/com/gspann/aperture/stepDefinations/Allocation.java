package com.gspann.aperture.stepDefinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gspann.aperture.pages.Actions.AllocationAction;
import com.gspann.aperture.pages.Locators.AllocationLocator;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;

public class Allocation {
	
	AllocationAction ala = new AllocationAction();
	Logger log = Logger.getLogger("Account.class");
	
	AllocationLocator alo = null;

	public Allocation() {
		this.alo = new AllocationLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), alo);
	}
	
	@When("^User click on Allocation from Header$")
	public void user_click_on_Allocation_from_Header() throws Throwable {
	  ala.clickAllocation();
	  Thread.sleep(5000);
	}

	@Then("^User able to see Allocations landing page$")
	public void user_able_to_see_Allocations_landing_page() throws Throwable {
		Assert.assertEquals(ala.displayAllocation(), true);
	  
	}

	@When("^User click on Add Allocate$")
	public void user_click_on_Add_Allocate() throws Throwable {
		ala.clickAddAllocate();
	 
	}

	@Then("^User able to see Add Allocation landing page$")
	public void user_able_to_see_Add_Allocation_landing_page() throws Throwable {
		Assert.assertEquals(ala.displayAddAllocation(), true);
	  
	}

	@Then("^User select Account$")
	public void user_select_Account() throws Throwable {
	   ala.selectAccount();
	}

	@Then("^User select SOW$")
	public void user_select_SOW() throws Throwable {
		ala.selectSOW();
	   
	}

	@Then("^User select Project$")
	public void user_select_Project() throws Throwable {
		ala.selectProject();
	  
	}

	@Then("^User select Allocation Type$")
	public void user_select_Allocation_Type() throws Throwable {
		ala.selectAllocationType();
	  
	}

	@Then("^User select Resource Type$")
	public void user_select_Resource_Type() throws Throwable {
		ala.selectResourceType();
		Thread.sleep(5000);
	   
	}

	@Then("^User Enter search \"([^\"]*)\"$")
	public void user_Enter_search(String Resource) throws Throwable {
		alo.searchResource.sendKeys(Resource);
		Thread.sleep(5000);
		Actions ac = new Actions(SeleniumDriver.getDriver());
		//ac.sendKeys(alo.searchResource, Resource).build().perform();
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
	
	   
	}

	@Then("^User Enter start date \"([^\"]*)\"$")
	public void user_Enter_start_date(String startDate) throws Throwable {
	  alo.StartDate.sendKeys(startDate);
	  Thread.sleep(3000);
	}

	@Then("^User pick end date \"([^\"]*)\"$")
	public void user_pick_end_date(String endDate) throws Throwable {
	   alo.EndDate.sendKeys(endDate);
	   Thread.sleep(3000);
	}

	@Then("^User Enter \"([^\"]*)\"$")
	public void user_Enter(String Occupancy) throws Throwable {
	   alo.OccupancyValue.sendKeys(Occupancy);
	   Thread.sleep(3000);
	}

	@Then("^User select time tracking$")
	public void user_select_time_tracking() throws Throwable {
		ala.clientTimeTracking();
		Thread.sleep(3000);
	  
	}

	@Then("^User click on Allocate$")
	public void user_click_on_Allocate() throws Throwable {
	  ala.clickonAllocate();
	}



}
