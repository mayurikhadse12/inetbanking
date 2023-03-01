package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='uid']")
	private WebElement userName; 

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	private WebElement LoginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void senduserName() 
	{
		userName.sendKeys("Admi");
	}
	
	public void sendpassword() 
	{
		password.sendKeys("1234");
	}
	public void clickOnLoginbtn() 
	{
		LoginBtn.click();
	}
	
	
	
	
	
	
	
	
}
