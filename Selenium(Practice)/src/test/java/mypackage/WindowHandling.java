package mypackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parenthandle=driver.getWindowHandle();
		System.out.println("parent Window :"+parenthandle);
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles=driver.getWindowHandles();
		
		
	  for(String handle:handles)
		{
			System.out.println(handle);
			
			if(!handle.equals(parenthandle)) {
			driver.switchTo().window(handle);
			driver.findElement(By.id("firstName")).sendKeys("Pallav kumar");
			
			 Thread.sleep(5000);
			driver.close();
			
			}	
		}
		
		driver.switchTo().window(parenthandle);
		driver.findElement(By.id("name")).sendKeys("Sunny");
		
		Thread.sleep(5000);
		
	}

}
