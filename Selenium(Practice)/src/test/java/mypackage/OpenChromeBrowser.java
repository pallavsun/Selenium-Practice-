package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();

	}
	

}
