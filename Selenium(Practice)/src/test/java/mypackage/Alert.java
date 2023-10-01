package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	/*	
	// ========= Alert Window with OK Button=========
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	
		*/
		
  //============Alert Window with open and Cancel button==============

 /*		
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	Thread.sleep(3000);
	//driver.switchTo().alert().accept();    // close alert by using OK button
	driver.switchTo().alert().dismiss(); 	// close alert by using cancel button
		
	*/
		

 //=========Alert Window with Input Box ,capture Text from Alert=========
			
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();	
	org.openqa.selenium.Alert alertwindow=driver.switchTo().alert();
	
	System.out.println("The Message displayed on alert :"+alertwindow.getText());
	
	alertwindow.sendKeys("Welcome Pallav");
	 alertwindow.accept();
	   
		
		
		
		

	}

}
