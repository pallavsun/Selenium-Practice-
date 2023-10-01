package WorkdayAutomation;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandling {
	
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://smartprogramming.in/");      // parent window
		String parentwindowId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-sm-12 footer-social']//i[@class='fa fa-youtube']")).click();
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-sm-12 footer-social']//i[@class='fa fa-facebook']")).click();
		driver.findElement(By.xpath("//div[@class='col-lg-6 col-sm-12 footer-social']//i[@class='fa fa-instagram']")).click();
		
		
		Set<String> handles=driver.getWindowHandles();
		List<String> hlist= new ArrayList<String>(handles);
		
		if(switchToRightWindow("Home",hlist))
		{
			System.out.println(driver.getCurrentUrl()+" :::: "  +driver.getTitle());
			
	driver.findElement(By.xpath("//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y'][normalize-space()='Videos']")).click();    
		}
		
		System.out.println("---------------------------------------------------");
		
		switchToParentWindow(parentwindowId);
	    System.out.println(driver.getCurrentUrl()+" :::: "  +driver.getTitle());
		
	    closeAllWindows(parentwindowId,hlist);
	    
	    
	}

	
	
	
	public static boolean switchToRightWindow(String windowTitle,List<String> hlist)
	{
		
		for(String e:hlist)
		{
			String title=driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle))
			{
				System.out.println("Found the right window");
				return true;
			}
			
			
		}
		return false;
		
		
	}
	
	
	
	
	public static void switchToParentWindow(String parentwindowId)
	{
		driver.switchTo().window(parentwindowId);
	}
	
	
	
	public static void closeAllWindows(String parentwindowId,List<String> hlist)
	{
		
		for(String e:hlist)
		{
			if(!e.equals(parentwindowId))
		  {
				
	        driver.switchTo().window(e).close();
		 }
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
