package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		//username <input id = "user-name">
	    //css selector using id attribute
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		//WebElement username = driver.findElement(By.cssSelector("input#user-name"));
	    username.sendKeys("admin");
	    
	    //password<input id="password">
	    //css selector using id attribute
	    WebElement pwd = driver.findElement(By.cssSelector("#password"));
	    //WebElement pwd = driver.findElement(By.cssSelector("input#password"));
	    pwd.sendKeys("manager");
	    
	    //login button <input class="submit-button btn_action">
	    //css selector usingclass attributes
	    WebElement login = driver.findElement(By.cssSelector(".submit-button.btn_action"));
	  //  WebElement login = driver.findElement(By.cssSelector("input.submit-button.btn_action"));
	  //  WebElement login = driver.findElement(By.cssSelector(".submit-button"));//partial value
	   // WebElement login = driver.findElement(By.cssSelector(".btn_action"));//partial value fromm class value
	   // WebElement login = driver.findElement(By.cssSelector("input.submit-button"));
	  //  WebElement login = driver.findElement(By.cssSelector("input.btn_action"));

	    login.click();
	    
	  }

}
