package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign17sept2 {

	private static WebElement allmenu;

	public static void main(String[] args)  {
		  WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver =new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
			
            driver.findElement(By .xpath("//div[@class='_331-kn _2tvxW']"));
            System.out.println("All menu are ="+ allmenu.getText());
	}

}