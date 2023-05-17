package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw3IanTorres {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://demo.nopcommerce.com/";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.get(url);

		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();

		// retrieve page title
		String pageTitle = driver.getTitle();
		System.out.println("PageTitle:" + pageTitle);

		WebElement GenderRadio = driver.findElement(By.id("gender-male"));
		GenderRadio.click();
		Thread.sleep(1000);

		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Ian");
		Thread.sleep(1000);

		WebElement LastName = driver.findElement(By.id("LastName"));
		LastName.sendKeys("Torres");
		Thread.sleep(1000);

		WebElement dropDown1 = driver.findElement(By.name("DateOfBirthDay"));
		Select select = new Select(dropDown1);
		select.selectByVisibleText("17");
		Thread.sleep(1000);

		WebElement dropDown2 = driver.findElement(By.name("DateOfBirthMonth"));
		Select select2 = new Select(dropDown2);
		select2.selectByVisibleText("June");
		Thread.sleep(1000);

		WebElement dropDown3 = driver.findElement(By.name("DateOfBirthYear"));
		Select select3 = new Select(dropDown3);
		select3.selectByVisibleText("1987");
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.name("Email"));
		email.sendKeys("ianc17torres@gmail.com");
		Thread.sleep(1000);

		WebElement companyName = driver.findElement(By.id("Company"));
		companyName.sendKeys("Noorteck");
		Thread.sleep(1000);

		WebElement newsletterRadio = driver.findElement(By.name("Newsletter"));
		newsletterRadio.click();

		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123456");
		Thread.sleep(1000);

		WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
		confirmpassword.sendKeys("123456");
		Thread.sleep(1000);

		WebElement registerButton = driver.findElement(By.name("register-button"));
		registerButton.click();
		Thread.sleep(1000);

		WebElement confirmationText = driver.findElement(By.className("result"));
		String textStr = confirmationText.getText();
		System.out.println(textStr);

		String text = "Your registration completed!!!";
		boolean check = textStr.equals(text);
		if (check) {
			System.out.println("TESTCASE PASSED");
		} else
			System.out.println("TESTCASE FAILED");
		
		

	}

}
