package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2EdyRodriguez {

	public static void main(String[] args) throws InterruptedException {

		// Step 1. set system property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Edy Rodriguez\\Desktop\\Selenium B9 Folder\\chromedriver.exe ");

		// Step 2. Create and object of WebDriver

		WebDriver driver = new ChromeDriver();
		// Thread.sleep(3000);

		// maximize the window
		driver.manage().window().maximize();
		// Thread.sleep(3000);
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		// operate the page
		WebElement registerButton = driver.findElement(By.linkText("REGISTER"));
		registerButton.click();

		Thread.sleep(3000);

		// retrieve page title
		String pageTitle = driver.getTitle();

		System.out.println("PageTitle:" + pageTitle);
		/*
		 * if (pageTitle == "Mercury Tours") {
		 * System.out.println("Page Title is correct"); } else {
		 * System.out.println("Page title is not correct"); }
		 */
		Thread.sleep(500);
		WebElement firstName = driver.findElement(By.xpath("//input[@name = 'firstName']"));
		firstName.sendKeys("Edy");

		Thread.sleep(500);
		WebElement lastName = driver.findElement(By.xpath("//input[@name = 'lastName']"));
		lastName.sendKeys("Rodriguez");

		Thread.sleep(500);
		WebElement phoneInput = driver.findElement(By.xpath("//input[@name = 'phone']"));
		phoneInput.sendKeys("12345678");

		Thread.sleep(500);
		WebElement emailInput = driver.findElement(By.xpath("//input[@name = 'userName']"));
		emailInput.sendKeys("Hon@gmail.com");

		Thread.sleep(500);
		WebElement addressInput = driver.findElement(By.xpath("//input[@name = 'address1']"));
		addressInput.sendKeys("Merendon Hills");

		Thread.sleep(500);
		WebElement cityInput = driver.findElement(By.xpath("//input[@name = 'city']"));
		cityInput.sendKeys("San Pedro Sula");

		Thread.sleep(500);
		WebElement stateCode = driver.findElement(By.xpath("//input[@name = 'state']"));
		stateCode.sendKeys("Cortes");

		Thread.sleep(500);
		WebElement postalCode = driver.findElement(By.xpath("//input[@name = 'postalCode']"));
		postalCode.sendKeys("12345");

		Thread.sleep(500);
		WebElement countryInput = driver.findElement(By.xpath("//select[@name = 'country']"));
		countryInput.sendKeys("HONDURAS");

		Thread.sleep(500);
		WebElement userName = driver.findElement(By.xpath("//input[@name = 'email']"));
		userName.sendKeys("Hon1@gmail.com");

		Thread.sleep(500);
		WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
		password.sendKeys("Baleadas2023");

		Thread.sleep(500);
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@name = 'confirmPassword']"));
		confirmPassword.sendKeys("Baleadas2023");

		Thread.sleep(500);
		WebElement submitButton = driver.findElement(By.xpath("//input[@name = 'submit']"));
		submitButton.click();

		// 5. Retrieve the text for the element
		Thread.sleep(3000);
		String ele = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"))
				.getText();
		String find = "Thank you for registering.";
		boolean val = ele.contains(find);
		if (val) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}
		driver.quit();
	}
	//

}