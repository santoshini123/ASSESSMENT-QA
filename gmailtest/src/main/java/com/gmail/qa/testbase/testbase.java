package com.gmail.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.gmail.qa.utility.testutil;

public class testbase {

	public static WebDriver driver;
	public static Properties prop;
	//private static EventFiringWebDriver e_driver;
	//private static WebDriverEventListener eventListener;
	
	public testbase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\dugana.santoshini\\eclipse-workspace\\gmailtest\\src\\main\\java\\com\\gmail\\qa\\config\\config.property");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\dugana.santoshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\dugana.santoshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new FirefoxDriver(); 
		}
		
		//e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		//eventListener = new WebEventListener();
		//e_driver.register(eventListener);
		//driver = e_driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		}
	
}
