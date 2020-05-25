package com.regulusit.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.regulusit.common.WebDriverFactory;

public class LoginPage
{
@FindBy(id="txtUsername")
WebElement userName;

@FindBy(id="txtPassword")
WebElement userPassword;

@FindBy(id="btnLogin")
WebElement loginButton;

@FindBy(tagName="a")
List<WebElement> links;


	public LoginPage()  //this is constructor -->>Constructor name same as class name  -->>no return type e.g no void
	{
		PageFactory.initElements(WebDriverFactory.dr.get(), this);
	}
	
	public LoginPage printLinks()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		//WebDriver dr=new ChromeDriver();
		
		WebDriverFactory.dr.get().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		
		List<WebElement> links=WebDriverFactory.dr.get().findElements(By.tagName("a"));
		
		for(WebElement link:links)
		{
			System.out.println("Links on page  :   "+link.getAttribute("href"));
			
		}
		
		return this;
	}
	
	public HomePage login(String strUserName, String strPassword)
	{
		userName.sendKeys(strUserName);
		userPassword.sendKeys(strPassword);
		loginButton.click();
		HomePage hp = new HomePage();
		return hp;
	}
	
	public LoginPage navigateToLoginPage()
	{
		WebDriverFactory.dr.get().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		return this;
	}
	
	
}
