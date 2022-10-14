package Seleniumassignmenet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullFlow {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.demoblaze.com/index.html");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
        driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
        
        driver.findElement(By.cssSelector("a[class='btn btn-success btn-lg']")).click();
        
        Thread.sleep(5000);
        
        driver.switchTo().alert().accept();
        
        driver.findElement(By.id("cartur")).click();
        
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        
        driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Nandini");
        
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
        
        driver.findElement(By.cssSelector("input[id='city']")).sendKeys("Amravati");
        
        driver.findElement(By.xpath("//input[@id='card']")).sendKeys("12345678");
        
        driver.findElement(By.xpath("//input[@id='month']")).sendKeys("September");
        
        driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2022");
        
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[text()='OK']")).click();

	}

}
