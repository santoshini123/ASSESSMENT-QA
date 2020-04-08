package pagefunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import common.DriverFun;
import objectrepo.Loginpage;
import testcases.BaseTestcase;

public class personaldetfunction extends Loginpage {

	WebDriver driver=null;
    DriverFun driverFunc;
    BaseTestcase btc;
	private Object TitleName;
	private WebElement textarea;
	private WebElement header;
	private WebElement revise;
	private WebElement link1;
	private WebElement save;
	

	public personaldetfunction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driverFunc = BaseTestcase.getDriverFun();
		// TODO Auto-generated constructor stub
	
	}
	public void Details(String text) throws InterruptedException {
		Thread.sleep(30000);
        //2 extras here
        if(link1.isDisplayed()) {
        	 driverFunc.click(link1);
             driverFunc.waitTime(revise);	
             driverFunc.click(revise);
             Thread.sleep(2000);
             System.out.println("Name is "+header.getText());
             Assert.assertTrue(isTitleMatched());
      		System.out.println("Aseert executed");
             Thread.sleep(20000);
             driverFunc.scroll(textarea);
     		 driverFunc.enterValues(textarea, text);
     		driverFunc.click(save);
        }
	}
	  /*	public void EnterComment(String text) throws InterruptedException {
	   * driverFunc.scroll(textarea);
     		 driverFunc.enterValues(textarea, text);
     		// driverFunc.click(save);
	  		
	  	}
*/
		public boolean isTitleMatched() {
			
			if(((WebElement) TitleName).getText().equalsIgnoreCase("Santoshini")) {
			 return true;
			}
			else {
			return false;
			}
		}

}
