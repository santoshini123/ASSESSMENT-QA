package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class login {

	
		// TODO Auto-generated method stub
		static WebDriver driver;
		   public static void main(String[] args) throws InterruptedException
		   {
		       System.out.print("Hello");
		       System.setProperty("webdriver.chrome.driver","C:\\Users\\dugana.santoshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		      driver =new ChromeDriver();
		       driver.get("http://gmail.com"); 
		       driver.manage().window().maximize();
		       driver.findElement(By.id("identifierId")). sendKeys("santoshinisai2@gmail.com");
		       driver.findElement(By.className("CwaK9")).click();
		       Thread.sleep(1000);
		       driver.findElement(By.name("password")). sendKeys("9912665767");
		       Thread.sleep(1000); //drivre.findElement (By.id ("gsda").sendkeys("jkfakjbalkb")
		   driver.findElement(By.className("CwaK9")).click();
	       Thread.sleep(1000);
		   String abc = driver.findElement(By.id("y77zqe")).getText();
		   String cd = "Couldn't sign you in";//santoshinisai1@gmail.com Santu@123 santishinisai2@gmail.com dugana.santoshini@3pillarglobal.com
		   if(abc.equalsIgnoreCase("cd"))
		   {
			  
			  System.out.println("test passed"); 
			  
		   }
		   else
			   
		   {
			   System.out.println("test failed");
		   }
	       Thread.sleep(1000);

		   String ar=driver.getTitle();
				    String er="gmail";
				    if(ar.equalsIgnoreCase(er))
				    { 
				        System.out.println("Test passed");
				        } 
				    else
				    { 
				        System.out.println("Test failed");
				        }
		  

		   }
		}

	


