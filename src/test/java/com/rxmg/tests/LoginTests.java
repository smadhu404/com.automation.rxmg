package com.rxmg.tests;

import org.testng.annotations.Test;
import com.rxmg.utils.Helper;

public class LoginTests extends BaseTest {

	@Test(priority = 1)
	public void testSignup() {
		sph.clickSignup();

	}
	@Test(priority = 2)
	public void testPSignup() {
		
		sph.clickSignup();
		sup.enterUsername("madhuri");
		sup.enterEmail("madhuri.s@tech-mails.com");
		sup.enterPassword("rxqapwd");
		sup.clickSignup();
		Helper.fn_sleep();
		
	}

	@Test(priority = 3)
	public void testSignupFail() {
		sph.clickSignup();
		sup.enterUsername("madhuri");
		sup.enterEmail("madhuri.s@tech-mails.com");
		sup.enterPassword("");
		sup.clickSignup();
		Helper.fn_sleep();
		
	}

	@Test(priority = 4)
	public void testSigninPage() {
		sih.clickSigninhome();
	}
	
	@Test(priority = 5)
	public void testSignin() {
		sih.clickSigninhome();
		sip.enterEmail("madhuri.s@tech-mails.com");
		sip.enterPassword("rxqapwd");
		sip.clickSignin();
		Helper.fn_sleep();
		String signinuser = sip.verifySignin();
		if (signinuser.equalsIgnoreCase("madhuri")) {
			System.out.println("Sign in success" );
		} else {
			System.out.println("Sign in Failed" );
		}
			 
	}
	
	
}