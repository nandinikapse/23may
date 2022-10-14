package Seleniumassignmenet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker1 {

	public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.globalsqa.com/demo-site/datepicker/");
			
			driver.manage().window().maximize();
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
			driver.switchTo().frame(iframe);
			
			 driver.findElement(By.xpath("//input[@id='datepicker']")).click();//date box
			 
			// driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']")).click();//calendar
			
			 //6 sep 2022
			// driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();//date
			
			//or
			 //5 oct 2022
			 driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			
			 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']")).click();
			 
			 driver.findElement(By.xpath("//a[@class='ui-state-default']//following::a[4]")).click();
			}

	}


	


