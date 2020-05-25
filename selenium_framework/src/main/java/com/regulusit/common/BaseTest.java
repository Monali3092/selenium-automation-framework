package com.regulusit.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
@Listeners(IInvokedMethodListenerImpl.class)
public class BaseTest 
{
	@DataProvider(name="excelData") //excel file reader code
	
public String[][] getExcelData() throws Exception
{
		String fileName="D:\\Workspace1\\selenium_framework\\src\\main\\java\\com\\regulusit\\test\\LoginTest.xlsx";
		return ExcelReader.getExcelTableArray(fileName, "verifyAdminLogin");
}
	
	
	@DataProvider(name="loginData")
	public String[][] getLoginData()
	{
		String data[][]= {
				{"Monali", "Monali@123"},
				{"Admin", "admin123"},
				{"harshal", "harsh@123"}
		};
		return data;
	}
	
	
	@DataProvider(name = "csvData")// text file reader code
	public String[][] getCsvData() throws IOException
	{
		
		String csvFile = "C:\\Selenium\\CSVData.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		String data[][]=new String[3][2];
		br = new BufferedReader(new FileReader(csvFile));
		int i = 0;
		while ((line = br.readLine()) != null) {

		// use comma as separator
		String[] loginDataLine = line.split(cvsSplitBy);
		System.out.println(line);
		data[i]=loginDataLine;
		i=i+1;
		}
		return data;
	}
	
	
	
	
	//public WebDriver dr;    //--->> Global Variable -->>use public to access in other classes
	
	/*@BeforeTest
	public void beforeEveryTestMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		dr=new ChromeDriver();
		
		/* WebDriver driver=new ChromeDriver();  --->> Local Variable -->> Local Scope*/
		
	/*}*/
	
	/*@AfterTest
	public void afterEveryTestMethod()
	{
		dr.quit();
	}*/
}
