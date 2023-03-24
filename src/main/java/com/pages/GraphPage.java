package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage {
	//1.Constructor 
			public GraphPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
				this.driver=driver;
					}
			private WebDriver driver;
			
//	2.WebElements
			@FindBy (xpath = "//a[@href ='graph']")
			WebElement graph;
            @FindBy(xpath="//a[@href='graph-representations']")
            WebElement graphrRep;
            @FindBy(xpath = "//a[@href='graph']")
        	WebElement graphgetstartbtn;
 //3.WebElements Actions
            
  public void clkGraph()
  {
	  graphgetstartbtn.click();
  }
            
  public void clkGraphLink() {
	  graph.click();
  }
  public void clkGraphrepresentation() {
	  graphrRep.click();
  }
  
  
  
  
  
  
  
  
  
  
  
}
