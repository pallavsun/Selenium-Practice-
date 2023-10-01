package WorkdayAutomation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		List<WebElement>chklist=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'ion')]"));
		
		for(WebElement cb:chklist)
		{
			 cb.click();
		}

		
	}

}
