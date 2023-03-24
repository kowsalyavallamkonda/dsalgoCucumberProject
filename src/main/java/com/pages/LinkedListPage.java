package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {
	//1.Constructor 
	
	public LinkedListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	private WebDriver driver;
	
	
//	2.WebElements
	@FindBy(xpath ="//a[@href='linked-list']")
	WebElement linkedlistbtn;
	@FindBy(xpath ="//a[@href='introduction']")
	WebElement introdlink;
	@FindBy(xpath ="//a[@href='creating-linked-list']")
	WebElement creatinglinledlist;;
	@FindBy(xpath ="//a[@href='types-of-linked-list']")
	WebElement typeslinkedlist;
	@FindBy(xpath ="//a[@href='implement-linked-list-in-python']")
	WebElement implementlinkedlist;
	@FindBy(xpath ="//a[@href='traversal']")
	WebElement traversal;
	@FindBy(xpath ="//a[@href='insertion-in-linked-list']")
	WebElement insertion;
	@FindBy(xpath ="//a[@href='deletion-in-linked-list']")
	WebElement deletion;



	
	
	
	
	
	
	
	public void clkLinkedlistbtn()
	{
		linkedlistbtn.click();
	}
	
	public String gettitle()
	{
		String title=driver.getTitle();
		return title;
	}
	public void clkintroduction()
	{
		introdlink.click();
	}
	public void clkcreatinglinledlist()
	{
		creatinglinledlist.click();
	}
	public void clktypeslinkedlist()
	{
		typeslinkedlist.click();
	}
	public void clkimplementlinkedlist()
	{
		implementlinkedlist.click();
	}
	public void clktraversal()
	{
		traversal.click();
	}
	public void clkinsertion()
	{
		insertion.click();
	}
	public void clkdeletion()
	{
		deletion.click();
	}
	
}		
