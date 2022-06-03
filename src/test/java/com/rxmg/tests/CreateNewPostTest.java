package com.rxmg.tests;

import org.testng.annotations.Test;

public class CreateNewPostTest extends BaseTest {

	String articleText = "This year, digital-first marketing went from “nice to have” to essential. "
			+ "Businesses had to maximize audience reach online, marketers needed detailed insights"
			+ " into audience behavior and everyone had to devise new topics, experiences"
			+ " to capture audience attention.";
	@Test		
	public void createPost() 
	{
		sih.clickSigninhome();
		sip.enterEmail("madhuri.s@tech-mails.com");
		sip.enterPassword("rxqapwd");
		sip.clickSignin();
		cnp.clickNewPost();
		cnp.enterArticleName("Modern Marketing 2");
		cnp.enterAboutArticle("Attracting New Audiences with Digital Marketing");
		cnp.enterArticleArea(articleText);
		cnp.enterTags("#modernmarkets,#digitalmarketing");
		cnp.clickPublish();
		
	}
}
