package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath10 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
		
		driver.manage().window().maximize();
		
		//following-sibling  example 1
		  //In Education,select post graduate.Education is the first child of their parent
		
		driver.findElement(By.xpath("//label[text()='Education']//following-sibling::label[2]")).click();
		
		
	/*	driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		//following sibling example 2
		
		driver.findElement(By.xpath("//span[text()='Sort By']//following-sibling::div[3]")).click();
		*/
		}

}
