package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationtTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	  //  RegistrationPage Rg=new  RegistrationPage(driver);    // Creating the object of Registration page 
	    
	    Registration2 Rg=new  Registration2(driver);    // Creating the object of Registration2 page 
	    
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/");
	    Rg.clickRegLink();
	    Rg.setFirstName("Pallav");
	    Rg.setLastName("Kumar");
	    Rg.setPhone("7906189818");
	    Rg.setemail("pallav18kumar@gmail.com");
	    Rg.setAddress1("Mayur Vihar");
	    
	    Rg.setcity("Kanpur");
	    Rg.setstate("Delhi");
	    Rg.setpostalCode("110096");
	    
	    Rg.setCountry("INDIA");
	    Rg.setuserName("Pallav");
	    Rg.setPassword("Welcome");
	    Rg.setConfirmPassword("Welcome");
	    
	    Thread.sleep(4000);
	    
	    Rg.clickRegBtn();
	    
		
	}
	
	

}
