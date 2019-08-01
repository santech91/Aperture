package com.gspann.aperture.pages.Actions;

import org.openqa.selenium.support.PageFactory;

import com.gspann.aperture.pages.Locators.LoginLocator;

import utils.SeleniumDriver;

public class LoginAction {
	
	 LoginLocator login = null;
		
		public LoginAction() {
			
			this.login = new LoginLocator();
			PageFactory.initElements(SeleniumDriver.getDriver(), login);
		}
		
		public boolean aperturelogodisplay() {
			return login.Aperture.isDisplayed();
		}
		
	    public void clickOnName() {
	    	login.loginName.click();
		}
	
		public void clickOnmyProfile() {
			login.myProfile.click();
		}
		
		public boolean resourceDetailsdisplay() {
			return login.ResourceDetails.isDisplayed();
		}
		
		public void clickOnHistory() {
			login.history.click();
		}
		
		public boolean emailIddisplay() {
			return login.emailId.isDisplayed();
		}
		
		public void clickOnsignOut() {
			login.signOut.click();
		}
		
		

}
