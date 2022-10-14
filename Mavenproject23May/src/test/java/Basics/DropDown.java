package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		driver.manage().window().maximize();
		
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			
			//classname ref_variable = new classname();
			Select select = new Select(dropdown);
			
		//	select.selectByVisibleText("Books");
			
		//	select.selectByIndex(4);//Amazon Fresh//index value starts from 0
			
			select.deselectByValue("search-alias=appliances");//appliances
			

	}

}
