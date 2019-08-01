package com.gspann.aperture.pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResourceLocator {
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Resource')]")
	public WebElement Resource;
	
	@FindBy(how=How.XPATH,using="//*[text()=' Add Resource ']")
	public WebElement AddResource;
	
	@FindBy(how=How.XPATH,using="//h2[@id='main-heading']")
	public WebElement AddNewResource;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='resourceName']")
	public WebElement resourceName;
	
	@FindBy(how=How.XPATH,using="//mat-radio-button[@id='mat-radio-2']//div[@class='mat-radio-outer-circle']")
	public WebElement Male;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='companyName']")
	public WebElement companyName;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Whisk Software Pvt. Ltd.')]")
	public WebElement company;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='department']")
	public WebElement department;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Technical')]")
	public WebElement Technical ;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='designation']")
	public WebElement designation;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Senior Software Engineer')]")
	public WebElement SeniorSoftwareEngineer;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='baseLocation']")
	public WebElement baseLocation;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Gurgaon - Haryana - India')]")
	public WebElement GurgaonHaryanaIndia;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='joiningDate']")
	public WebElement joiningDate;

	@FindBy(how=How.XPATH,using="//mat-select[@formcontrolname='practice']")
	public WebElement practices;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Performance')]")
	public WebElement Performance;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Primary Skills']")
	public WebElement PrimarySkills;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Secondary Skills']")
	public WebElement SecondarySkills;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Select Profile Picture')]")
	public WebElement SelectProfilePicture;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-outline-dark']")
	public WebElement save;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Select Resume')]")
	public WebElement SelecResume;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Save & Next')]")
	public WebElement SaveNext;
	
	@FindBy(how=How.XPATH,using="//mat-radio-button[@id='mat-radio-6']//div[@class='mat-radio-outer-circle']")
	public WebElement employeeType;
	
	@FindBy(how=How.XPATH,using="//mat-select[@formcontrolname='currency']")
	public WebElement currency;
	
	@FindBy(how=How.XPATH,using="//span[@class='mat-option-text']")
	public WebElement INR;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='anualPackage']")
	public WebElement salary;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='commision']")
	public WebElement commision;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='bonus']")
	public WebElement Annualbonus;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='other']")
	public WebElement other;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='comments']")
	public WebElement comments;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Create Resource')]")
	public WebElement CreateResource;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Confirm')]")
	public WebElement Confirm;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary ng-star-inserted']")
	public WebElement OnBoard;








}
