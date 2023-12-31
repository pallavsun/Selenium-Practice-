package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJqueryDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();   // set up the chrome driver
        WebDriver driver =new ChromeDriver();
		
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("justAnInputBox")).click();
		
	  //selectChoiceValues(driver,"choice 1");
		
	  //selectChoiceValues(driver,"choice 1","choice 2 3","choice 6 2");		
		
   	selectChoiceValues(driver,"all");
		
	
	}
	
	
	//=====================Creating Generic Method =============
	
	
	public static void selectChoiceValues(WebDriver driver,String...value)
	
	{
		
	 List<WebElement> choiceList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));	
	 
	 if(!value[0].equalsIgnoreCase("all"))
  {
	
		 for(WebElement item:choiceList)
		 {
			 String text=item.getText();
			 
	     for(String val:value)
	     {
			 
		if(text.equals(val))
		{
			item.click();
			break;
			
		}
		
	     }
					
			 
		 }
	
		 
  }	 
		 
	else
		 
	{
		try
	{
			 
       for(WebElement item:choiceList)
    	   
       {
    	   item.click();
       }
    	   
	}
		
		catch(Exception e)
		{
			
		}
	
			 
	}
		 
		 
  
	 
	 
	 
	}
	
	
	
	
	
	
	
	
	
}
