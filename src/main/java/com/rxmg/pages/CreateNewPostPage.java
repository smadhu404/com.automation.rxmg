package com.rxmg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.rxmg.base.DriverScript;

public class CreateNewPostPage extends DriverScript {
	
	@FindBy(xpath="//a[@href='#/editor']")  WebElement newPostLink;
	@FindBy(xpath="//input[@placeholder='Article Title']") WebElement textboxArticleName;
	@FindBy(xpath="//input[@placeholder=\"What's this article about?\"]") WebElement textboxAboutArticle;
	@FindBy(xpath="//textarea[@placeholder='Write your article (in markdown)']") WebElement textAreaArticle;
	@FindBy(xpath="//input[@placeholder='Enter tags']") WebElement textboxTag;
	@FindBy(xpath="//button[@type='button']") WebElement publishButton;
	
	public CreateNewPostPage () {
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewPost()
	{
		newPostLink.click();
	}
	public void enterArticleName(String articleName)
	{
		textboxArticleName.sendKeys(articleName);
	}
	public void enterAboutArticle(String aboutArticle)
	{
		textboxAboutArticle.sendKeys(aboutArticle);
	}
	public void enterArticleArea(String articleArea)
	{
		textAreaArticle.sendKeys(articleArea);
	}
	public void enterTags(String tags)
	{
		textboxTag.sendKeys(tags);
	}
	public void clickPublish()
	{
		publishButton.click();
	}
	
	
}
