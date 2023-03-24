package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {
	
	//1.Constructor 
		public QueuePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
				}
		private WebDriver driver;
		
//		2.WebElements
		@FindBy (xpath = "//a[@href ='queue']")
		WebElement getStartedQueuebtn;
		@FindBy (xpath = "//a[@href='implementation-lists']")
		WebElement implist;
		@FindBy (xpath = "//a[@href='implementation-collections']")
		WebElement impDeque;
		@FindBy (xpath = "//a[@href='Implementation-array']")
		WebElement impArray;
		@FindBy (xpath = "//a[@href='QueueOp']")
		WebElement queOperation;
		
//WebElement Actions
		public void clkQueue()
		{
			getStartedQueuebtn.click();
		}
		public void clkimplist()
		{
			implist.click();
		}
		public void clkimpcollect()
		{
			impDeque.click();
		}
		public void clkimparray()
		{
			impArray.click();
		}
		public void clkQueOp()
		{
			queOperation.click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
