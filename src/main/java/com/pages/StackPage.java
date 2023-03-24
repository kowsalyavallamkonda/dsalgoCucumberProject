package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {
 //1.Constructor 
		
		public StackPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		private WebDriver driver;
		
//2.WebElements
		@FindBy(xpath = "//a[@href='stack']")
		WebElement stackbtn;	
		@FindBy(xpath = "//a[text()=\'Operations in Stack\']")
		WebElement operations;	
		
		@FindBy(xpath = "//a[@href='implementation']")
		WebElement implementation;
		@FindBy(xpath = "//a[@href='stack-applications']")
		WebElement stackapplication;
		
//3.WebElements Actions		
      
	public void clkstackbtn()
	{
		stackbtn.click();	
	}
		
	public void clkoperations()
	{
		operations.click();
	}
	public void clkimplementation()
	{
		implementation.click();
	}
	public void clkstackapplication()
	{
		stackapplication.click();
	}		
		
		
		
}
