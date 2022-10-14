package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo3 {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		
		driver.findElement(By.xpath("//div[@class='_37M3Pb']//child::div[8]")).click();
		
		try {
			driver.switchTo().alert().accept();
		}
		catch( Throwable ex) {
			System.out.println("Exception handled " + ex);
		}
		driver.findElement(By.xpath("//div[text()='Round Trip']")).click();

	}

}
