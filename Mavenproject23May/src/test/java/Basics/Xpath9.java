package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath9 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	       
		ChromeDriver driver = new ChromeDriver();
		       
		driver.get("https://www.flipkart.com/");
		       
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles"+ Keys.ENTER);
		
		//parent
		driver.findElement(By.xpath("//span[@class='_2I9KP_']//parent::div")).click();
	}

}
