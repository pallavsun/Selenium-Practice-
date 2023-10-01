package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDownGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.hdfcbank.com");
		 
		// driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		 
		 // Product Type
		 
		List<WebElement> productTypes=(List<WebElement>) driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		selectoptionFromDropDown(productTypes,"Accounts");
		
	   
	   // Product
	   
	   driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		
	   List<WebElement> products=(List<WebElement>) driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		selectoptionFromDropDown(products,"Savings Accounts");	
	 
		   
		   

	}

	
	
	//=========================Generic Method  use for Multiple Bootstrap DropDown=================
	public static void selectoptionFromDropDown(List<WebElement> options ,String value)
	{
		for(WebElement option:options)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
	}
}
