package com.regulusit.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.regulusit.common.WebDriverFactory;

public class AddUserPage 
{
	@FindBy(id="systemUser_userType")
	//Select userRoleDropDown=new Select(userRole);
	WebElement userRoleDropDown;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement employeeName;
	
	@FindBy(id="systemUser_userName")
	WebElement userName;
	
	@FindBy(id="systemUser_status")
	WebElement empStatus;
	
	@FindBy(id="systemUser_password")
	WebElement userPassword;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement userConfirmPassword;
	
	@FindBy(id="btnSave")
	WebElement saveButton;
	
	public AddUserPage()
	{
		PageFactory.initElements(WebDriverFactory.dr.get(), this);
	}
	
	public void addUser(int intUserRole, String empNameText, String userNameText, String userPasswordText, String userConfirmPasswordText )
	{
		Select userRoleDropDownobj=new Select(userRoleDropDown);
		userRoleDropDownobj.selectByIndex(intUserRole);
		employeeName.sendKeys(empNameText);
		userName.sendKeys(userNameText);
		userPassword.sendKeys(userPasswordText);
		userConfirmPassword.sendKeys(userConfirmPasswordText);
		saveButton.click();
	}
	

}
