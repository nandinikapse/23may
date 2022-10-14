package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hover {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
 
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles"+ Keys.ENTER);
		
		//locate electronics
		//driver.findElement(By.cssSelector("div._1kidPb>span:first-child"));
		//or
		//driver.findElement(By.xpath("//div[@class='_1kidPb']//child::span[1]"));
		//or
        WebElement element = driver.findElement(By.xpath("//span[text()='Electronics']"));
        
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();        
        
	}
	

}
