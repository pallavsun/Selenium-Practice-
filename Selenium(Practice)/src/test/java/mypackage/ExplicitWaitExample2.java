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

public class ExplicitWaitExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.get("https://www.google.com/");
		 
		//Explicit wait
		
		
		  
		  driver.findElement(By.name("q")).sendKeys("selenium");
		  driver.findElement(By.name("q")).sendKeys(Keys.RETURN);   // Press Enter
		  
		  
		  By elelocator=By.xpath("//a[normalize-space()='Documentation']");
		  
		  waitForElementPresent(driver,elelocator,10).click();
		         
		  
	}
	
	
	//=============generic Method (for multiple WebElement)==============
	
	   public static WebElement waitForElementPresent(WebDriver driver,By locator ,int timeout) 
	   {
		   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		   wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		   
		   
		   return driver.findElement(locator);
		   
		   
		   
	   }
	
	
	

}
