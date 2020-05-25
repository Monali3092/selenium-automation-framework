package com.regulusit.common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl implements IInvokedMethodListener //Interface implementation
{

	//@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) 
	{
		WebDriverFactory.dr.get().quit();
		
	}

	//@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) 
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriverFactory.dr.set(new ChromeDriver());*/
		
		
		
		try {
			
			DesiredCapabilities capabilities=new DesiredCapabilities();
			capabilities.setBrowserName("chrome");
			capabilities.setVersion("81");
			capabilities.setPlatform(Platform.WINDOWS);
			
			WebDriver dr = new RemoteWebDriver(new URL("http://192.168.43.60:4444/wd/hub"), capabilities);
			WebDriverFactory.dr.set(dr);
			WebDriverFactory.dr.get().get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			
			
		} catch (MalformedURLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
