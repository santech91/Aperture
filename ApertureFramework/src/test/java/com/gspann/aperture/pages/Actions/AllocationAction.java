package com.gspann.aperture.pages.Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.gspann.aperture.pages.Locators.AllocationLocator;

import utils.SeleniumDriver;

public class AllocationAction {

	AllocationLocator alo = null;

	public AllocationAction() {

		this.alo = new AllocationLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), alo);
	}

	public void clickAllocation() {
		alo.Allocation.click();
	}
	
	public boolean displayAllocation() {
		return alo.AllocationHeading.isDisplayed();
	}

	public void clickAddAllocate() {
		alo.Allocate.click();
	}
	
	public boolean displayAddAllocation() {
		return alo.AddAllocation.isDisplayed();
	}


	public void selectAccount() throws InterruptedException {
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.moveToElement(alo.SelectAccount).click().build().perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void selectSOW() throws InterruptedException {
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.moveToElement(alo.SelectSOW).click().build().perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
	
	}
	
	public void selectProject() throws InterruptedException {
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.moveToElement(alo.projectSelect).click().build().perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
	
	}
	
	public void selectAllocationType() throws InterruptedException {
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.moveToElement(alo.AllocationType).click().build().perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
	
	}
	public void selectResourceType() throws InterruptedException {
		Actions ac = new Actions(SeleniumDriver.getDriver());
		ac.moveToElement(alo.ResourceType).click().build().perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
	
	}
	
	public void clientTimeTracking() {
		alo.Checkbox.click();
	}
	
	public void clickonAllocate() {
	    alo.Allocate.click();
	}
}