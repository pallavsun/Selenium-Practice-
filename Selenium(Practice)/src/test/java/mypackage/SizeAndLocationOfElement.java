package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		  WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		  
		  
	  // Location
		  
		  System.out.println("Location :"+logo.getLocation());
		  
		  System.out.println("Location :"+logo.getLocation().getX());
		  System.out.println("Location :"+logo.getLocation().getY());
		  
		  
	  // Size
		  
		  System.out.println("Size :"+logo.getSize());
		  System.out.println("Size :"+logo.getSize().getWidth());
		  System.out.println("Size :"+logo.getSize().getHeight());
		  
		
	}

}
