package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopUpNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options=new ChromeOptions();   //Special class for Browser Level
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver(options);
		  
		  driver.get("https://www.redbus.in/");
		
	}

}
