package stepDefinations;

import org.apache.log4j.Logger;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Actions.AccountAction;

public class Account {
	
	AccountAction al = new AccountAction();
	Logger log = Logger.getLogger("Account.class");
	
	@When("^User click on \"([^\"]*)\" from header$")
	public void user_click_on_from_header(String arg1) throws Throwable {
	    al.clickAccount();
	    Thread.sleep(5000);
	}

	@Then("^User able to see Account landing page$")
	public void user_able_to_see_Account_landing_page() throws Throwable {
		Assert.assertEquals(al.Accountdisplay(), true);
	   
	}

	@When("^User click on \"([^\"]*)\" in Account page$")
	public void user_click_on_in_Account_page(String arg1) throws Throwable {
		al.clickAddAccount();
	    
	}

	@Then("^User fill-up form$")
	public void user_fill_up_form() throws Throwable {
		al.clickCustomerGroup();
		Thread.sleep(3000);
		al.clickMacys();
		Thread.sleep(3000);
		al.fillCustomerName();
		Thread.sleep(3000);
		al.fillCustomerEntity();
		Thread.sleep(3000);
		al.fillCustomeContactPerson();
		Thread.sleep(3000);
		al.searchManager();
		Thread.sleep(3000);
		al.selectCountry(null);
		Thread.sleep(3000);
		al.fillCustomerMail();
		Thread.sleep(3000);
		al.fillCustomerMobileNo();
		Thread.sleep(3000);
	}

	@Then("^User click on \"([^\"]*)\" to create Account$")
	public void user_click_on_to_create_Account(String arg1) throws Throwable {
		al.clickCreateAccount();
		Thread.sleep(5000);
	}

	@Then("^User able to see Account create landing page$")
	public void user_able_to_see_Account_create_landing_page() throws Throwable {
		Assert.assertEquals(al.displayAccount(), true);
	}


}
