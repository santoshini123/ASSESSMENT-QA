package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pagefunctions.personaldetfunction;
import pagefunctions.personalinfofunctions;

public class Loginpage {
	
	private WebDriver driver;
	
	 public Loginpage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	
}
	 
	 @FindBy(xpath ="//input[@id='Email']")
	  protected WebElement emailInput;
	 
	 @FindBy(xpath ="//input[@id='next']")
	  protected WebElement nextBtn;
	 
	 @FindBy(xpath = "//input[@type='password']")
	 protected WebElement passwordInput;
	
	 @FindBy(xpath = "//input[@id='signIn']")
	 protected WebElement signInBtn;
	 
	 @FindBy(xpath="//input[@name='Pin']")
	 protected WebElement Pin;
	 
    @FindBy(xpath="//input[@type='submit']")
    protected WebElement Done;
    
    @FindBy(xpath ="//input[@type='checkbox']")
	  protected WebElement check;
	 
    @FindBy(xpath="//button[@title='Submit']")
	  protected WebElement Btn;
    
    @FindBy(xpath="//button[@data-automation-id='linkButton']")
    protected  WebElement Skip;

	public personalinfofunctions loginpage(String property, String property2) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
