package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1GustavoGuerrero {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		// Step 1. set system property

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\owner\\Desktop\\SELENIUM\\chromedriver.exe");

				// Step 2. Create an object of WebDriver

				WebDriver driver = new ChromeDriver();

				Thread.sleep(3000);

				// Maximize the browser

				driver.manage().window().maximize();

				Thread.sleep(3000);

				driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
				
				Thread.sleep(3000);
				
				WebElement UserName = driver.findElement(By.name("username"));
				WebElement UserPassword = driver.findElement(By.name("password"));
				
				// enter value to the field
				UserName.sendKeys("ntk-admin");
				
				Thread.sleep(3000);
				
				UserPassword.sendKeys("Ntk-orange!admin.123");
				
				Thread.sleep(3000);
				
				WebElement LoginButton = driver.findElement(By.tagName("button"));
	
				LoginButton.click();
				
				Thread.sleep(3000);
				
		String header = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).getText();
				System.out.println("Header: " + header);
						
				
				Thread.sleep(5000);
				driver.quit();
		
		
		
	}

}
