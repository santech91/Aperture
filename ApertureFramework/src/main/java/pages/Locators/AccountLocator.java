package pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountLocator {
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Account')]")
	public WebElement Accountlink;
	
	@FindBy(how=How.XPATH,using="//h2[@id='main-heading']")
	public WebElement AccountHeading;
	
	@FindBy(how=How.XPATH,using="//button[@class='add-acount-button mat-raised-button mat-primary']")
	public WebElement AddAccount;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='customerGroup']")
	public WebElement customerGroup;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'MACY')]")
	public WebElement GroupMacys;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Customer Name']")
	public WebElement CustomerName;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Customer Entity']")
	public WebElement CustomerEntity;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Customer Contact Person']")
	public WebElement CustomerContactPerson;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Search Manager (eg. type resource id, resource name, email-id, technology etc.)']")
	public WebElement SearchManager;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Country']")
	public WebElement Country;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='customerEmailId']")
	public WebElement customerEmailId;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='customerContactNumber']")
	public WebElement customerContactNumber;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Create Account')]")
	public WebElement CreateAccount;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Account:')]")
	public WebElement AccountDisplay;

}
