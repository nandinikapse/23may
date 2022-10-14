package Seleniumassignmenet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiiTimeLogin {

	public static void main(String[] args) {
		
		    WebDriverManager.chromedriver().setup();
	        
	        ChromeDriver driver = new ChromeDriver();
	        
	        driver.get("https://demo.actitime.com/user/submit_tt.do");
	        
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	        
	       driver.findElement(By.id("username")).sendKeys("admin");
	        
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	        
	       driver.findElement(By.id("loginButton")).click();
	        
	       WebElement username = driver.findElement(By.xpath("//a[@class='userProfileLink username ']"));
	       username.click();
		  System.out.println("Welcome John Doe");
		  }

}
