package Seleniumassignmenet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker2 {

	public static void main(String[] args) {
		
		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.globalsqa.com/demo-site/datepicker/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//li[@id='DropDown DatePicker']")).click();
			
			//iframe
			WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
			driver.switchTo().frame(1);
			
			driver.findElement(By.xpath("")).click();
				
				

	}

}
