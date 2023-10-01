package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		 WebElement drpCountryEle=driver.findElement(By.id("input-country"));
		 
		 Select drpCountry=new Select(drpCountryEle);
//		 drpCountry.selectByVisibleText("Denmark");
//		 drpCountry.selectByValue("10");  // Argentina
//		 
//		 drpCountry.selectByIndex(13);  // Australia
		 
		 
		 
		// Selecting option from Dropdown without using methods
		 
		List<WebElement> alloptions=drpCountry.getOptions();
		
		
		for(WebElement option:alloptions)
		{
			
			if(option.getText().equals("Cuba"))
			{
			    option.click();
			    break;
				
			}
			
		}
		
		
		
		
		}
		 
	}


