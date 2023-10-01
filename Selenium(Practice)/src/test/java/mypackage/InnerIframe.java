package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("http://demo.automationtesting.in/Frames.html");
		  
		  driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		  
		 WebElement outerframe=driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));   // capture the Outer iframe   
		 driver.switchTo().frame(outerframe);   // Here we are  passing frame as a webelement (Switch to Outer iframe)
		 
		 
		 
		 WebElement innerframe=driver.findElement(By.xpath("/html/body/selection/div/div/iframe"));  //capture the Inner iframe
		 driver.switchTo().frame(innerframe);   // (Switch to Inner iframe)
	    
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
	}

}
