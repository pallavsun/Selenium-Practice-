package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDown {
	
  static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		// Approach 1
		
//		Select noOfEmpsdrp=new Select((WebElement) driver.findElements(By.name("NoOfEmployees")));
//		noOfEmpsdrp.selectByVisibleText("16-20");
//		
//		Select industrydrp=new Select((WebElement) driver.findElements(By.name("Industry")));
//		industrydrp.selectByVisibleText("Travel");
//		
//		Select countrydrp=new Select((WebElement) driver.findElements(By.name("Country")));
//		countrydrp.selectByVisibleText("Aruba");

		
		// Approach 2 (if we have multiple dropdowns )
		   
		WebElement noOfEmpsEle= driver.findElement(By.name("NoOfEmployees"));
		selectOptionFromDropDown(noOfEmpsEle,"16 - 20");
		
		WebElement industryEle= driver.findElement(By.name("Industry"));
		selectOptionFromDropDown(industryEle,"Healthcare");
		
		WebElement country= driver.findElement(By.name("Country"));
		selectOptionFromDropDown(country,"Ghana");
		
		}
	
	
	public static void  selectOptionFromDropDown(WebElement ele,String value)
	{
		Select drp=new Select(ele);
		
    List<WebElement> alloptions=drp.getOptions();
		
		
		for(WebElement option:alloptions)
		{
			
			if(option.getText().equals(value))
			{
			    option.click();
			    break;
				
			}
			
		}
		
	}
	
	
	

}
