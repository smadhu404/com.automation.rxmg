package com.rxmg.tests;

import org.testng.annotations.Test;

import com.rxmg.utils.Helper;

public class DeletePostTest extends BaseTest {
	@Test
	public void deletePost() {
		sih.clickSigninhome();
		sip.enterEmail("madhuri.s@tech-mails.com");
		sip.enterPassword("rxqapwd");
		sip.clickSignin();
		Helper.fn_sleep();
		dpp.clickSigninUser();
		dpp.clickArticle();
		dpp.deleteArticle();
	}

}
