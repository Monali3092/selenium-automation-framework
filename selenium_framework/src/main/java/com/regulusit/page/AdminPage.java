package com.regulusit.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.regulusit.common.WebDriverFactory;

public class AdminPage 
{
	@FindBy(id="btnAdd")
	WebElement addButton;
	
	public AdminPage()
	{
		PageFactory.initElements(WebDriverFactory.dr.get(), this);
	}

	public AddUserPage navigateTOAddUserPage()
	{
		addButton.click();
		return new AddUserPage();
	}
}
