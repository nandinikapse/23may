package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://demo.actitime.com/login.do");

	driver.manage().window().maximize();
	
	//Implicit Wait or Implicitly Wait
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//username
    WebElement username  = driver.findElement(By.id("username"));
    username.sendKeys("admin");
    
    //password
    WebElement pwd = driver.findElement(By.name("pwd"));
    pwd.sendKeys("manager");
    
    //login
    WebElement login = driver.findElement(By.id("loginButton"));
    login.click();
    
    //logout
    WebElement logout = driver.findElement(By.id("logoutLink"));
    logout.click();
	}

}
