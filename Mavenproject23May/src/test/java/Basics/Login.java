package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();//setup chrome driver
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		

	}

}


