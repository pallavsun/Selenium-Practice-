package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteGooglePlacesDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
        
		WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		WebElement searchBox=driver.findElement(By.id("autocomplete"));
		searchBox.clear();
		
		Thread.sleep(3000);
		
		
		searchBox.sendKeys("Toronto");
		
		String text;
		
		do
		{
			searchBox.sendKeys(Keys.ARROW_DOWN);
		
		     text=searchBox.getAttribute("value");
		     
		     if(text.equals("Toronto, OH, USA"))
		     {
		    	 searchBox.sendKeys(Keys.ENTER);
		    	 break;
		     }

				Thread.sleep(3000);
		} while(!text.isEmpty());
		
		
		
		
		
		
		
	}

}
