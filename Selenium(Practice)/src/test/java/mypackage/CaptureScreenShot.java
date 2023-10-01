package mypackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




/*=============================================================================
| 
    ScreenShot  Program 
 *===========================================================================*/




public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.nopcommerce.com/en/demo");
		
		//  Full page screenshot
		  
/*		  
		  TakesScreenshot ts=(TakesScreenshot)driver;
		 File src= ts.getScreenshotAs(OutputType.FILE);   /// store the screenshot here in variable src
		 File trg=new File(".\\screenshot\\homepage.png");   // location of screenshot where we store
		 FileUtils.copyFile(src, trg);
*/	 
		 
	  // Capture screenshot of single element
		 
		 WebElement ele=driver.findElement(By.xpath("//img[@title='nopCommerce']"));
		 File src= ele.getScreenshotAs(OutputType.FILE);   /// store the screenshot here in variable src
		 File trg=new File(".\\screenshot\\logo.png");   // location of screenshot where we store
		 FileUtils.copyFile(src, trg);
		 
	 //=====================================================================================//	 
		
/*		 
		 // Get the entire Screen shot
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 
		 File src= ts.getScreenshotAs(OutputType.FILE);   /// store the screenshot here in variable src
		 File trg=new File(".\\screenshot\\homepage.png");   // location of screenshot where we store
		 FileUtils.copyFile(src, trg);
		 
		
		// Negative scenario (Take the screen shot in negative case i-e when webelement is wrong(testcase fail)) 
		 
		 try 
		 {
			driver.findElement(By.id("//img[@title='nopCom']")); 
		 }
		 catch(Throwable e)
		 {
			 File src= ts.getScreenshotAs(OutputType.FILE);   /// store the screenshot here in variable src
			 File trg=new File(".\\screenshot\\newpage.png");   // location of screenshot where we store
			 FileUtils.copyFile(src, trg);
		 }
		 
	*/	 
		 
		 driver.close();
	}

}
