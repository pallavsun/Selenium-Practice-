package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parenthandle=driver.getWindowHandle();
		System.out.println("parent Window :"+parenthandle);
		
		driver.findElement(By.id("newWindowsBtn")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		List<String> windowId=new ArrayList(handles);      // Convert Set in to array
		
		String parentWindowId=windowId.get(0);
		String firstChileWindowId=windowId.get(1);
		String secondChileWindowId=windowId.get(2);
		
		Thread.sleep(5000);
		
	}
		
	}


