package mypackage;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncodeAndDecodePassword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/login");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Pallav18kumar@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(decodeString("dGVzdDEyMw=="));
		
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		}

	
	static String decodeString(String password)
	{
		byte[] decodeString=Base64.decodeBase64(password);
		System.out.println(decodeString);
		return password;
	}
	
	
}
