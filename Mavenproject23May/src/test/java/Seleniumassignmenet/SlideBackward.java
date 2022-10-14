package Seleniumassignmenet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SlideBackward {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement slidebackward = driver.findElement(By.cssSelector("div[id='red']>*:last-child"));
		
		Actions red = new Actions(driver);
		red.dragAndDropBy(slidebackward, -150, 0).perform();
	}

}
