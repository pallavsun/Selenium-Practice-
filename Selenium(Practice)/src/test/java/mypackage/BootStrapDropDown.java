package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.hdfcbank.com");
		 
		// driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		 
		 // Product Type
		 
		List<WebElement> productTypes=(List<WebElement>) driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		System.out.println(productTypes.size());
			
	   for(WebElement ptypes:productTypes)
		   
	   {
		   if(ptypes.getText().equals("Accounts"))
			{
			    ptypes.click();
			    break;
				
			}
	   }
	   
	   
	   // Product
	   
	   driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		
	   List<WebElement> products=(List<WebElement>) driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		
		System.out.println(products.size());
			
	   for(WebElement product:products)
		   
	   {
		   if(product.getText().equals("Salary Accounts"))
			{
			    product.click();
			    break;
				
			}
	   }

	}

}
