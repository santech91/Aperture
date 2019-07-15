package pages.Actions;

import org.openqa.selenium.support.PageFactory;

import pages.Locators.LoginLocator;
import utils.SeleniumDriver;

public class LoginAction {
	
	 LoginLocator login = null;
		
		public LoginAction() {
			
			this.login = new LoginLocator();
			PageFactory.initElements(SeleniumDriver.getDriver(), login);
		}
		
		public boolean display1() {
			return login.Aperture.isDisplayed();
		}
		
	    public void clickOnName() {
	    	login.loginName.click();
		}
	
		public void clickOnmyProfile() {
			login.myProfile.click();
		}
		
		public boolean display2() {
			return login.ResourceDetails.isDisplayed();
		}
		
		public void clickOnHistory() {
			login.history.click();
		}
		
		public boolean display3() {
			return login.emailId.isDisplayed();
		}
		
		public void clickOnsignOut() {
			login.signOut.click();
		}
		
		

}
