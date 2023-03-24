package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class HomePage1 {

	private WebDriver driver;

	@FindBy(xpath = "//a[@href='/home']")
	WebElement start;

	// Actions
	public void getStartedbtn() {
		start.click();
	}

	//1. dsalgo Page Locators

	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement dataStruct_intro;

	@FindBy(xpath = "//a[@href='array']")
	WebElement array;

	@FindBy(xpath = "//a[@href='linked-list']")
	WebElement linked_List;

	@FindBy(xpath = "//a[@href='stack']")
	WebElement stack;

	@FindBy(xpath = "//a[@href='queue']")
	WebElement queue;

	@FindBy(xpath = "//a[@href='tree']")
	WebElement tree;

	@FindBy(xpath = "//a[@href='graph']")
	WebElement graph;

	@FindBy(xpath = "//div[@role='alert']")
	WebElement alert;

		
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")

	WebElement drpDowndataStruct;

	@FindBy(xpath = "//*[text()='Arrays']")
	WebElement drpDownArray;

	@FindBy(xpath = "//a[text()='Linked List']")
	// a[text()='Linked List']
	WebElement drpDownLinkedList;

	@FindBy(xpath = "//a[text()='Stack']")
	WebElement drpDownStack;

	@FindBy(xpath = "//a[text()='Queue']")
	WebElement drpDownQueue;

	@FindBy(xpath = "//a[text()='Tree']")
	WebElement drpDownTree;
	@FindBy(xpath = "//a[text()='Graph']")
	WebElement drpDownGraph;
	
	
	
	
	

//	WebElement drpDownGraph;
	// Register
	@FindBy(xpath = "//a[text()=' Register ']")
	WebElement register;
	// Sign In
	@FindBy(xpath = "//a[@href='/login']")
	WebElement signIn;

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement loginSucmsg;

//	2.constructor for homepage
	
	public HomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	
	}
	
	// dsalgo Actions
//	public boolean sucalertMsg()
//	{
//		String al=alert.getText();
//		if(al=="You are Logged in")
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}

	// dsalgo Actions
	public String alertMsg() {
		String al = alert.getText();
		return al;

	}

	public void clkDatastructure() {
		dataStruct_intro.click();

	}

	public void clkArray() {
		
		array.click();
	}

	public void clkLinkedlist() {
		linked_List.click();
	}
	public void clkStack() {
		stack.click();
	}

	public void clkQueue() {
		queue.click();
		// return True;
	}

	public void clkTree() {
		tree.click();
	}

	public void clkGraph() {
		graph.click();
	}

	public String getAlertmsg() {
		String al = alert.getText();
		System.out.println(al);
		return al;
	}

	public boolean clkDropdownDataStructures() {
		drpDowndataStruct.click();
		return true;
		
	}

	public void clkdropDownArrays() {
		if(clkDropdownDataStructures()==true )
				drpDownArray.click();
			

	}

	public void clkDropdownLinkedList() {
		if(clkDropdownDataStructures()==true )
		drpDownLinkedList.click();
		
	}

	public void clkDropdownStack() {
		if(clkDropdownDataStructures()==true )
		drpDownStack.click();
		
	}

	public void clkDropdownQueue() {
		if(clkDropdownDataStructures()==true )
		drpDownQueue.click();
		
	}

	public void clkDropdownTree() {
		if(clkDropdownDataStructures()==true )
		drpDownTree.click();
	}

	public void clkDropdownGraph() {
		if(clkDropdownDataStructures()==true )
		drpDownGraph.click();
		
	}

	public void clkRegister() {
		
		register.click();
	}

	public String getRegisterlink() {
		String title = driver.getTitle();
		return title;
	}

	public void clkSignin() {
		signIn.click();
	}

	public String getSigninlink() {
		String title = driver.getTitle();
		return title;
	}

	public String gettitle() {
		String title = driver.getTitle();
		return title;
	}

	public boolean isSucLogInMsgExists() {
		try {
			return (loginSucmsg.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

}
