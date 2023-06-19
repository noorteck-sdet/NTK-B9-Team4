package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise3Zuleyma {

	public static void main(String args[]) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		// 8. Launch chrome browser
		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);

		// 9. Navigate to https://demo.nopcommerce.com/
		driver.get("https://demo.nopcommerce.com/");

		Thread.sleep(3000);

		WebElement registerLink = driver
				.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));

		// 10. Click Register Link
		registerLink.click();

		Thread.sleep(3000);

		// 11. Verify the page title is nopCommerce demo store. Register
		String pageStr = driver.getTitle();
		System.out.println("Retrieve Page Title: " + pageStr);

		// 12. Fill out Your Personal Details Section
		// e. Email

		// a. Gender
		WebElement genderSelection = driver.findElement(By.id("gender-female"));
		genderSelection.click();
		Thread.sleep(3000);

		// b. First name
		WebElement firstNameF = driver.findElement(By.id("FirstName"));
		firstNameF.sendKeys("Zuleyma");

		// c. Last name
		WebElement lastNameF = driver.findElement(By.id("LastName"));
		lastNameF.sendKeys("Jimenez");
		Thread.sleep(2000);

		// d. Date of birth

		// -select day
		WebElement dropDownDay = driver.findElement(By.name("DateOfBirthDay"));
		Select selectDay = new Select(dropDownDay);
		selectDay.selectByVisibleText("27");
		Thread.sleep(2000);

		// -select Month
		WebElement dropDownMonth = driver.findElement(By.name("DateOfBirthMonth"));
		Select selectMonth = new Select(dropDownMonth);
		selectMonth.selectByVisibleText("February");
		Thread.sleep(2000);

		// -select year
		WebElement dropDownYear = driver.findElement(By.name("DateOfBirthYear"));
		Select selectYear = new Select(dropDownYear);
		selectYear.selectByVisibleText("1994");
		Thread.sleep(2000);

		// (not in requirements, but added email)
		WebElement emailField = driver.findElement(By.id("Email"));
		emailField.sendKeys("feb27.jz@gmail.com");
		Thread.sleep(2000);

		// 13. Enter Company name
		WebElement companyNameField = driver.findElement(By.id("Company"));
		companyNameField.sendKeys("ZJ LLC.");
		Thread.sleep(2000);

		// 14. Uncheck Newsletter checkbox
		WebElement newsletterCheckBox = driver.findElement(By.name("Newsletter"));
		newsletterCheckBox.click();
		Thread.sleep(2000);

		// 15. Enter password
		WebElement passwordField = driver.findElement(By.id("Password"));
		passwordField.sendKeys("mypassword123");
		Thread.sleep(2000);

		// 16. Confirm password
		WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
		confirmPasswordField.sendKeys("mypassword123");
		Thread.sleep(2000);

		// 17. Click register button
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();

		// 18. Retrieve the confirmation text message and check if the confirmation text
		// message equals to
//				Your registration completed!!!
//				a. If it does then print TESTCASE PASSED
//				b. Otherwise print TESTCASE FAILED

		WebElement confirmationText = driver.findElement(By.className("result"));
		String textStr = confirmationText.getText();
		System.out.println("Confirmation text: " + textStr);

		String textExpected = "Your registration completed!!!";
		boolean checkText = textStr.equals(textExpected);

		if (checkText) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		
		driver.quit();
	}

}
/*
 * Exercise 3 Scenario: Register new user 8. Launch chrome browser 9. Navigate
 * to https://demo.nopcommerce.com/ 10. Click Register Link 11. Verify the page
 * title is nopCommerce demo store. Register 12. Fill out Your Personal Details
 * Section a. Gender b. First name c. Last name d. Date of birth e. Email 13.
 * Enter Company name 14. Uncheck Newsletter checkbox 15. Enter password 16.
 * Enter Username 17. Click register button 18. Retrieve the confirmation text
 * message and check if the confirmation text message equals to Your
 * registration completed!!! a. If it does then print TESTCASE PASSED b.
 * Otherwise print TESTCASE FAILED
 * 
 */