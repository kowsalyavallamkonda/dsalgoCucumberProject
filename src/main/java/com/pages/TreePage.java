package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {
	private WebDriver driver;

	//1.constructor for TreePage

		public TreePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;

		}
	
	//2.WebElements
				
				@FindBy(xpath = "//a[@href='tree']")
				WebElement treebtn;
				@FindBy(linkText="Overview of Trees") 
				WebElement OverOfTree;
				@FindBy(linkText="Terminologies") 
				WebElement Terminologies;;
				@FindBy(linkText="Types of Trees") 
				WebElement TypOfTree;
				@FindBy(linkText="Tree Traversals") 
				WebElement TreeTraversals;
				@FindBy(linkText="Traversals-Illustration") 
				WebElement TraveIllustrate;
				@FindBy(linkText="Binary Trees") 
				WebElement BinTree;
				@FindBy(linkText="Types of Binary Trees") 
				WebElement TypOfBinary;
				@FindBy(linkText="Implementation in Python") 
				WebElement ImpPython;
				@FindBy(linkText="Binary Tree Traversals") 
				WebElement BTTraverse;
				@FindBy(linkText="Implementation of Binary Trees") 
				WebElement ImpBT;
				@FindBy(linkText="Applications of Binary trees") 
				WebElement AppsOfBT;
				@FindBy(linkText="Binary Search Trees") 
				WebElement Bst;
				@FindBy(linkText="Implementation Of BST") 
				WebElement ImpBST;
				@FindBy(linkText="Try here>>>") 
				WebElement TryhereLink;
				@FindBy (xpath ="//form/div/div/div/textarea") 
				WebElement textEditor; 
				@FindBy(xpath ="//button[text()='Run']") 
				WebElement runBtn;
				@FindBy(id="output") 
				WebElement runOutput;
				
				public void clkTreebtn()
				{
					treebtn.click();
				}
				public void clkOverOfTree()
				{
					OverOfTree.click();
				}
				public void clkterm()
				{
					Terminologies.click();
				}
				public void clkTypOfTree()
				{
					TypOfTree.click();
				}
				public void clktreetravers()
				{
					TreeTraversals.click();
				}
				public void clkTraveIllustrate()
				{
					TraveIllustrate.click();
				}
				public void clkBinTree()
				{
					BinTree.click();
				}
				public void clkTypOfBinary()
				{
					TypOfBinary.click();
				}
				public void clkImpPython()
				{
					ImpPython.click();
				}
				public void clkBtTraverse()
				{
					BTTraverse.click();
				}
				public void clkImpBt()
				{
					ImpBT.click();
				}
				public void clkAppsofBt()
				{
					 AppsOfBT.click();
				}
               public void clkBinsearchTree()
               {
            	   Bst.click();
               }
				public void clkimpBST()
				{
					ImpBST.click();
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
}
