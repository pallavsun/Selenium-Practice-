package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRightClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  
		  
	/*	=============Single right click action =================
	 * 
		  driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		  
		    WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		    
		    Actions act=new Actions(driver);
		    
		    act.contextClick( button).perform();    // Right click action

       */
		  
		  
  /*	======================Double click action perform===========
   * 	  
		  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		  
		  driver.switchTo().frame("iframeResult");
		  WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		  field1.clear();
		  field1.sendKeys("Welcome");
		  
		  
		  WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		  
		  Actions act=new Actions(driver);
		  act.doubleClick(button).perform();    // Perform Double click on button
		  
	*/	  
		
   /*=================Drag and Drop action====================		  
		  
		  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 
		  WebElement rome= driver.findElement(By.id("box6"));    // Source element
		 WebElement italy= driver.findElement(By.id("box106"));   // Target Element
		  
		 Actions act=new Actions(driver);
		 act.dragAndDrop(rome, italy).perform();    // drag and drop action to perform
		  
		  
	*/	  
		  
	/*  =====================Drag and DDrop action on images
		  
		  driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		  
		  WebElement item1=driver.findElement(By.xpath("//li[1]"));    //source element
		  WebElement item2=driver.findElement(By.xpath("//li[2]"));
		  
		  WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));    //target element
		  
		  
		  Actions act=new Actions(driver);
		  
		  //Move both items into trash
		  act.dragAndDrop(item1, trash).perform();
		  act.dragAndDrop(item2, trash).perform();
		  
		
		  */
		  
		
		  
         // Mouse hover action		  
		  driver.get("https://demo.opencart.com/");
		  
		  WebElement desktopsMenu=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		  
		 WebElement macMenuItem= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		  
		 Actions act=new Actions(driver);
		 act.moveToElement(desktopsMenu).moveToElement(macMenuItem).click().perform();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
	
	

}
