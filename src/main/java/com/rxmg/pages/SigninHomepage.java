package com.rxmg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.rxmg.base.DriverScript;

public class SigninHomepage extends DriverScript {
	
	@FindBy(xpath="//a[@href='#/login']")  WebElement signinLink;
	
	public SigninHomepage()

	{
		PageFactory.initElements(driver, this);
	}
		
	public void clickSigninhome()
	{
		System.out.println("entering sign page");
	signinLink.click();
		
	}
	

}
