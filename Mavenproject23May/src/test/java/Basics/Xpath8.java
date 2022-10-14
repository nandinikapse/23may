package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath8 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	       
		ChromeDriver driver = new ChromeDriver();
		       
		driver.get("https://www.flipkart.com/");
		       
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles"+ Keys.ENTER);
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//div[@class='_1kidPb']//child::a[1]")).click();
		
		//Thread.sleep(3000);
	
		driver.findElement(By.xpath("//div[@class='_1kidPb']//child::span[3]")).click();
		
	

	}

}
