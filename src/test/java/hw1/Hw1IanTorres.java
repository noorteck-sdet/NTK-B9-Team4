package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1IanTorres {
	
	

	public static void main(String[] args) throws InterruptedException {

		// Step 1: set System property ---- (Driver name), (Driver pass)

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ian_c\\OneDrive\\Pictures\\Escritorio\\Selenium-B9\\chromedriver.exe");

		// Step 2:Create an object of WebDriver

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(3000);

		// operate the page
		WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
		username.sendKeys("ntk-admin");

		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
		password.sendKeys("Ntk-orange!admin.123");

		// click element
		Thread.sleep(3000);

		WebElement loginButton = driver.findElement(By.tagName("button"));

		loginButton.click();

		Thread.sleep(3000);

		// retrieve header

		String header = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).getText();

		System.out.println("Page Header:" + header);

		Thread.sleep(2000);
		
		driver.quit();

	}

}

	
	
	
	
	
	
	


