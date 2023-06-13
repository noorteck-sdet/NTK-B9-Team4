package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1Zuleyma {
	
	public static void main(String args []) throws InterruptedException {

		
		
		//From scenario >> 1. Launch Chrome Browser
		
		
		//1. Set system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\feb27\\OneDrive\\Desktop\\Selenium - B9\\chromedriver.exe");
		
		//2. Create an object of Webdriver
		WebDriver driver = new ChromeDriver();
		
		
		//3. Maximize the browser
		driver.manage().window().maximize();
		
		
		
		
		//From scenario >> 2. Navigate to...
		
		//4. Navigate to webpage
		
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		
		//From scenario >> 3. Enter " ntk-admin " in the username field...
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("ntk-admin");
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Ntk-orange!admin.123");
		
		Thread.sleep(3000);
		
		WebElement logInButton = driver.findElement(By.tagName("button"));
		logInButton.click();
		
		Thread.sleep(3000);
		
		// Retrieve the header
		String header = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).getText();
		System.out.println("Header Text: " + header);
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
	}

}
