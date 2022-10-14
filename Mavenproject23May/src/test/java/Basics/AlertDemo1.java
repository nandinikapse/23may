package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo1 {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.globalsqa.com/samplepagetest/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[text()='Alert Box : Click Here']")).click();
			
			//driver.switchTo().alert().accept();//1st alert box
			
			//driver.switchTo().alert().accept();//2nd alert box
			
			driver.switchTo().alert().dismiss();
	}

}
