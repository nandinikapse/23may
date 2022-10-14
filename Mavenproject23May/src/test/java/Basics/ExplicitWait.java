package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://demo.actitime.com/login.do");

		driver.manage().window().maximize();
		
		//username
	    WebElement username  = driver.findElement(By.id("username"));
	    username.sendKeys("admin");
	    
	    //password
	    WebElement pwd = driver.findElement(By.name("pwd"));
	    pwd.sendKeys("manager");
	    
	    //login
	    WebElement login = driver.findElement(By.id("loginButton"));
	    login.click();
	    
	    //Explicit Wait or Explicitly Wait
	    //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    //wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink"))).click();
	    
	    //or
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("logoutLink")));
	    
	    //logout
	    driver.findElement(By.id("logoutLink")).click();
	   
	}

}
