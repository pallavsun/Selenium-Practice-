package mypackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://the-internet.herokuapp.com/key_presses");
		 
		 
		 Actions act=new Actions(driver);
		 
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		
		 act.sendKeys(Keys.BACK_SPACE).perform();
		 Thread.sleep(3000);
		 
		 act.sendKeys(Keys.ESCAPE).perform();
		 Thread.sleep(3000);
		 
		 act.sendKeys("hello").perform();      // This can not work becoz action class is use for keyboard operations
		

	}

}
