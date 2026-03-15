package sit707_week2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/Users/sunnieho/Documents/Master_of_IT/SIT707 Software Quality and Testing/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		

		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Ahsan");
			

		// Write code
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		try {
		    org.openqa.selenium.io.FileHandler.copy(source, new File("registration_fail.png"));
		    System.out.println("Screenshot captured successfully!");
		} catch (Exception e) {
		    System.out.println("Exception while taking screenshot: " + e.getMessage());
		}
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}

*/
	
	public static void woolworths_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/Users/sunnieho/Documents/Master_of_IT/SIT707 Software Quality and Testing/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		WebElement emailElement = driver.findElement(By.id("shared-text-input-1"));
		emailElement.sendKeys("test_user@gmail.com");
		
		// wrong password
		WebElement passwordElement = driver.findElement(By.id("signupForm-password"));
		passwordElement.sendKeys("123");
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("shared-text-input-3"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Ahsan");
			
		/*
		 * Find following input fields and populate with values
		 */
		// Write code last name
		WebElement lastnameElement = driver.findElement(By.id("shared-text-input-4"));
		lastnameElement.sendKeys("Lee");
		
		WebElement birthdayElement = driver.findElement(By.id("shared-text-input-5"));
		birthdayElement.sendKeys("23/03/1990");
		
		WebElement phoneElement = driver.findElement(By.id("shared-text-input-6"));
		phoneElement.sendKeys("0412345678");
		
		WebElement policyLabel = driver.findElement(By.cssSelector("label[for='signupForm-tsAndCs']"));
		policyLabel.click();
		System.out.println("click success Policy Label！");
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[contains(., 'Submit')]"));
		submitBtn.click();
		System.out.println("Submit button clicked.");
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		try {
		    org.openqa.selenium.io.FileHandler.copy(source, new File("registration_fail.png"));
		    System.out.println("Screenshot captured successfully!");
		} catch (Exception e) {
		    System.out.println("Exception while taking screenshot: " + e.getMessage());
		}
		
		
		// Sleep a while
		sleep(10);
		
		// close chrome driver
		driver.close();	
	}


	
}
