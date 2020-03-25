package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login {
WebDriver driver;
	
	public login(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	
	
	@FindBy(id="identifierId")
	WebElement usermail;
	
	@FindBy(how=How.CLASS_NAME,using="CwaK9") 
	WebElement next;
	
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	
	@FindBy(how=How.CLASS_NAME,using="CwaK9") 
	WebElement click;
	
	public void login_mail(String uid,String pass )
	{
		usermail.sendKeys("santoshinisai2@gmail.com");
		next.click();
		password.sendKeys("9912665767");
		click.click();
	}
  
}
