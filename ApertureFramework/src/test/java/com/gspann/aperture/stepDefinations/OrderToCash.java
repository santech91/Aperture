package com.gspann.aperture.stepDefinations;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.gspann.aperture.pages.Actions.OrderToCashAction;
import com.gspann.aperture.pages.Locators.OrderToCashLocator;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;

public class OrderToCash {

	OrderToCashAction oca = new OrderToCashAction();
	Logger log = Logger.getLogger("OrderToCash.class");

	OrderToCashLocator ocl = null;

	public OrderToCash() {
		this.ocl = new OrderToCashLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), ocl);
	}

	@When("^User click on OrderTOCash$")
	public void user_click_on_OrderTOCash() throws Throwable {
		oca.clickOrdertoCash();
		Thread.sleep(3000);
	}

	@Then("^User able to see drop-down value of SOW$")
	public void user_able_to_see_drop_down_value_of_SOW() throws Throwable {
		Assert.assertEquals(oca.visibleTextLink(), true);

	}

	@When("^User click on SOW$")
	public void user_click_on_SOW() throws Throwable {
		oca.clickONSOW();
		Thread.sleep(3000);

	}

	@Then("^User able to see landing page of SOW$")
	public void user_able_to_see_landing_page_of_SOW() throws Throwable {
		Assert.assertEquals(oca.visibleSows(), true);
		
	}

	@Then("^User click On AddSOW$")
	public void user_click_On_AddSOW() throws Throwable {
		oca.clickAddSow();
		Thread.sleep(3000);
	}

	@Then("^User select Account in SOW$")
	public void user_select_Account_in_SOW() throws Throwable {
		oca.clickOnAccount();
		Thread.sleep(3000);
	}

	@Then("^User Enter \"([^\"]*)\" SOWname$")
	public void user_Enter_SOWname(String SOWname) throws Throwable {
		ocl.SowName.sendKeys(SOWname);
		
	}

	@Then("^User Select \"([^\"]*)\" StartDate$")
	public void user_Select_StartDate(String StartDate) throws Throwable {
		ocl.StartDate.sendKeys(StartDate);
		

	}

	@Then("^User Select \"([^\"]*)\" EndDate$")
	public void user_Select_EndDate(String EndDate) throws Throwable {
		ocl.EndDate.sendKeys(EndDate);
	
	}

	@Then("^User Select the Currency$")
	public void user_Select_the_Currency() throws Throwable {
		oca.selectCurrency();
		
	}

	@Then("^User Enter \"([^\"]*)\" MiscBill$")
	public void user_Enter_MiscBill(String MiscBill) throws Throwable {
		ocl.MiscBill.sendKeys(MiscBill);
		
	}

	@Then("^User Enter \"([^\"]*)\" Remarks$")
	public void user_Enter_Remarks(String Remarks) throws Throwable {
		ocl.Remark.sendKeys(Remarks);
		

	}

	@Then("^User able to see WBS$")
	public void user_able_to_see_WBS() throws Throwable {
		Assert.assertEquals(oca.VisibleWBSs(), true);
		

	}

	@Then("^User Select the Project$")
	public void user_Select_the_Project() throws Throwable {
		oca.EnterProject();
		

	}

	@Then("^User Select the Alloction type Billable$")
	public void user_Select_the_Alloction_type_Billable() throws Throwable {
		oca.EnterAllocationTypeBillable();
		
	}

	@Then("^User Enter \"([^\"]*)\" IstRollid$")
	public void user_Enter_IstRollid(String Rollid) throws Throwable {
		ocl.RollID.sendKeys(Rollid);
		
	}

	@Then("^User Enter \"([^\"]*)\" IstHourly$")
	public void user_Enter_IstHourly(String HourlyRate) throws Throwable {
		ocl.HourlyRate.sendKeys(HourlyRate);
		

	}

	@Then("^User Enter \"([^\"]*)\" IstContractedHour$")
	public void user_Enter_IstContractedHour(String ContractedHour) throws Throwable {
		ocl.ContractedHours.sendKeys(ContractedHour);
		

	}

	@Then("^User click on Action to Add Project$")
	public void user_click_on_Action_to_Add_Project() throws Throwable {
		ocl.Add.click();
		

	}

	@Then("^User Select the SecProject$")
	public void user_Select_the_SecProject() throws Throwable {
		oca.EnterProject2();
		
	}

	@Then("^User Select the Alloction type Non-Billable$")
	public void user_Select_the_Alloction_type_Non_Billable() throws Throwable {
		oca.EnterAllocationTypeNonBillable();
		
	}

	@Then("^User Enter \"([^\"]*)\" SecRollid$")
	public void user_Enter_SecRollid(String Rollid2) throws Throwable {
		ocl.RollID2.sendKeys(Rollid2);
		
	}

	@Then("^User Enter \"([^\"]*)\" SecContractedHour$")
	public void user_Enter_SecContractedHour(String ContractedHour2) throws Throwable {
		ocl.ContractedHours2.sendKeys(ContractedHour2);
		

	}

	@Then("^User Select the ThrProject$")
	public void user_Select_the_ThrProject() throws Throwable {
		oca.EnterProject3();
	
	}

	@Then("^User Select the Alloction type Buffer$")
	public void user_Select_the_Alloction_type_Buffer() throws Throwable {
		oca.EnterAllocationTypeBuffer();
		Thread.sleep(3000);
	}

	@Then("^User Enter \"([^\"]*)\" ThrRollId$")
	public void user_Enter_ThrRollId(String Rollid3) throws Throwable {
		ocl.RollID3.sendKeys(Rollid3);
		
	}

	@Then("^User Enter \"([^\"]*)\" ThrContractedHour$")
	public void user_Enter_ThrContractedHour(String ContractedHour3) throws Throwable {
		ocl.ContractedHours3.sendKeys(ContractedHour3);
		

	}

	@When("^User click on Create button$")
	public void user_click_on_Create_button() throws Throwable {
		oca.clickOnCreate();
		Thread.sleep(3000);
	}

	@When("^User able to see SOW landing page$")
	public void user_able_to_see_SOW_landing_page() throws Throwable {
		Assert.assertEquals(oca.displaySOWTitle(), true);

	}

}
