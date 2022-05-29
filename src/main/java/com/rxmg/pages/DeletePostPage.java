package com.rxmg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rxmg.base.DriverScript;

public class DeletePostPage extends DriverScript {
	@FindBy(xpath = "//a[normalize-space()='madhuri']") WebElement signinUserlink;
	@FindBy(xpath = "//a[@href='#/article/modern-marketing-2zbxe6']") WebElement articleLink;
	@FindBy(xpath = "//button[@class='btn btn-outline-danger btn-sm']") WebElement deleteButton;

	public DeletePostPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickSigninUser() {
		System.out.println("clickSigninUser:"+signinUserlink);
		signinUserlink.click();
	}

	public void clickArticle() {
		System.out.println("clickArticle");
		articleLink.click();
	}

	public void deleteArticle() {
		System.out.println("deleteArticle");
		deleteButton.click();
		System.out.println("Article deleted successfully");
	}
}
