package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath6 {

	public static void main(String[] args) {
		
	   WebDriverManager.chromedriver().setup();
	       
	   ChromeDriver driver = new ChromeDriver();
	       
	   driver.get("https://demo.actitime.com/login.do");
	       
	   driver.manage().window().maximize();
	   
	   //Following
	   //Username
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	   
	   //Password
	   driver.findElement(By.xpath("//input[@name='username']//following::input[1]")).sendKeys("manager");

	   //Login
	   driver.findElement(By.xpath("//input[@name='username']//following::a[1]")).click();
	}

}
