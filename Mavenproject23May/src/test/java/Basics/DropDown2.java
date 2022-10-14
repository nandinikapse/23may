package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown2 {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.globalsqa.com/samplepagetest");
		
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='g2599-experienceinyears']"));
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("1-3");
		
		//select.selectByIndex(3);//5-7
		
		
	}

}
