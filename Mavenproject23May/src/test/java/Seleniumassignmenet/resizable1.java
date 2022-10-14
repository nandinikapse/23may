package Seleniumassignmenet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resizable1 {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/resizable/");
			
			driver.manage().window().maximize();
			
			//iframe
			WebElement iframe =  driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
			driver.switchTo().frame(iframe);
			
			WebElement resize = driver.findElement(By.cssSelector("div[id='resizable']>*:last-child"));
			Actions action = new Actions(driver);
			
	        //action.dragAndDropBy(resize, 170, -20).perform();
			//action.dragAndDropBy(resize, -50, 60).perform();
            //action.dragAndDropBy(resize, -50, -132).perform();
              action.dragAndDropBy(resize, 80, 60).perform();
	}

}
