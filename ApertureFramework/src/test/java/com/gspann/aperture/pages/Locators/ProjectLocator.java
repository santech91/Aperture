package com.gspann.aperture.pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProjectLocator {
	
	@FindBy(how = How.XPATH, using = "//span[text()='Project']")
	public WebElement ProjectLink;

	@FindBy(how = How.XPATH, using = "//h2[@id='main-heading'][text()='Project']")
	public WebElement ProjectHeading;

	@FindBy(how = How.XPATH, using = "//button[@class='add-project-button mat-raised-button mat-primary']")
	public WebElement AddProject;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='accountCode']")
	public WebElement ClickAccount;
	
	@FindBy(how=How.XPATH,using="//div[@class='mat-autocomplete-panel ng-star-inserted mat-autocomplete-visible']/mat-option[1]")
    public WebElement SelectAccount;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Customer Project Code *']")
	public WebElement CustomerProjectCode;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Customer Contact Person']")
	public WebElement CustomerContactPerson;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='customerProjectName']")
	public WebElement CustomerProjectName;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='projectName']")
	public WebElement ProjectName;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='offshoreManagerCode']")
	public WebElement OffShore;

	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-2']/img")
	public WebElement OffShoreEMPID;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search Onshore Manager (eg. type resource id, resource name, email-id, technology etc.)']")
	public WebElement OnShore;

	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-2']/img")
	public WebElement OnShoreId;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='projectTypeCode']")
	public WebElement ProjectType;

	@FindBy(how = How.XPATH, using = "//span[text()=' Investment ']")
	public WebElement AddType;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='country']")
	public WebElement Country;

	@FindBy(how = How.XPATH, using = "//span[text()=' United States ']")
	public WebElement SelectCountry;

	@FindBy(how = How.XPATH, using = "//span[text()='Practices']")
	public WebElement Practices;

	@FindBy(how = How.XPATH, using = "//span[text()=' Quality Engineering ']")
	public WebElement SelectPractices;

	@FindBy(how = How.XPATH, using = "//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")
	public WebElement Backgroundclick;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Status']")
	public WebElement Status;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text'][text()=' Work in Progress ']")
	public WebElement Selectstatus;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Technologies']")
	public WebElement Technologies;

	@FindBy(how = How.XPATH, using = "//div[@role='listbox']/mat-option[5]")
	public WebElement SelectTechnologies;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='startDate']")
	public WebElement StartDate;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")
	public WebElement SelectStartDate;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='endDate']")
	public WebElement EndDate;

	@FindBy(how = How.XPATH, using = "//button[@class='mat-calendar-next-button mat-icon-button']")
	public WebElement SelectNextButton;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-calendar-body-cell-content'][text()='26']")
	public WebElement SelectEndDate;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-button-wrapper'][text()='Create Project']")
	public WebElement CreateProject;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Details')]")
	public WebElement Details;

}


