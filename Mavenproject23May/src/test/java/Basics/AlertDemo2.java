package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		/*
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		driver.switchTo().alert().accept();
		*/
		WebElement button = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		button.click();
		
		Alert alertwindow = driver.switchTo().alert();
		System.out.println("Message  on alert is :  " + alertwindow.getText());
		
		Thread.sleep(5000);
		alertwindow.sendKeys("Welcome to automation class");
		
		alertwindow.accept();
	}

}
