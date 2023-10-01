//package mypackage;
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CheckDropDownDownSortedOrNot {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		WebDriverManager.chromedriver().setup();   // set up the chrome driver
//        WebDriver driver =new ChromeDriver();
//        
//        
//       driver.get("https://www.twoplugs.com/newsearchserviceneed");
//       driver.manage().window().maximize();
//       
//       driver.findElement(By.xpath("//a[text()='Live Posting']")).click();  // Click action on Live Posting
//       
//         WebElement drpElement=driver.findElement(By.name("category_id"));
//       
//         Select drpselect=new Select(drpElement);
//       
//        List<WebElement> options=drpselect.getOptions();
//        
//        ArrayList originallist=new ArrayList();
//        ArrayList templist=new ArrayList();
//        
//        
//        for(WebElement option:options)
//        {
//        	originallist.add(option.getText());
//        	templist.add(option.getText());
//        }
//        
//        System.out.println("Original List :"+originallist);
//        System.out.println("Temop List :"+templist);
//        
//      
//       Collections.sort(templist);
//       
//       System.out.println("Original List :"+originallist);
//       System.out.println("Temop List :"+templist);
//       
//       
//       if(originallist.equals(templist))
//       {
//    	   System.out.println("Drop Down Sorted");
//       }
//       
//       else
//       {
//    	   System.out.println("Drop Down UnSorted");
//       }
//       
//       
//       
//       driver.close();
//       
//       
//       
//       
//	}
//
//}
