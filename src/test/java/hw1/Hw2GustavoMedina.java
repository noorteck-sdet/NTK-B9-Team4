package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2GustavoMedina {

	public static void main(String[] args) throws InterruptedException {

		// Step 1. set system property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gusta\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

		// Step 2. Create and object of WebDriver

		WebDriver driver = new ChromeDriver();
		// Thread.sleep(3000);

		// maximize the window
		driver.manage().window().maximize();
		// Thread.sleep(3000);
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		// operate the page
		// WebElement username = driver.findElement(By.xpath("//input[@name =
		// 'username']"));
		// username.sendKeys("ntk-admin");
		// mouseOut
		WebElement registerButton = driver.findElement(By.linkText("REGISTER"));
		registerButton.click();

		Thread.sleep(3000);

		// retrieve page title
		String pageTitle = driver.getTitle();

		System.out.println("PageTitle:" + pageTitle);

		WebElement firstName = driver.findElement(By.name("firstName"));

		Thread.sleep(500);

		firstName.sendKeys("Gustavo");

		WebElement LastName = driver.findElement(By.name("lastName"));

		Thread.sleep(500);

		LastName.sendKeys("Medina");

		WebElement Phone = driver.findElement(By.name("phone"));

		Thread.sleep(500);

		Phone.sendKeys("31704010");

		WebElement Email = driver.findElement(By.name("userName"));

		Thread.sleep(500);

		Email.sendKeys("hong@gmail.com");

		WebElement address = driver.findElement(By.name("address1"));

		Thread.sleep(500);

		address.sendKeys("El Dandy");

		WebElement city = driver.findElement(By.name("city"));

		Thread.sleep(500);

		city.sendKeys("SPS");

		WebElement state = driver.findElement(By.name("state"));

		Thread.sleep(500);

		state.sendKeys("Cortez");

		WebElement postal = driver.findElement(By.name("postalCode"));

		Thread.sleep(500);

		postal.sendKeys("7777");

		WebElement country = driver.findElement(By.name("country"));

		Thread.sleep(500);

		country.sendKeys("Honduras");

		WebElement UserName = driver.findElement(By.id("email"));

		Thread.sleep(500);

		UserName.sendKeys("hong@gmail.com");

		WebElement Password = driver.findElement(By.name("password"));

		Thread.sleep(500);

		Password.sendKeys("Hello");

		WebElement ConfirmPass = driver.findElement(By.name("confirmPassword"));

		Thread.sleep(500);

		ConfirmPass.sendKeys("Hello");

		WebElement Submit = driver.findElement(By.name("submit"));

		Thread.sleep(500);

		Submit.click();
		
	
		String ele = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
    	System.out.println("The table text is - " +ele);
    	
    	
    	String find = "Thank you for registering"; 
        
    	boolean val = ele.contains(find); 
    	
    	 if(val) { 
    		 
    		 System.out.println("Test case passed"); }
    					else 
    						System.out.println("Test case failed");
    		 
    	 Thread.sleep(3000);
    	 
    	 
    	// driver.quit();
    	 }
    	

}

		

	



