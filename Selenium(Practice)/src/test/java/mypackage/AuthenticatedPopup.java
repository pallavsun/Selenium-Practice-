package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatedPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		// syntax of providing username and password
		
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		//http://username:password@URL
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
