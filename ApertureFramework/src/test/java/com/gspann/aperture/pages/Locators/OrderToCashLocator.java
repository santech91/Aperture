package com.gspann.aperture.pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderToCashLocator {
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Order To Cash')]")
	public WebElement OrderToCash;

	@FindBy(how=How.XPATH,using="//a[@class='dropdown-item'][text()=' SOW ']")
	public WebElement VisibleTextSOW;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'SOW')]")
	public WebElement SOW;
	
	@FindBy(how=How.XPATH,using="//h2[@id='main-heading'][text()='SOWs']")
    public WebElement SOWS;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary ng-star-inserted']")
	public WebElement AddSOW;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-input-infix mat-form-field-infix']/mat-select[@formcontrolname='accountsValue']")
	public WebElement Account;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-select-content ng-trigger ng-trigger-fadeInContent']/mat-option[2]")
	public WebElement SelectAccount;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='sowCode']")
	public WebElement SowName;

	@FindBy(how = How.XPATH, using = "//mat-form-field[contains(@class,'sow-listing-full-width')]//span[@class='mat-button-wrapper']")
	public WebElement StartDate1;
	
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='startDatePicker']")
	public WebElement StartDate;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-calendar-body-cell-content'][text()='1']")
	public WebElement SelectStartDate;

	@FindBy(how = How.XPATH, using = "//mat-form-field[contains(@class,'ng-untouched')]//span[@class='mat-button-wrapper']")
	public WebElement EndDate1;
	
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='EndDatePicker']")
	public WebElement EndDate;

	@FindBy(how = How.XPATH, using = "//button[@class='mat-calendar-next-button mat-icon-button']")
	public WebElement Next;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-calendar-body-cell-content'][text()='26']")
	public WebElement SelectEndDate;

	@FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='currenciesValue']")
	public WebElement Currency;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'INR (')]")
	public WebElement SelectCurrency;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='miscBill']")
	public WebElement MiscBill;

	@FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='remarks']")
	public WebElement Remark;

   // For WBS>>
	
	@FindBy(how=How.XPATH,using="//h5[@class='heading'][text()='Work Breakdown structures (WBS)']")
	public WebElement VisibleWBS;
	
	@FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='project']")
	public WebElement Project;
	
	@FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='project'])[2]")
	public WebElement Project2;
	
	@FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='project'])[3]")
	public WebElement Project3;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-select-content ng-trigger ng-trigger-fadeInContent']/mat-option[2]/span")
	public WebElement SelectProject;

	@FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='allocation']")
	public WebElement AllocationType;
	
	@FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='allocation'])[2]")
	public WebElement AllocationType2;
	
	@FindBy(how = How.XPATH, using = "(//mat-select[@formcontrolname='allocation'])[3]")
	public WebElement AllocationType3;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text'][text()=' Billable ']")
	public WebElement SelectAllocationTypeBillable;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Non Billable')]")
	public WebElement SelectAllocationTypeNonBillable;
    
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Buffer')]")
	public WebElement SelectAllocationTypeBuffer;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Role ID']")
	public WebElement RollID;
	
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Role ID'])[2]")
	public WebElement RollID2;
	
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Role ID'])[3]")
	public WebElement RollID3;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Hourly Rate']")
	public WebElement HourlyRate;
	
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Hourly Rate'])[2]")
	public WebElement HourlyRate2;
	
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Hourly Rate'])[3]")
	public WebElement HourlyRate3;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='contractedHours']")
	public WebElement ContractedHours;
	
	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='contractedHours'])[2]")
	public WebElement ContractedHours2;
	
	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='contractedHours'])[3]")
	public WebElement ContractedHours3;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus-circle ng-star-inserted']")
	public WebElement Add;

	@FindBy(how = How.XPATH, using = "//button[@class='mat-raised-button mat-primary']/span[@class='mat-button-wrapper'][text()=' Create ']")
	public WebElement Create;
	
	@FindBy(how = How.XPATH, using = "//h1[@id='main-heading']")
	public WebElement SOWTitle;
	
	

}
