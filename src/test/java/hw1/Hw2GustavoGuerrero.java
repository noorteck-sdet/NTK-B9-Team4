package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2GustavoGuerrero {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Step 1. set system property

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\owner\\Desktop\\SELENIUM\\chromedriver.exe");

				// Step 2. Create an object of WebDriver

				WebDriver driver = new ChromeDriver();

				Thread.sleep(3000);

				// Maximize the browser

				driver.manage().window().maximize();

				Thread.sleep(3000);
				
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
				
				Thread.sleep(3000);
				
				firstName.sendKeys("Gustavo");
				
				WebElement lastName = driver. findElement(By.name("lastName"));
				
				Thread.sleep(3000);
				
				lastName.sendKeys("Guerrero");
				
				WebElement Phone = driver. findElement(By.name("phone"));
				
				Thread.sleep(3000);
				
				Phone.sendKeys("50494355362");
				
				WebElement Email = driver. findElement(By.name("userName"));
				
				Thread.sleep(3000);
				
				Email.sendKeys("gagmhn08@gmail.com");
				
				WebElement Address = driver. findElement(By.name("address1"));
				
				Thread.sleep(3000);
				
				Address.sendKeys("13403 SW 256");
				
				WebElement City = driver. findElement(By.name("city"));
				
				Thread.sleep(3000);
				
				City.sendKeys("Terrace");
				
				WebElement State = driver. findElement(By.name("state"));
				
				Thread.sleep(3000);
				
				State.sendKeys("Florida");
				
				WebElement PostalCode = driver. findElement(By.name("postalCode"));
				
				Thread.sleep(3000);
				
				PostalCode.sendKeys("33032");
				
				Thread.sleep(3000);
				WebElement countryInput = driver.findElement(By.xpath("//select[@name = 'country']"));
				countryInput.sendKeys("UNITED STATES");
				
				WebElement userName = driver.findElement(By.name("email"));
				
				userName.sendKeys("gagmhn08@outlook.es");
				
				WebElement Password = driver.findElement(By.name("password"));
				
				Password.sendKeys("Neyde");
				
				WebElement ConfirmPass = driver.findElement(By.name("confirmPassword"));
				
				ConfirmPass.sendKeys("Neyde");
				
				WebElement Submit = driver.findElement(By.name("submit"));
				
				Thread.sleep(3000);
				
				Submit.click();
				
				String ele = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
			System.out.println("The table text is - "+ele);
				
			String find = "Thank you for registering.";
				
					boolean val = ele.contains(find);
					if(val) {
						System.out.println("Test case passed");}
					else 
						System.out.println("Test case failed");
					
					Thread.sleep(3000);
				
				driver.quit();

	
}
}
