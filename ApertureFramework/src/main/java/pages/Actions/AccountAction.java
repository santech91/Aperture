package pages.Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.Locators.AccountLocator;
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
	
	public void clickCustomerGroup() {
		al.customerGroup.click();
	}
	
	public void clickMacys() {
		al.GroupMacys.click();
	}
	
	public void fillCustomerName() {
		al.CustomerName.sendKeys("Kumar");
	}
	
	public void fillCustomerEntity() {
		al.CustomerEntity.sendKeys("QA");
	}
	
	public void fillCustomeContactPerson() {
		al.CustomerContactPerson.sendKeys("Krishna");
	}
	
	public void searchManager() throws InterruptedException {
		al.SearchManager.sendKeys("Admin");
		Thread.sleep(5000);
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public void selectCountry(String India) throws InterruptedException {
		al.Country.clear();
		al.Country.sendKeys("India");
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
	    
		
	}
	
	public void fillCustomerMail()
	{
		al.customerEmailId.sendKeys("bbd@gmail.com");
	}
	
	public void fillCustomerMobileNo()
	{
		al.customerContactNumber.sendKeys("9494949498");
	}
	
	public void clickCreateAccount() {
		al.CreateAccount.click();
	}
	
	
	public boolean displayAccount() {
		return al.AccountDisplay.isDisplayed();
	}

}
