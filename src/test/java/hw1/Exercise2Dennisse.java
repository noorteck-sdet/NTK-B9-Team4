package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2Dennisse {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Step 1. set System property
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\denni\\Desktop\\Selenium- B9\\chromedriver.exe");
		
		// Step 2. Create an object of WebDriver
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		//pass the driver
		driver.get("https://demo.guru99.com/test/newtours/");
		//Thread.sleep(3000);
		
		WebElement Register = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		Register.click();
		Thread.sleep(2000);
		
		// retrieve page title
		String pageTitle = driver.getTitle();
		System.out.println("PageTitle:" + pageTitle);
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Dennisse");
		Thread.sleep(1000);
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Font");
		Thread.sleep(1000);
		
		WebElement phoneNumber = driver.findElement(By.name("phone"));
		phoneNumber.sendKeys("787-327-6370");
		Thread.sleep(1000);
	
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("dennisse.font@gmail.com");
		Thread.sleep(1000);
		
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("123 Calle Boqueron");
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Vega Baja");
		Thread.sleep(1000);
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Puerto Rico");
		Thread.sleep(1000);
		
		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("00693");
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("dennisse.font@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Noortechk2023");
		Thread.sleep(1000);
		
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("Noortechk2023");
		Thread.sleep(1000);
		
		WebElement Submit = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
		Submit.click();
		Thread.sleep(2000);
		
		WebElement confirmationText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]"));
		String textStr = confirmationText.getText();
		System.out.println(textStr);
		
		String text = "Thank you for registering";
		
		boolean check = textStr.contains(text);
		if(check) {
			System.out.println("TESTCASE PASSED");
			}
		else 
			System.out.println("Test case failed");

				
		Thread.sleep(3000);
		driver.quit();
		
	}

}
