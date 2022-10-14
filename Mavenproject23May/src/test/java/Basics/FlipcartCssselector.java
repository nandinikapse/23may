package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcartCssselector {

	public static void main(String[] args) throws InterruptedException {
	
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		//username
		//css selector by any attribute
		WebElement username = driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']"));
		username.sendKeys("9763067660");
		
		Thread.sleep(5000);
		
		//password
		WebElement pwd = driver.findElement(By.cssSelector("input[type='password']"));
		pwd.sendKeys("password123");
		
		//login
		WebElement login = driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		

	}

}
