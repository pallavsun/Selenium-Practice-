package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/*
 * 1- How many rows in a table
 * 2- How many columns in a table
 * 3-Retrieve the specific Row/Column data
 * 4-Retrieve all the data from the table
 * 5- Print Release date ,version no of Java Language of selenium
 * 
 */

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.get("https://www.selenium.dev/downloads/");
		
	}

}
