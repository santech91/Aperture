package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gspann.aperture.pages.Actions.SignInAction;
import com.gspann.aperture.pages.Locators.SignInLocator;


public class SeleniumDriver {
	
private static SeleniumDriver seleniumDriver;
	
	//init WebDriver
	public static WebDriver driver;
	
	public static WebDriverWait waitDriver;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;

	
	public SeleniumDriver(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executable\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		waitDriver = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	
	public static void openPage(String url) throws InterruptedException{
		
		driver.get(url);
		
		//email
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='someone@gspann.com']"))).sendKeys("santosh.kumar@gspann.com");
				//next
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']"))).click();
		        //pass
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='passwd']"))).sendKeys("Ersantosh89@");
		        //submit
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']"))).click();
		        //yes
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']"))).click(); 
	
	}
	
	public static WebDriver getDriver(){
		
		return driver;
	}
	
	public static void setUpDriver(){
		
		if(seleniumDriver==null){
			
			seleniumDriver = new SeleniumDriver();
			
		}
		
	}
	
	
	public static void tearDown(){
		
		if(driver !=null){
			
			driver.close();
			driver.quit();
			
		}
		seleniumDriver = null;
		
	}
	

}