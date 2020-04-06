package com.gmail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.testbase.testbase;

public class login extends testbase {

	@FindBy(id="identifierId")
	WebElement usermail;
	
	@FindBy(className="CwaK9")
	WebElement next;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(className="CwaK9")
	WebElement Next;
	
	public login() {
		PageFactory.initElements(driver, this);
		
	}
	public String validatelogintittle() {
		return driver.getTitle();
	}
	public password login(String ur, String pas) {
		usermail.sendKeys("santoshinisai2@gmail.com");
		next.click();
		password.sendKeys("991266576");
		Next.click();
		
	  return new password();
				
	}
	
}
