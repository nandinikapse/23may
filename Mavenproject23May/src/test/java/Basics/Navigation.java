package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.navigate().back();//flipkart homepage
		
		Thread.sleep(5000);
		
		driver.navigate().forward();//again on list  page of mobiles
		
		Thread.sleep(10000);
		
		driver.close();
		
		//driver.findElement(By.xpath("//div[@class='_37M3Pb']//child::div[5]")).click();
		

	}

}
