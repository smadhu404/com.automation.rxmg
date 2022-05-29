package com.rxmg.tests;

import org.testng.annotations.Test;
import com.rxmg.pages.SignupPage;
import com.rxmg.utils.Helper;

public class LoginTests extends BaseTest {

	
	public void testSignup() {
		
		//sign up homepage
		sph.clickSignup();

	}

	public void testPSignup() {
		System.out.println("IN TEST SINUP");
		sup = new SignupPage();
		sup.enterUsername("madhuri");
		sup.enterEmail("madhuri.s@tech-mails.com");
		sup.enterPassword("rxqapwd");
		sup.clickSignup();
		Helper.fn_sleep();
		quitDriver();
	}

	
	public void testSignupFail() {

		sup.enterUsername("madhuri");
		sup.enterEmail("madhuri.s@tech-mails.com");
		sup.enterPassword("");
		sup.clickSignup();
		Helper.fn_sleep();
		quitDriver();
	}

	
	public void testSigninPage() {
		sih.clickSigninhome();
	}
	
	@Test(priority = 1)
	public void testSignin() {
		sih.clickSigninhome();
		sip.enterEmail("madhuri.s@tech-mails.com");
		sip.enterPassword("rxqapwd");
		sip.clickSignin();
		Helper.fn_sleep();
		//quitDriver();
		String signinuser = sip.verifySignin();
		if (signinuser.equalsIgnoreCase("madhuri")) {
			System.out.println("Sign in success" );
		} else {
			System.out.println("Sign in Failed" );
		}
			 
	}
	
	
}