package com.regulusit.test;
//Login TC's with TestNG

import org.testng.annotations.Test;

import com.regulusit.common.BaseTest;
import com.regulusit.page.LoginPage;

public class LoginTest extends BaseTest
{
	@Test(dataProvider = "excelData")
	public void verifyAdminLoginSuccessful(String userName, String userPassword)
	{
		LoginPage lp=new LoginPage();
		lp.navigateToLoginPage()
			.printLinks()	
				.login(userName, userPassword)
					.verifyWelcomeText("Welcome Admin");
	}	
	
	
}
