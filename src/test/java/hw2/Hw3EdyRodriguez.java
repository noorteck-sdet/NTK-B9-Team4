package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw3EdyRodriguez {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url = "https://demo.nopcommerce.com/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Edy Rodriguez\\Desktop\\Selenium B9 Folder\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		Thread.sleep(500);
		driver.manage().window().maximize();

		driver.get(url);
		Thread.sleep(1000);
		WebElement register = driver
				.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		// click element
		register.click();

		String pageTitle = driver.getTitle();
				
		System.out.println("PageTitle:" + pageTitle);
		
		Thread.sleep(500);
		WebElement genderRadio = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		genderRadio.click();

		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		firstName.sendKeys("Edy");
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		lastName.sendKeys("Rodriguez");
				
		//Dropdown
		WebElement dropdownDay = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));

		Select selectDay = new Select(dropdownDay);

		selectDay.selectByVisibleText("1");
		Thread.sleep(1000);
		
		WebElement dropdownMonth = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));

		Select selectMonth = new Select(dropdownMonth);

		selectMonth.selectByVisibleText("June");
		Thread.sleep(500);

		WebElement dropdownYear = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));

		Select selectYear = new Select(dropdownYear);

		selectYear.selectByVisibleText("2000");
		Thread.sleep(500);
		
		WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		emailInput.sendKeys("hon2@gmail.com");
		
		WebElement companyInput = driver.findElement(By.xpath("//*[@id=\"Company\"]"));
		companyInput.sendKeys("Skynet");
		
		WebElement newsletter = driver.findElement(By.xpath("//*[@id=\"Newsletter\"]"));
		newsletter.click();
		
		WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		passwordInput.sendKeys("Tempor");
		
		WebElement confirmPasswordInput = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
		confirmPasswordInput.sendKeys("Tempor");
		
		WebElement registerButton = driver
				.findElement(By.xpath("//*[@id=\"register-button\"]"));
		// click element
		registerButton.click();

		// 5. Retrieve the text for the element
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath(
				"/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"))
				.getText();
		String find = "Your registration completed!!!";
		boolean val = text.contains(find);
		System.out.println("Required text appears: " + val);
		if (text.isEmpty()) {
			System.out.println("Test case failed");
		} else {
			System.out.println("Test case passed");
		}
		driver.quit();
	}
}