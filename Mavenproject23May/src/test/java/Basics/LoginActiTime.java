package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginActiTime {

	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
       
       ChromeDriver driver = new ChromeDriver();
       
       driver.get("https://demo.actitime.com/login.do");
       
       driver.manage().window().maximize();
       
       //username
       WebElement username  = driver.findElement(By.id("username"));
       //WebElement username = driver.findElement(By.className("textField"));//this is not unique
       
       username.sendKeys("admin");
       
       //password
       WebElement pwd = driver.findElement(By.name("pwd"));
       //or
     //  WebElement pwd = driver.findElement(By.className("pwdfield"));//by using class field locator
       
       
       pwd.sendKeys("manager");
       
       //login
       WebElement login = driver.findElement(By.id("loginButton"));
       
       login.click();
	}

}
