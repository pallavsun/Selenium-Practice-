package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
	
		
   // Go to 1st Frame
		driver.switchTo().frame("packageListFrame");
	  driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
	  driver.switchTo().defaultContent();  // go back to main page
	  
	// Go to 2nd Frame 
	  
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
		 driver.switchTo().defaultContent();  // go back to main page
		  
	// Go to 3rd Frame  
		 
		 driver.switchTo().frame("classFrame");
		 driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']")).click();
	  
	  
	  
	}

}
