package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath4 {

	public static void main(String[] args) {
		
		   WebDriverManager.chromedriver().setup();
	       
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://demo.actitime.com/login.do");
	       
	       driver.manage().window().maximize();
	       
	       //starts with ---- //htmltag[starts-with(@attribute,'value')]
	       driver.findElement(By.xpath("//input[starts-with(@placeholder,'Username')]")).sendKeys("admin");
	       
           driver.findElement(By.xpath("//input[starts-with(@placeholder,'Password')]")).sendKeys("manager");
           
           driver.findElement(By.xpath("//a[starts-with(@id,'loginButton')]")).click();
	}

}
