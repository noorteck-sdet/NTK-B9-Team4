package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2Zuleyma {

	
	public static void main(String args []) throws InterruptedException {
		

		//1. Set system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\feb27\\OneDrive\\Desktop\\Selenium - B9\\chromedriver.exe");
		
		//2. Create an object of WebDriver..
		WebDriver driver = new ChromeDriver();
		
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		
		
		// 2 .Navigate to https://demo.guru99.com/test/newtours/
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
		// 3. Click REGISTER link
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		
		Thread.sleep(3000);
		
		
		// 4. Verify the page title is Mercury Tours
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		
		Thread.sleep(2000);
		
		// 5. Enter first name
		WebElement fNameField = driver.findElement(By.name("firstName"));
		fNameField.sendKeys("Zuleyma");

		Thread.sleep(2000);
		
		// 6. Enter last name
		WebElement lNameField = driver.findElement(By.name("lastName"));
		lNameField.sendKeys("Jimenez");
		
		Thread.sleep(2000);
		
		// 7. Enter phone number
		WebElement phoneNumField = driver.findElement(By.name("phone"));
		phoneNumField.sendKeys("4432486271");
		
		Thread.sleep(2000);
		
		// 8. Enter email 
		WebElement emailField = driver.findElement(By.id("userName"));
		emailField.sendKeys("feb27.jz@gmail.com");
		
		Thread.sleep(2000);
		
		// 9. Enter address
		WebElement addressField = driver.findElement(By.name("address1"));
		addressField.sendKeys("8270 Kavanagh Rd");
		
		Thread.sleep(2000);
		
		// 10. Enter city
		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys("Baltimore");
		
		Thread.sleep(2000);
		
		// 11. Enter state
		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys("MD");
		
		Thread.sleep(2000);
		
		// 12. Enter zip code
		WebElement zipCodeField = driver.findElement(By.name("postalCode"));
		zipCodeField.sendKeys("21222");
		
		Thread.sleep(2000);
		
		// 13. Enter username
		WebElement usernameField = driver.findElement(By.id("email"));
		usernameField.sendKeys("zjimenez");
		
		Thread.sleep(2000);
		
		// 14. Enter password
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("password1234");
		
		Thread.sleep(2000);
		
		// 15. Re-Enter password in confirm password field
		WebElement confirmPWField = driver.findElement(By.name("confirmPassword"));
		confirmPWField.sendKeys("password1234");
		
		// 16. Click Submit
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		
		/*
		  17. Retrieve the confirmation text message and check if the confirmation text message contains
				following phrase: Thank you for registering.
				a. If it does then print TESTCASE PASSED
				b. Otherwise print TESTCASE FAILED
		 */
		 
		WebElement confirmationTextMessage = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]"));
		String textStr = confirmationTextMessage.getText();
		System.out.println(textStr);
	
		String expectedText = "Thank you for registering.";
		
		boolean check = textStr.contains(expectedText);
		
		if (check) {
			System.out.println("TESTCASE PASSED");
			
		} else {
			System.out.println("TESTCASE FAILED");
			
			Thread.sleep(2000);
			driver.quit();
			
			
		}
	}
}
