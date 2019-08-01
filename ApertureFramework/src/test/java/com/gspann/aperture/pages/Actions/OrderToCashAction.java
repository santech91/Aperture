package com.gspann.aperture.pages.Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.gspann.aperture.pages.Locators.OrderToCashLocator;

import utils.SeleniumDriver;

public class OrderToCashAction {
	
	OrderToCashLocator ocl = null;

	public OrderToCashAction() {
		this.ocl = new OrderToCashLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), ocl);
	}	
		public void clickOrdertoCash() {
			ocl.OrderToCash.click();

		}

		public boolean visibleTextLink() {
			return ocl.VisibleTextSOW.isDisplayed();
		}

		public void clickONSOW() throws Exception {
			ocl.SOW.click();
		}

		public boolean visibleSows() {
			return ocl.SOWS.isDisplayed();
		}

		public void clickAddSow() {
			ocl.AddSOW.click();
		}

		public void clickOnAccount() throws Exception {
			ocl.Account.click();
			Thread.sleep(2000);
			ocl.SelectAccount.click();
		}
		
		public void selectCurrency() throws InterruptedException {
			ocl.Currency.click();
			Thread.sleep(2000);
			ocl.SelectCurrency.click();
		}
		// WBS Details>>

		public boolean VisibleWBSs() {
			return ocl.VisibleWBS.isDisplayed();

		}

		public void EnterProject() throws Exception {
			ocl.Project.click();
			Thread.sleep(2000);
		//	ocl.SelectProject.click();
			Actions ac = new Actions(SeleniumDriver.getDriver());
			ac.sendKeys(Keys.DOWN).build().perform();
			ac.sendKeys(Keys.ENTER).build().perform();
		}
		
		public void EnterProject2() throws Exception {
			ocl.Project2.click();
			Thread.sleep(2000);
		//	ocl.SelectProject.click();
			Actions ac = new Actions(SeleniumDriver.getDriver());
			ac.sendKeys(Keys.DOWN).build().perform();
			ac.sendKeys(Keys.ENTER).build().perform();
		}
		
		public void EnterProject3() throws Exception {
			ocl.Project3.click();
			Thread.sleep(2000);
		//	ocl.SelectProject.click();
			Actions ac = new Actions(SeleniumDriver.getDriver());
			ac.sendKeys(Keys.DOWN).build().perform();
			ac.sendKeys(Keys.ENTER).build().perform();
		}
		
		
		public void EnterAllocationTypeBillable() throws InterruptedException {
			ocl.AllocationType.click();
			Thread.sleep(2000);
		//	ocl.SelectAllocationTypeBillable.click();
			Actions ac = new Actions(SeleniumDriver.getDriver());
			ac.sendKeys(Keys.ENTER).build().perform();
		}
		
		public void EnterAllocationTypeNonBillable() throws InterruptedException {
			ocl.AllocationType2.click();
			Thread.sleep(2000);
		//	ocl.SelectAllocationTypeNonBillable.click();
			Actions ac = new Actions(SeleniumDriver.getDriver());
			ac.sendKeys(Keys.DOWN).build().perform();
			ac.sendKeys(Keys.ENTER).build().perform();
		}
		
		public void EnterAllocationTypeBuffer() throws InterruptedException {
			ocl.AllocationType3.click();
			Thread.sleep(3000);
			//ocl.SelectAllocationTypeBuffer.click();
			Actions ac = new Actions(SeleniumDriver.getDriver());
			ac.sendKeys(Keys.DOWN).build().perform();
			ac.sendKeys(Keys.DOWN).build().perform();
			ac.sendKeys(Keys.ENTER).build().perform();
		}
		
		public void clickOnCreate() {
			ocl.Create.click();

		}
		
		public boolean displaySOWTitle() {
			return ocl.SOWTitle.isDisplayed();

		}
}

