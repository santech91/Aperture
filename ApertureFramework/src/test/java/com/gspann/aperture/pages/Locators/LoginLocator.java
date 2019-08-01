package com.gspann.aperture.pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginLocator {
	

	@FindBy(how=How.XPATH,using="//a[@class='navbar-brand logo float-left']//img")
	public WebElement Aperture;
	
	@FindBy(how=How.XPATH,using="//h1[@id='main-heading']")
	public WebElement Name;

	@FindBy(how=How.XPATH,using="(//a[@id='account-menu'])[3]")
	public WebElement loginName;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'My Profile')]")
	public WebElement myProfile;
	
	@FindBy(how=How.XPATH,using="//h4[contains(text(),'Resource Details')]")
	public WebElement ResourceDetails;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'History')]")
	public WebElement history;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Email ID')]")
	public WebElement emailId;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Sign out')]")
	public WebElement signOut;

}
