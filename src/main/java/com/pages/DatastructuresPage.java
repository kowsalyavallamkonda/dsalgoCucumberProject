package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatastructuresPage {
	
//1.Constructor 
	public DatastructuresPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	
	}
	private WebDriver driver;
	
	
//	2.WebElements
	
	@FindBy (xpath="//a[@href='data-structures-introduction']")
	WebElement dataStructstartbtn;
	
	@FindBy (xpath="//a[@href='time-complexity']")
	WebElement timeComp;
	
	@FindBy (xpath="//a[@href='/tryEditor']")
	WebElement trybtn;
	
	@FindBy (xpath ="//form/div/div/div/textarea")
	WebElement txtEditor; 
	
	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBtn;
	
	@FindBy(xpath="//pre[@id='output']")
	WebElement outputmsg;		
		
	
//3. Actions
	public void dataStructgetsStart()
	{
		dataStructstartbtn.click();
	}
	
    public String pageTitle()
     {
	String title=driver.getTitle();
	return title;
     }
       
    public void clckOnTimeComplexity()
    {
    		timeComp.click();
    }		
	public void clkTrybtn()
	{
		trybtn.click();
	}
	
	
	public void clkrunbutton()
	{
		runBtn.click();
	}
	public void enterCode(String pythonCode) throws InterruptedException {
		//txtEditor.clear();
		//Thread.sleep(500);
		txtEditor.sendKeys(pythonCode);
	}
	public String displayoutput()
	{
		String output=outputmsg.getText();
		return output;
	}
	public void enterwrongcode() throws InterruptedException 
	{
		//txtEditor.clear();
		//Thread.sleep(500);
		txtEditor.sendKeys("hello");
		
	}
	public String alertboxmsg()
	{
		Alert al=driver.switchTo().alert();
		String msg= al.getText();
		return msg;
	}
	
	
}
















