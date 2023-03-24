package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class RegisterPage {
	//WebElements
	@FindBy (name="username" ) 
	WebElement username;
	
	@FindBy (name="password1" ) 
	WebElement password;
	
	@FindBy (name="password2" )
	WebElement confirmpassword;
	
	@FindBy (xpath="//div[@class='alert alert-primary']" ) 
	WebElement errorMsg;
	
	@FindBy (xpath="//input[@value='Register']" ) 
	WebElement register;
	
	@FindBy(xpath = "//a[text()=' Register ']")
	WebElement registerlnk;
	
	private WebDriver driver;
	
	
//	2.constructor for homepage
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	
	}
	//Actions of WebElements
	public void enterusername(String uname)
		{
		username.click();
		username.clear();
		username.sendKeys(uname);
		}
	
	public void enterpassword(String pwd)
	{
	password.click();
	password.clear();
	password.sendKeys(pwd);
	}
	public void enterConfirmpassword(String confpwd)
	{
		confirmpassword.click();
		confirmpassword.clear();
		confirmpassword.sendKeys(confpwd);
	}
	public void clickregister()
	{
		register.click();
	}
	
	public String usernamedisplayMsg()
	{
		String usdisMsg=username.getAttribute("validationMessage");
		return usdisMsg;
	}
	
	public String passworddisplayMsg()
	{
	 String pwddisMsg=password.getAttribute("validationMessage");
	 return pwddisMsg;
	}
	public String confirmpassworddisplayMsg()
	{
		String pwdconDismsg=confirmpassword.getAttribute("validationMessage");
		return pwdconDismsg;
	}
	
	public String displayErrormsg()
	{
		String errmsg=errorMsg.getText();
		return errmsg;
	}
	
	public void getregtitle()
	{
		
	}
	 public void clkRegisterLink()
	 {
		 registerlnk.click();
	 }
	
	
	
	
}
