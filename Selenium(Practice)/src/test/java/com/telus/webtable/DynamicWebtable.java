package com.telus.webtable;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {

		//Location of chrome driver and Launch
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");

		//Creating an object instance for Chrome Webdriver
		WebDriver driver = new ChromeDriver();

		//Maximize browser window
		driver.manage().window().maximize();


		//Store the url in a string variable
		String url = "https://money.rediff.com/gainers/bsc/daily/groupall";

		//Name of the company whose details are needed
		String company = "Karnataka Bank";

		//Launch the URL
		driver.get(url);

		//Selecting the Table
		String table = "//*[@id=\"leftcontainer\"]/table";
		WebElement employersTable = driver.findElement(By.xpath(table));

		//To locate the rows of the table
		List<WebElement> rowsOfTable = employersTable.findElements(By.tagName("tr"));

		//store the total no of rows in a variable
		int noOfRows = rowsOfTable.size();
		System.out.println("Number of rows are: "+noOfRows);


		for(int row = 0; row < noOfRows; row++) {

			//To locate the column of the specified row
			List<WebElement> columnsOfTable = rowsOfTable.get(row).findElements(By.tagName("td"));

			//store the total no of columns in a variable
			int noOfColumns = columnsOfTable.size();
			//System.out.println("Number of columns are: "+noOfColumns);

			// 	Use for loop for Columns
			for(int columns = 0 ; columns < noOfColumns; columns++) {

				//To get the value inside the cell
				String cellValue = columnsOfTable.get(columns).getText();


				//Starting static Xpath of row
				String startXpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";


				if(cellValue.equals(company)) {

					//Name of the Company
					String companyName = driver.findElement(By.xpath(startXpath+row+"]/td[1]/a")).getText();
					System.out.println("Company Name is "+ companyName);

					//Group of the Company
					String group = driver.findElement(By.xpath(startXpath+row+"]/td[2]")).getText();
					System.out.println("Group of the company is "+ group);

					//Previous Day Closing Price of the Company 
					String prevDay = driver.findElement(By.xpath(startXpath+row+"]/td[3]")).getText();
					System.out.println("Previous Day Closing Price is "+ prevDay);

					//Current Price of the Company
					String currentPrice = driver.findElement(By.xpath(startXpath+row+"]/td[4]")).getText();
					System.out.println("Current Price is "+ currentPrice);

					//% Change in Share Price of the Company 
					String change = driver.findElement(By.xpath(startXpath+row+"]/td[5]/font")).getText();
					System.out.println("% Change is "+ change);	

					//Click on the Company to get detailed view of the stock
					WebElement companyNameClick = driver.findElement(By.xpath(startXpath+row+"]/td[1]/a"));
					companyNameClick.click();
					System.out.println("Company profile is Opened ");



				}
			}
		}	

		// Close the application
		driver.close();

	}
}






















