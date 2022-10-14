package Basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles"+ Keys.ENTER);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9' and @alt='OPPO K10 (Blue Flame, 128 GB)']")).click();
		
		Set<String>windowsID = driver.getWindowHandles();
		//Arraylist  or list
		ArrayList<String>windowList = new ArrayList<String>(windowsID);
		
		String window1 = windowList.get(0);
		String window2 = windowList.get(1);
     
		driver.switchTo().window(window2);//switching to window2
		 System.out.println(driver.getTitle());
		 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();//Add to cart

	}

}
