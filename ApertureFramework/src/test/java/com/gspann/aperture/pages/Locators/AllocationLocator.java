package com.gspann.aperture.pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllocationLocator {
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Allocation')]")
	public WebElement Allocation;
	
	@FindBy(how=How.XPATH,using="//h2[@id='main-heading']")
	public WebElement AllocationHeading;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary ng-star-inserted']")
	public WebElement Allocate;
	
	@FindBy(how=How.XPATH,using="//h2[@id='main-heading']")
	public WebElement AddAllocation;
	
	
	@FindBy(how=How.XPATH,using="//mat-select[@formcontrolname='accountsValue']")
	public WebElement SelectAccount;

	@FindBy(how=How.XPATH,using="//mat-select[@formcontrolname='sowselectedOption']")
	public WebElement SelectSOW;
	

	@FindBy(how=How.XPATH,using="//mat-select[@formcontrolname='projectSelectedValue']")
	public WebElement projectSelect;
	
	@FindBy(how=How.XPATH,using="//mat-select[@formcontrolname='allocationType']")
	public WebElement AllocationType;
	
	@FindBy(how=How.XPATH,using="//mat-select[@formcontrolname='resourceType']")
	public WebElement ResourceType;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='resourceValue']")
	public WebElement searchResource;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='startDatePicker']")
	public WebElement StartDate;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='EndDatePicker']")
	public WebElement EndDate;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='occupancyValue']")
	public WebElement OccupancyValue;
	
	@FindBy(how=How.XPATH,using="//mat-checkbox[@formcontrolname='clientTS']")
	public WebElement Checkbox;
	
	
	
	
	
	
	
	
	
	

}
