package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");

//  1) ==================== select specific check box ============
		
    //		driver.findElement(By.xpath("//input[@id='monday']")).click();   //Monday
		
		
// 2) ==========Select all the check boxes ==========
		
		List<WebElement>checkboxes=(List<WebElement>) driver.findElements(By.xpath("//input[@type='checkbox'  and contains(@id,'day')]"));
		
		System.out.println("Size of checkboxes :"+checkboxes.size());
		
	
	//    Using For loop -----	
		
	//	for(int i=0;i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		
	//   Using For Each loop -----		
		
//		
//		for(WebElement chbox:checkboxes)
//		{
//			chbox.click();
//		}
		
		
  //  3) -===================   Select Multiple check boxes i.e Monday and sunday =============		
		
/*		
		for(WebElement chbox:checkboxes)
		{
				String checkboxname=chbox.getAttribute("id");
				
				if(checkboxname.equals("monday") || checkboxname.equals("sunday"))
				{
					chbox.click();
				}
		}
	*/	
		
  // 4) ==========Select Last 2 check boxes===============

// Total no of checkboxes- no of checkboxes want to select = starting index		

/*		
		int totalcheckboxes=checkboxes.size();
		
		for(int i=totalcheckboxes-2;i<totalcheckboxes;i++)
		{
			
			checkboxes.get(i).click();
		}
		
	*/
		
	
// 5)  =======Select first 2 checkboxes==========		
		
		int totalcheckboxes=checkboxes.size();

		for(int i=0;i<totalcheckboxes;i++)
		{
			if(i<2)
			{
			
			checkboxes.get(i).click();
			};
		}
		
		
		
		
		
		
	}

}
