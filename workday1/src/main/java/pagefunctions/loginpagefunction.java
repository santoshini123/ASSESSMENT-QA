package pagefunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.DriverFun;
import objectrepo.Loginpage;
import testcases.BaseTestcase;

public class loginpagefunction extends Loginpage{

	WebDriver driver=null;
    DriverFun driverFunc;
    
	public loginpagefunction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driverFunc = BaseTestcase.getDriverFun();
	}
	
	public personaldetfunction login(String username, String password) throws InterruptedException  {	
		driverFunc.waitTime(emailInput);
		driverFunc.enterValues(emailInput,username);
		driverFunc.click(nextBtn);
		//Thread.sleep(2000);
		driverFunc.waitTime(passwordInput);
		driverFunc.enterValues(passwordInput,password);
		driverFunc.click(signInBtn);
		try {
			driver.manage().timeouts().pageLoadTimeout(70,TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(20000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(Skip));
		driverFunc.click(Skip);
		return new personaldetfunction(driver);
	 
	}
	

}
