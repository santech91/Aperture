package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
private static SeleniumDriver seleniumDriver;
	
	//init WebDriver
	private static WebDriver driver;
	
	public static WebDriverWait waitDriver;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;
	
	private SeleniumDriver(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executable\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		waitDriver = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	
	public static void openPage(String url){
		
		driver.get(url);
		
		//email
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='someone@gspann.com']"))).sendKeys("email");
				//next
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']"))).click();
		        //pass
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='passwd']"))).sendKeys("password");
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