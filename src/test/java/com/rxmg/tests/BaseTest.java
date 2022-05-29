package com.rxmg.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.rxmg.base.DriverScript;
import com.rxmg.pages.CreateNewPostPage;
import com.rxmg.pages.DeletePostPage;
import com.rxmg.pages.SigninHomepage;
import com.rxmg.pages.SigninPage;
import com.rxmg.pages.SignupHomepage;
import com.rxmg.pages.SignupPage;

public class BaseTest extends DriverScript{
	
	SignupHomepage sph;
	SigninHomepage sih;
	SignupPage sup;
	SigninPage sip;
	CreateNewPostPage cnp;
	DeletePostPage dpp;
	
	@BeforeMethod
	public void setUp() {
		initApplication();
		sph = new SignupHomepage();
		sih = new SigninHomepage();
		sup = new SignupPage();
		sip = new SigninPage();
		cnp = new CreateNewPostPage();
		dpp = new DeletePostPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		quitDriver();
	}

}
