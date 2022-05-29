package com.rxmg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.rxmg.base.DriverScript;

public class SignupPage extends DriverScript {
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement textboxUserName;
	@FindBy(xpath = "//input[@placeholder='Email']") WebElement textboxEmail;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement textboxPassword;
    @FindBy(xpath = "//button[@type='submit']") WebElement buttonSignup;
    
    public SignupPage()
    {
    	PageFactory.initElements(driver, this);
    }
	
    public void enterUsername(String username)
    {
    	textboxUserName.sendKeys(username);
    	
    }
    public void enterEmail(String email) 
    {
    	textboxEmail.sendKeys(email);	
    }
    public void enterPassword(String password)
    {
    	textboxPassword.sendKeys(password);
    }
    public void clickSignup()
    {
    	buttonSignup.click();
    }
}
