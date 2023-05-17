package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw3GG {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://demo.nopcommerce.com/";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(2000);
		
		WebElement Register = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		
		Thread.sleep(2000);
		
		Register.click();
		
		
		// retrieve the page title
				String pageTitle = driver.getTitle();
				System.out.println("PageTitle:" + pageTitle);
				
				Thread.sleep(2000);
		
	 //Gender
				WebElement maleRadio = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
				WebElement femaleRadio = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));

				
				maleRadio.click();
				
		//FirstName
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		
		firstName.sendKeys("GUSTAVO");
		
		Thread.sleep(2000);
		
		//LastName
				
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		
		lastName.sendKeys("GUERRERO");
		
		Thread.sleep(2000);
		
		//Date of Birth
		
		WebElement birthDay = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));
		WebElement birthMonth = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
		WebElement birthYear = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));
		
	
		birthDay.click();
		Select selectDay = new Select(birthDay);
		selectDay.selectByVisibleText("30");
		
		Thread.sleep(2000);
		
		birthMonth.click();
		Select selectMonth = new Select(birthMonth);
		selectMonth.selectByVisibleText("May");
		
		Thread.sleep(2000);
		
		birthYear.click();
		Select selectYear = new Select(birthYear);
		selectYear.selectByVisibleText("1987");
		
		Thread.sleep(2000);
		
		//Email
		WebElement emailAccount = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		
		emailAccount.sendKeys("gagmhn08@gmail.com");
		
		Thread.sleep(2000);
		
		//Company
		
		WebElement companyName = driver.findElement(By.xpath("//*[@id=\"Company\"]"));
		
		companyName.sendKeys("Noorteck");
		
		Thread.sleep(2000);
		
		//Check
		
		WebElement newsLetter = driver.findElement(By.xpath("//*[@id=\"Newsletter\"]"));
		
		newsLetter.click();
		
		Thread.sleep(2000);
		
		//Password
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		
		password.sendKeys("Noorteck1234");
		
		Thread.sleep(2000);
		
		WebElement confirmPass = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
		
		confirmPass.sendKeys("Noorteck1234");
		
		Thread.sleep(2000);
		
		//Register button
		
		WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
		registerButton.click();
		
		Thread.sleep(2000);
		//Retrieve Confirmation
		
		String confirmation = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")).getText();
		
		String message = "Your registration completed!!!";
		
		System.out.println(message);
		
		Thread.sleep(2000);
		
		if(confirmation.equals(message)) {
			
			System.out.println("TESTCASE PASSED");
		} else {
			
			System.out.println("TESTCASE FAILED");
		}
		
		
		 
		Thread.sleep(3000);

		driver.quit();
	
}
}
	
