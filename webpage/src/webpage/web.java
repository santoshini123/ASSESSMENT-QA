package webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class web {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
 System.out.print("hello");
 System.setProperty("webdriver.chrome.driver","C:\\Users\\dugana.santoshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
 driver =new ChromeDriver();
 driver.get("https://www.toolsqa.com/automation-practice-form/\r\n");
  driver.manage().window().maximize();
  driver.findElement(By.id("cookie_action_close_header")).click();

 driver.findElement(By.name("firstname")).sendKeys("santoshini");
 driver.findElement(By.id("lastname")).sendKeys("Dugana");
 WebElement radio1= driver.findElement(By.id("sex-0"));
  radio1.click();
 	
 
WebElement radio2= driver.findElement(By.id("exp-1"));
radio2.click();
 driver.findElement(By.id("datepicker")).sendKeys("18\02\2020");
 driver.findElement(By.id("profession-1")).click();
 driver.findElement(By.id("photo")).sendKeys("C:\\Users\\dugana.santoshini\\Downloads\\team punjab 1.jpg");
 driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[25]/a")).click();
 driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[26]/a")).click();
 driver.findElement(By.id("tool-2")).click();
 Select dropdwn = new Select(driver.findElement(By.id("continents")));
 dropdwn.selectByValue("AUS"); 
 driver.findElement(By.xpath("//*[@id=\"cp_id_fbcbd-1\"]/div[2]/div/div[2]/img")).click(); 
 Select multiple1 = new Select(driver.findElement(By.id("continentsmultiple")));
 multiple1.selectByValue("SA");
 multiple1.selectByValue("AUS");
 Select multiple = new Select(driver.findElement(By.id("selenium_commands")));
 multiple.selectByVisibleText("Navigation Commands"); 
 multiple.selectByVisibleText("Switch Commands");
 driver.findElement(By.xpath("//*[@id=\"cp_id_fbcbd-1\"]/div[2]/div/div[2]/img")).click();
 
 
 
 




 
}


	

}