package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JoseRiveraHW2 {

	private static final WebElement ConfirmPass = null;

	public static void main(String[] args) throws InterruptedException {

		// Step 1. set system property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruthman Santos\\Desktop\\Selenium B9\\chromedriver.exe");
	// Step 2. Create and object of WebDriver

		WebDriver driver = new ChromeDriver();
		//Thread.sleep(3000);
		
		//maximize the window
		driver.manage().window().maximize();
	//	Thread.sleep(3000);
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		//operate the page
		//WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
		//username.sendKeys("ntk-admin");
		//mouseOut
		WebElement registerButton = driver.findElement(By.linkText("REGISTER"));
		registerButton.click();
		
		Thread.sleep(3000);
		
		//retrieve page title
		String pageTitle = driver.getTitle();
		
		System.out.println("PageTitle:" + pageTitle);
		
		WebElement firstName = driver. findElement(By.name("firstName"));
		
		Thread.sleep(500);
		
		firstName.sendKeys("Jose");
		
		WebElement lastName = driver. findElement(By.name("lastName"));
		
		Thread.sleep(500);
		
		lastName.sendKeys("Rivera");
		
		WebElement Phone = driver. findElement(By.name("phone"));
		
		Thread.sleep(500);
		
		Phone.sendKeys("9862124896");
		
		WebElement Email = driver. findElement(By.name("userName"));
		
		Thread.sleep(500);
		
		Email.sendKeys("josearivera63@gmail.com");
		
		WebElement Address = driver. findElement(By.name("address1"));
		
		Thread.sleep(500);
		
		Address.sendKeys("1306 Farmindale");
		
		WebElement City = driver. findElement(By.name("city"));
		
		Thread.sleep(500);
		
		City.sendKeys("Capitol Heights");
		
		WebElement State = driver. findElement(By.name("state"));
		
		Thread.sleep(500);
		
		State.sendKeys("Maryland");
		
		WebElement PostalCode = driver. findElement(By.name("postalCode"));
		
		Thread.sleep(500);
		
		PostalCode.sendKeys("20743");
		
		Thread.sleep(500);
		WebElement countryInput = driver.findElement(By.xpath("//select[@name = 'country']"));
		countryInput.sendKeys("UNITED STATES");
		
		WebElement userName = driver.findElement(By.name("email"));
		
		userName.sendKeys("jose@maf.com");
		
		WebElement Password = driver.findElement(By.name("password"));
		
		Password.sendKeys("Diego");
		
		WebElement ConfirmPass = driver.findElement(By.name("confirmPassword"));
		
		ConfirmPass.sendKeys("Diego");
		
		WebElement Submit = driver.findElement(By.name("submit"));
		
		Thread.sleep(500);
		
		Submit.click();
		
		String ele = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
    	System.out.println("The table text is - "+ele);
		
    	String find = "Thank you for registering.";
		
			boolean val = ele.contains(find);
			if(val) {
				System.out.println("Test case passed");}
			else 
				System.out.println("Test case failed");
			
			Thread.sleep(3000);
		
		driver.quit();
		
	}

}
