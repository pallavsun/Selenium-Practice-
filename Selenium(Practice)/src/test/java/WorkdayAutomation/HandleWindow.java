package WorkdayAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen");
		
		
		
		driver.findElement(By.xpath("//span[@class='user-actions-ico']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		
		String title1= driver.getTitle();
		System.out.println(title1);
		
		driver.findElement(By.id("FirstName")).sendKeys("Pallav");
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		driver.findElement(By.id("Email")).sendKeys("pallav18kumar@gmail.com");
		driver.findElement(By.id("ConfirmEmail")).sendKeys("pallav18kumar@gmail.com");
		driver.findElement(By.id("Username")).sendKeys("Pallav lumar");
		driver.findElement(By.id("check-availability-button")).click();
		
		WebElement testDropDown = driver.findElement(By.id("CountryId"));  
		Select dropdown = new Select(testDropDown);
		dropdown.selectByIndex(3);  
		
		
		WebElement testDrop = driver.findElement(By.xpath("//select[@id='TimeZoneId']"));  
		Select dropdown2 = new Select(testDrop);
		dropdown2.selectByIndex(3);  
		
		
		driver.findElement(By.id("Password")).sendKeys("Kumarpallav@2");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Kumarpallav@2");
		
		

		WebElement testDropDown3 = driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']"));  
		Select dropdown3 = new Select(testDropDown3);
		dropdown3.selectByIndex(2);  
		
		

		WebElement testDropDown4 = driver.findElement(By.id("Details_CompanyRoleId"));  
		Select dropdown4 = new Select(testDropDown4);
		dropdown4.selectByIndex(3);  
		
		
		
		WebElement testDropDown5 = driver.findElement(By.id("Details_CompanySizeId"));  
		Select dropdown5 = new Select(testDropDown5);
		dropdown5.selectByIndex(1);  

		 
		
		driver.findElement(By.id("Details_CompanyWebsiteUrl")).sendKeys("Telus International");
		
		
		
		
		//driver.findElement(By.id("register-button")).click();
		
		
	}

}
