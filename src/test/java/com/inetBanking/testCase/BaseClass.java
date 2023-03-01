package com.inetBanking.testCase;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.inetBanking.utilities.ReadConfig;
//System.getProperty("user.dir")+"//driver//chromedriver.exe
public class BaseClass 

{ 
	ReadConfig config = new ReadConfig();
	
	public String baseURL=config.getApplicationURL(); 
    public String username=config.getUserName();
    public String password=config.getPassword();
    public String chromepath=config.getChromePath();
    
	public static Logger Logger;
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		Logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver = new ChromeDriver();
			
		
		
		
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
		
		
		
	}
	

}
