package Basics;

import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow1 {

	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles"+ Keys.ENTER);
			
			System.out.println(driver.getTitle());
			Thread.sleep(10000);
			driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9' and @alt='Infinix HOT 12 Play (Horizon Blue, 64 GB)']")).click();

			Set<String> windowID = driver.getWindowHandles();
			//set with iterator use iterator
			
			HashSet setwindow = new HashSet(windowID);
			Iterator<String> window = setwindow.iterator();
			while(window.hasNext()) {
				String child_window = window.next();
				driver.switchTo().window(child_window).getTitle();
			}
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			
	}

}
