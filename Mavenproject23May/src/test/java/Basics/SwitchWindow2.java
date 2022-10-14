package Basics;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles"+ Keys.ENTER);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9' and @alt='Infinix HOT 12 Play (Horizon Blue, 64 GB)']")).click();

		Set<String> windowID = driver.getWindowHandles();
		
		ArrayList<String>windowList = new ArrayList<String>(windowID);
		
		//for each
		for(String window:windowList) {
			driver.switchTo().window(window);
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();  //Add to cart

	}

}
