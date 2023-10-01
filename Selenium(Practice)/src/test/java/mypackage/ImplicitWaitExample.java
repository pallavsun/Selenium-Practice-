package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.get("https://www.google.com/");
		 
		//Implicit wait
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.findElement(By.name("q")).sendKeys("selenium");
		  driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		  
		  
		  driver.findElement(By.xpath("//a[normalize-space()='Documentation']")).click();
		
	}

}
