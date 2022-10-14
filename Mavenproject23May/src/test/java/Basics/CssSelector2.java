package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector2 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		//username
		//css selector using any attribute
		
		WebElement username = driver.findElement(By.cssSelector("input[id='user-name']"));//id attribute
		//WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));//placeholder attribute
		//WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
		//WebElement username = driver.findElement(By.cssSelector("input[id='user-name']"));
		//WebElement username = driver.findElement(By.cssSelector("input[id='user-name']"));
		
	}

}
