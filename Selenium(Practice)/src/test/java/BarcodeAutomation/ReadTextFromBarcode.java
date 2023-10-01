package BarcodeAutomation;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadTextFromBarcode {

	public static void main(String[] args) throws IOException, NotFoundException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		String barCodeUrl=driver.findElement(By.xpath("//div[@id='HTML12']//img[1]")).getAttribute("src");  //  give the value of src
		
		System.out.println(barCodeUrl);
		
		URL url=new URL(barCodeUrl);
		
		BufferedImage bufferedimage=ImageIO.read(url);
		
		// special class of ZXing Api
		
		LuminanceSource luminanceSource= new BufferedImageLuminanceSource(bufferedimage);
		
		BinaryBitmap binaryBitmap =new BinaryBitmap(new HybridBinarizer(luminanceSource));
		
		    Result result=new MultiFormatReader().decode(binaryBitmap);
		    
		    System.out.println(result.getText());
		
		
		
		
		
		
		
	}

}
