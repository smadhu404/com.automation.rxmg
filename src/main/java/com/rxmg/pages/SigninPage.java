package com.rxmg.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rxmg.base.DriverScript;

public class SigninPage extends DriverScript {

	@FindBy(xpath = "//input[@placeholder='Email']") WebElement textboxEmail;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement textboxPassword;
	@FindBy(xpath = "//button[@type='submit']") WebElement buttonSignin;
	@FindBy(xpath = "//a[@href='#/@madhuri']") WebElement signinUsername;
	
	public SigninPage() 
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void enterEmail(String email) 
    {
    	System.out.println("enter email:"+email);
    	System.out.println("enter textboxEmail:"+textboxEmail);
		textboxEmail.sendKeys(email);	
		System.out.println("enter email done:");
    }
    public void enterPassword(String password)
    {
    	System.out.println("enter password:"+password);
    	textboxPassword.sendKeys(password);
    	System.out.println("enter passwordset:"+password);
    }
    public void clickSignin()
    {
    	buttonSignin.click();
    }
    public String verifySignin()
    {
    	 return signinUsername.getText();
    }
}
