package com.regulusit.common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory 
{
	//public static WebDriver dr;
	public static ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>();  //for thread safe code
}
