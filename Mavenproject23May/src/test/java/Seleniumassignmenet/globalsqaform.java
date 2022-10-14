package Seleniumassignmenet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class globalsqaform {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='g2599-name']")).sendKeys("Nandini Kapse");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nandinikapse10@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='url']")).sendKeys("https://www.globalsqa.com/samplepagetest/");
		
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='g2599-experienceinyears']"));
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("1-3");
		
		driver.findElement(By.xpath("//label[@for='g2599-expertise']//following-sibling::label[2]")).click();
		
		driver.findElement(By.xpath("//label[@for='g2599-education']//following-sibling::label[2]")).click();

		driver.findElement(By.xpath("//label[@for='contact-form-comment-g2599-comment']//following-sibling::textarea")).sendKeys("Thanks");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	}


