package FileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFileUsingChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.id("pdfbox")).sendKeys("Pallav Kumar");
		driver.findElement(By.id("createPdf")).click();    // generate Txt file
		
		driver.findElement(By.id("pdf-link-to-download")).click();     // display download
	}

}
