package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1Dennisse {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\denni\\Desktop\\Selenium- B9\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get ("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement userNameField = driver.findElement(By.name("username"));
		Thread.sleep(3000);
		
		//enter value to username field
		userNameField.sendKeys("ntk-admin");
		
		WebElement passwordField = driver.findElement(By.name("password"));
		
		//enter value to password field
		passwordField.sendKeys("Ntk-orange!admin.123");
		

		WebElement LoginButton = driver.findElement(By.tagName("button"));
		LoginButton.click();
		
		
		//retrieve the text for the element
		String header = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		
		System.out.println("Text: "+ header);

		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
