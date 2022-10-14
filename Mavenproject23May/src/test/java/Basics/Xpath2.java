package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath2 {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
	       
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://demo.actitime.com/login.do");
	       
	       driver.manage().window().maximize();
	       
	       //And  ------     //HtmlTag[@first attribute='value' and @second attribute='value']
	       driver.findElement(By.xpath("//input[@type='text' and @id='username']")).sendKeys("admin");
	       
	       //or -------      //HtmlTag[@first attribute='value' or @second attribute='value']
	       driver.findElement(By.xpath("//input[ @name='pwd' or @class='textField pwdfield']")).sendKeys("manager");
	       
	       driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}
}
