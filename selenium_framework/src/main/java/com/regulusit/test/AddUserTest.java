package com.regulusit.test;
//Add user with TestNG

import org.testng.annotations.Test;

import com.regulusit.common.BaseTest;
import com.regulusit.page.AddUserPage;
import com.regulusit.page.AdminPage;
import com.regulusit.page.HomePage;
import com.regulusit.page.LoginPage;

public class AddUserTest extends BaseTest 
{
	@Test
	public void addNewUser()
	{
		LoginPage lp=new LoginPage();
		lp.navigateToLoginPage();  //Step 1: Launch browser & navigate to URL
		lp.login("Monali", "Monali@123");  //Step 2: Login
		
		HomePage hp=new HomePage();
		hp.verifyWelcomeText("Welcome Admin");  //Step 3: Verify admin login text
		hp.navigateToAdminPage();  //Step 4: click on Admin Tab
		
		AdminPage ap=new AdminPage();
		ap.navigateTOAddUserPage();  //Step 5: click on Add button
		
		AddUserPage aup=new AddUserPage();
		aup.addUser(0, "Monali13 Ghumatkar13", "TestMonali", "Monali@123456", "Monali@123456");  //Step 6: Add user
	}
	
	
	/*{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		beforeEveryTestMethod();
		
		WebDriverFactory.dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		
		WebElement userName=WebDriverFactory.dr.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Monali");
		
		WebElement userPassword=WebDriverFactory.dr.findElement(By.xpath("//input[@id='txtPassword']"));
		userPassword.sendKeys("Monali@123");
		
		WebElement loginButton=WebDriverFactory.dr.findElement(By.xpath("//input[@id='btnLogin']"));
		loginButton.click();
		
		//WebElement welcomeText=dr.findElement(By.xpath("a[text()='Welcome Admin']"));
		//boolean status=welcomeText.isDisplayed();
		//if(status==true)
		//{
		//	System.out.println("Test case executed successfully");
		//}
		//else
		//{
		//	System.out.println("Test case failed");
		//}
		
		WebElement adminClick=WebDriverFactory.dr.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement adminClick=dr.findElement(By.linkText("Admin"));
		adminClick.click();
		
		WebElement addButton=WebDriverFactory.dr.findElement(By.xpath("//input[@id='btnAdd']"));
		addButton.click();
		
		WebElement userRole=WebDriverFactory.dr.findElement(By.xpath("//select[@id='systemUser_userType']"));
		Select userRoleDropDown=new Select(userRole);
		userRoleDropDown.selectByVisibleText("Admin");
		
		WebElement employeeName=WebDriverFactory.dr.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']"));
		employeeName.sendKeys("Tanmay Ghumatkar");
		
		WebElement userName2=WebDriverFactory.dr.findElement(By.xpath("//input[@id='systemUser_userName']"));
		userName2.sendKeys("Tanu1234.g");
		
		WebElement userStatus=WebDriverFactory.dr.findElement(By.xpath("//select[@id='systemUser_status']"));
		Select userStatusDropDown=new Select(userStatus);
		userStatusDropDown.selectByIndex(1);
		
		WebElement userPassword2=WebDriverFactory.dr.findElement(By.xpath("//input[@id='systemUser_password']"));
		userPassword2.sendKeys("TanmaySG@123");
		
		WebElement confirmUserPassword2=WebDriverFactory.dr.findElement(By.xpath("//input[@id='systemUser_confirmPassword']"));
		confirmUserPassword2.sendKeys("TanmaySG@123");
		
		WebElement saveButton=WebDriverFactory.dr.findElement(By.xpath("//input[@id='btnSave']"));
		saveButton.click();
		
		//dr.quit();
		//afterEveryTestMethod();
	}*/


}
