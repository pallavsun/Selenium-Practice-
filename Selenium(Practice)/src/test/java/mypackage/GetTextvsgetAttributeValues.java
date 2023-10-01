package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextvsgetAttributeValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement emailinputbox=driver.findElement(By.id("Email"));
		
		emailinputbox.clear();
		emailinputbox.sendKeys("123@gmail.com");
		
		
      // capturing text from input box
		
		System.out.println("Result from getattribute() method :"+emailinputbox.getAttribute("value"));
		
		System.out.println("Result from getText() method :"+emailinputbox.getText());
		
		
	//Login Button
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		
		System.out.println(button.getAttribute("type"));
		System.out.println(button.getAttribute("class"));
		
		
		System.out.println(button.getText());  // give innertext
		
		
		String title=driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
		System.out.println(title);
		

	}

}
