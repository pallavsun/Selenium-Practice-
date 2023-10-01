package mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		// getwindowhandle() - get the id of the  browser window return a string
        // getwindowhandles()- get the id of the  multiple browser window return a Set<String>
		
		
		
//		String windowId=driver.getWindowHandle();
//		System.out.println(windowId);
		
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();   // opens another browser window (child window)
      Set<String> windowsIDs=driver.getWindowHandles();		 // returns ids of multiple browser window
      
     // first Method-  By iterator
   
    /*  
        Iterator<String> it= windowsIDs.iterator();
    
       String parentWindowID=it.next();
       String childWindowID=it.next();
      
     
       System.out.println("Parent window Id"+parentWindowID);
      System.out.println("Child window Id"+childWindowID);
		 
	*/
      
      
   //  Second Method -using  List/ArrayList
      
      List<String> windowIDsList= new ArrayList(windowsIDs);  // Converting set to List
 /*     
      String parentWindowID=windowIDsList.get(0);
      String childWindowID=windowIDsList.get(1);
      
      
      System.out.println("Parent window Id"+parentWindowID);
      System.out.println("Child window Id"+childWindowID);
		 
      
   // How to use window Id for switching purpose
      
      driver.switchTo().window(parentWindowID);
      System.out.println("Parent window Title :"+driver.getTitle());
      
      
      
      
      driver.switchTo().window(childWindowID);
      System.out.println("Child window Title :"+driver.getTitle());
      
   */
      
      
    // For Each Loop
  /*    
      for(String winid:windowIDsList)
      {
    	  //System.out.println(winid);
    	  
    	String title=driver.switchTo().window(winid).getTitle(); 
    	System.out.println(title);
    	  
      }
      
      
    */  
      
	//driver.close();	     // close the single browser which pointing
	//driver.quit();        // close all the browser window
		
      
      
      for(String winid:windowIDsList)
      {
    	  
    	  
    	String title=driver.switchTo().window(winid).getTitle(); 
    	if(title.equals("OrangeHRM"))
       {
    		
    		driver.close();
    		
    	}
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

}
