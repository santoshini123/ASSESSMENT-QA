package pagefunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import common.DriverFun;
import objectrepo.personalinfoOR;
import testcases.BaseTestcase;

public class personalinfofunctions extends personalinfoOR {

	WebDriver driver=null;
    DriverFun driverFunc;
    
	public personalinfofunctions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driverFunc = BaseTestcase.getDriverFun();
	}
	public personalinfofunctions intoDetails() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
		Thread.sleep(20000);
	    driverFunc.waitTime(PinfoTab);	
		driverFunc.click(PinfoTab);
		//Thread.sleep(20000);
		driverFunc.waitTime(PinfoLink);	
		driverFunc.click(PinfoLink);
		return new personalinfofunctions(driver);
	}
	public void Details(String string) {
		// TODO Auto-generated method stub
		
	}

}
