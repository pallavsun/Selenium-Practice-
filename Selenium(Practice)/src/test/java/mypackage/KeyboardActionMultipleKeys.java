package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActionMultipleKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://text-compare.com/");
		 
		 
		 WebElement input1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		 WebElement input2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));

		 input1.sendKeys("Welcome to Selenium");
		 
		 Actions act=new Actions(driver);
		 
		 //CTRL + A   (Select the Text from the first box)
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("a");
		 act.keyUp(Keys.CONTROL);   // Release the control key
		 act.perform();
		 
		 
		 //CTRL + C
		 
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("c");
		 act.keyUp(Keys.CONTROL);   // Release the control key
		 act.perform();
		 
		 // Tab key  --(Shift to box2)
		 
		 act.sendKeys(Keys.TAB);
		 act.perform();
		 
		 
		 //CTRL + V
		 
		 act.keyDown(Keys.CONTROL);
		 act.sendKeys("v");
		 act.keyUp(Keys.CONTROL);   // Release the control key
		 act.perform();
		 
		 
		 // compare text
		 
		 if(input1.getAttribute("value").equals(input2.getAttribute("value")))
		 {
			 System.out.println("Text Copied");
		 }
		 
		 else
		 {
			 System.out.println("Text not copied");
		 }
		 
		 
	}

}
