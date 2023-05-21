package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HW3JRDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url = "https://demo.nopcommerce.com/";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(500);
		driver.manage().window().maximize();

		driver.get(url);
		Thread.sleep(1000);
		WebElement registerButton = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		//click element
		registerButton.click();
		Thread.sleep(1000);
		WebElement maleradio = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		WebElement femaleradio = driver.findElement(By.xpath("//*[@id=\"gender-female\"]\r\n"
				+ ""));
		
		maleradio.click();
		
		//First name
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		firstName.sendKeys("Jose");
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		lastName.sendKeys("Rivera");
		
		WebElement birthday = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));
		WebElement birthdayMonth = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
		WebElement birthdayYear = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));

		Select selectday = new Select(birthday);
		selectday.selectByVisibleText("1");
		Thread.sleep(1000);

		Select selectMonth = new Select(birthdayMonth);
		selectMonth.selectByVisibleText("August");
		Thread.sleep(1000);

		Select selectYear = new Select(birthdayYear);
		selectYear.selectByVisibleText("1963");
		Thread.sleep(3000);

		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("josearivera1@gmail.com");
		Thread.sleep(1000);

		WebElement companyName = driver.findElement(By.xpath("//*[@id=\"Company\"]"));
		companyName.sendKeys("Ezsol");
		Thread.sleep(1000);

		WebElement Newsletter = driver.findElement(By.xpath("//*[@id=\"Newsletter\"]"));
		Newsletter.click();
		Thread.sleep(1000);

		WebElement Password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		Password.sendKeys("EGbdf123");
		Thread.sleep(1000);

		WebElement ConfirmPassword = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
		ConfirmPassword.sendKeys("EGbdf123");
		
		WebElement Register = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
		Register.click();
		
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")).getText();
		String find = "Your pregistration completed!!!";
		boolean val = text.contains(find);
		System.out.println("Required text appears: " + val);
		if (text.isEmpty()) {
			System.out.println("Text case failed");
		}else {
			System.out.println("Test case passed");
		}

		driver.quit();
		
		//Gender
		
		
	}
}
