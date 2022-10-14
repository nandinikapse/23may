package Seleniumassignmenet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			
			driver.manage().window().maximize();
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
			
			driver.switchTo().frame(iframe);
			
			WebElement drag = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']//following::li[3]"));
			
			WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));//destination
			Thread.sleep(5000);
			Actions action = new Actions(driver);
			action.dragAndDrop(drag, drop).perform();

	}

}


	


