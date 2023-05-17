package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hw3GustavoMedina {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://demo.nopcommerce.com/";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		WebElement Register = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));

		Register.click();

		String pagetitle = driver.getTitle();

		System.out.println("PagTitle:" + pagetitle);

		WebElement Gender = driver.findElement(By.id("gender-male"));

		Gender.click();

		Thread.sleep(3000);

		WebElement Firstname = driver.findElement(By.id("FirstName"));

		Firstname.sendKeys("Gustavo");

		Thread.sleep(3000);

		WebElement Lastname = driver.findElement(By.id("LastName"));

		Lastname.sendKeys("Medina");

		Thread.sleep(3000);

		WebElement day = driver.findElement(By.name("DateOfBirthDay"));

		Select select = new Select(day);

		select.selectByIndex(4);

		Thread.sleep(3000);

		WebElement month = driver.findElement(By.name("DateOfBirthMonth"));

		Select select2 = new Select(month);

		select2.selectByIndex(12);

		Thread.sleep(3000);

		WebElement year = driver.findElement(By.name("DateOfBirthYear"));

		Select select3 = new Select(year);

		select3.selectByValue("1990");

		Thread.sleep(3000);

		WebElement email = driver.findElement(By.id("Email"));

		email.sendKeys("Hon8medina@gmail.com");

		Thread.sleep(2000);

		WebElement company = driver.findElement(By.id("Company"));

		company.sendKeys("Concentrix");

		Thread.sleep(2000);

		WebElement Newsletter = driver.findElement(By.id("Newsletter"));

		Newsletter.click();

		Thread.sleep(3000);

		WebElement password = driver.findElement(By.id("Password"));

		password.sendKeys("123456");

		Thread.sleep(3000);

		WebElement confirm = driver.findElement(By.id("ConfirmPassword"));

		confirm.sendKeys("123456");

		Thread.sleep(3000);

		WebElement register = driver.findElement(By.id("register-button"));

		register.click();

		WebElement text = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));

		String confirm2 = text.getText();
		
		boolean val = confirm2.contains("Your registration completed");
		
		System.out.println("Check text: "+val);

	

		if (confirm2.contains("Your registration completed")) {

			System.out.println("Test case passed");

		} else
			System.out.println("Test case fail");

		Thread.sleep(5000);

		driver.quit();

		

	}

}
