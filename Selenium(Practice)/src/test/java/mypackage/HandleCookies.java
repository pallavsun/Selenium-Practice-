package mypackage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://demo.nopcommerce.com/");
		  
	
	// How to capture cookies from browser
		  
		  Set<Cookie> cookies=driver.manage().getCookies();
		  System.out.println("Size of cookie "+cookies.size());


		  
	// How to print cookies from browser
		  
  for(Cookie cookie:cookies)
	 {
		System.out.println(cookie.getName()+ "  "  +cookie.getValue());	  
	}
		  
		
   // How to add Cookie  to the browser
  
    Cookie cokkieobj=new  Cookie("Mycookie","12345");
    driver.manage().addCookie(cokkieobj);
  

    // After adding the cookie(Size of cookie)
    
	   cookies=driver.manage().getCookies();
	  System.out.println("Size of cookies after adding "+cookies.size());
	  
	  
	 // How to delete specific cookie from browser
	  
	  driver.manage().deleteCookie(cokkieobj);    // pass the cookie object
	  cookies=driver.manage().getCookies();
	  System.out.println("Size of cookies after deleting "+cookies.size());

	// driver.manage().deleteCookieNamed("Mycookie");     // delete a particular cookie
  
	  
	 // How to delete all the cookies from browser
	  
	  driver.manage().deleteAllCookies();
	  cookies=driver.manage().getCookies();
	  System.out.println("Size of cookies after deleting all the cookies "+cookies.size());
	  
  
  driver.quit();
  
  
  
  
  
  
  
  
  
  
	}

}
