package com.inetBanking.testCase;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass 
{
	@Test()
	public void loginTest()
	{
		driver.get("https://demo.guru99.com/");
        Logger.info("URL is opened");
	
		LoginPage lp = new LoginPage(driver);
		lp.senduserName();
		
		Logger.info("entered user name");
		lp.sendpassword();
		Logger.info("enetered the pass");
		
		lp.clickOnLoginbtn();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) 
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertFalse(false);
		}
	}

}
