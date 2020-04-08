package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class personaldetOR {
	
	
	private WebDriver driver;
	
	 public personaldetOR(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	
}
	 //home of work-day
	 @FindBy(xpath ="//div[@title='Mansi Sharma']")
	  protected WebElement TitleName;
	 
	
	 @FindBy(xpath="//textarea")
	 protected WebElement textarea;
	 
	 //save for later
	 @FindBy(xpath="//button[@title='Save for Later']")
	 protected WebElement save;
	 
	 @FindBy(xpath="//div[@title='Personal Information Change: Mansi Sharma (41788MS)']")
	 protected WebElement link1;
	 
	 @FindBy(xpath="//button[@title='Revise']")
	 protected WebElement revise;
	 
	 //header title
	 @FindBy(xpath="//div[@data-automation-id='promptOption']")
	 protected WebElement header;


}
