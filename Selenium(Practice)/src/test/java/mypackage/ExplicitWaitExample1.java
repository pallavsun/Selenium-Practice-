package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.get("https://www.google.com/");
		 
		//Explicit wait
		
		  WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(5));
		  driver.findElement(By.name("q")).sendKeys("selenium");
		  driver.findElement(By.name("q")).sendKeys(Keys.RETURN);   // Press Enter
		  
		  WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Documentation']")));
		          element.click();
		   
		  
	}

}
