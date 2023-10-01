package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Statusofwebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
//		isdisplayed() isEnabled()
		
		WebElement searchStore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Display:"+searchStore.isDisplayed());  //true
		System.out.println("Enabled:"+searchStore.isEnabled());  //true

		
		System.out.println("Selected:"+male.isSelected());  //false
		System.out.println("Selected:"+female.isSelected()); //false
		
		male.click();
		
		System.out.println("Selected:"+male.isSelected());  // true
		System.out.println("Selected:"+female.isSelected());  //false
		
         female.click();
		
		System.out.println("Selected:"+male.isSelected());  //false 
		System.out.println("Selected:"+female.isSelected());  //true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
