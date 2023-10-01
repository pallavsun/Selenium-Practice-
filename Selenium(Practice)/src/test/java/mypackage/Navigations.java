package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		// Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		
		driver.get("https://www.snapdeal.com/");
		driver.get("https://www.amazon.com/");
		
	//driver.navigate().to("https://www.amazon.com/");

		
		driver.navigate().back();  //snapdeal
		driver.navigate().forward();  //amazon
		
		driver.navigate().refresh();
	}

}
