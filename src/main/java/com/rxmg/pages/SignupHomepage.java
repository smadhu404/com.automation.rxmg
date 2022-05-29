package com.rxmg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.rxmg.base.DriverScript;

public class SignupHomepage extends DriverScript {
	
	@FindBy(xpath ="//a[normalize-space()='Sign up']") WebElement signupLink;

	public SignupHomepage()

	{
		PageFactory.initElements(driver, this);
	}

	public void clickSignup() {
		
		signupLink.click();
		System.out.println("signup clicked");
	}

}
