package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links_ForgotPassword {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
	       
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://demo.actitime.com/login.do");
	       
	       driver.manage().window().maximize();
	       
	       //link  text
	     //  WebElement forgotpwd = driver.findElement(By.linkText("Forgot your password?"));
	       
	     //  forgotpwd.click();
	       
	       //Partial  link  text
	       WebElement forgotpwd = driver.findElement(By.partialLinkText("Forgot"));
	       
	       forgotpwd.click();

	}

}
