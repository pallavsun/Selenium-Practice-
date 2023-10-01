package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
//		
		//ChromeDriver driver =new ChromeDriver();
//		
		WebDriver driver=new ChromeDriver();
//		
//		
//		
		// Chrome Browser
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver=new ChromeDriver();
//		
//		//Firefox Browser
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
		
		driver.get(" https://www.nopcommerce.com/en/demo/");
		System.out.println("Title :"+driver.getTitle());
		System.out.println("URL"+driver.getCurrentUrl());
		System.out.println("Page :"+driver.getPageSource());

	}

}
