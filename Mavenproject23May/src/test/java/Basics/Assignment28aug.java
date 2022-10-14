package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment28aug {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();//click on close icon
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles"+ Keys.ENTER);//search box
		
		//select first child
		//driver.findElement(By.cssSelector("div[class='_1kidPb']>*:first-child")).click();
		
		//select lastchild
		//driver.findElement(By.cssSelector("div[class='_1kidPb']>*:last-child")).click();
		
		//select nth child
		driver.findElement(By.cssSelector("div[class='_1kidPb']>*:nth-child(3)")).click();
	}

}