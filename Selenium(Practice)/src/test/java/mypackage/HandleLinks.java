package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.amazon.in/ref=nav_logo");
	  
	  //driver.findElement(By.linkText("Today's Deals")).click(); // Link Text
	  //driver.findElement(By.partialLinkText("Deals")).click();  // partial Link Text
	  
	  
	// ===== How to capture all the links==========
	  
	  
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	  //System.out.println("No of Links  :"+links.size());
	    
	    
	 //======== Normal for Loop=======
	    
 /*	    
	    for(int i=0;i<links.size();i++)
	    { 
	    	System.out.println( links.get(i).getText());     // get the name of link
	    	System.out.println( links.get(i).getAttribute("href"));  // get the target of the link
	    }
	    
	    
	 */   
	    
	    
	// ==============For each Loop========    
	    
	    
	    for(WebElement link:links)
	    {
	    	System.out.println(link.getText());
	    	System.out.println( link.getAttribute("href"));
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  
	}

}
