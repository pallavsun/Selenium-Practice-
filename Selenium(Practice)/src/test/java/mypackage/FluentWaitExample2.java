package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.get("https://www.google.com/");
	
 
		   driver.findElement(By.name("q")).sendKeys("selenium");
		  driver.findElement(By.name("q")).sendKeys(Keys.RETURN);   // Press Enter
		  
		By elementLoc=By.xpath("//a[normalize-space()='Documentation']");
		  
		  waitForElementWithFluentWait(driver,elementLoc);
  
	}

	
	
	public static WebElement  waitForElementWithFluentWait(WebDriver driver , final By locator)  {
		
		
		Wait<WebDriver> mywait= new FluentWait<WebDriver>(driver)            // Declaration part
				.withTimeout(Duration.ofSeconds(30))             
		        .pollingEvery(Duration.ofSeconds(2))
		        .ignoring(NoSuchElementException.class);
		
		
		 WebElement element=mywait.until(new Function<WebDriver ,WebElement>() {
			  
				public WebElement apply(WebDriver driver)  {
					
		return driver.findElement(locator);
				}
		 });
			
		return element;
		
	}
	
	
	
	
	

}
