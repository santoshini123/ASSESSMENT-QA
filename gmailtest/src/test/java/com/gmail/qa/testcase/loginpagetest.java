package com.gmail.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gmail.qa.pages.login;
import com.gmail.qa.pages.password;
import com.gmail.qa.testbase.testbase;

public class loginpagetest extends testbase {
	
	login loginPage;
	password Password;
	
	public loginpagetest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new login();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validatelogintittle();
		Assert.assertEquals(title, "Gmail");
	
	
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	
	
	

}
