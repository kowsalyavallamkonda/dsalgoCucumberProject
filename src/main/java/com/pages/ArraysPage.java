package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArraysPage {

	//1.Constructor 
	public ArraysPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	
	}
	private WebDriver driver;
	
//2.WebElements	
	@FindBy(xpath = "//a[@href='array']")
	WebElement arraybtn;	
	@FindBy (xpath="//a[@href='arrays-in-python']")
     WebElement arraysInpythonLink;
	@FindBy (xpath="//a[@href='arrays-using-list']")
	WebElement arraysUsingListLink;
	@FindBy (xpath="//a[text()='Basic Operations in Lists']") 
	WebElement basicOpinListsLink;
	@FindBy (xpath="//a[@href='applications-of-array']")
	WebElement appOfArrayLink;
	@FindBy (xpath="//a[@href='/array/practice']")
	WebElement practiceQLink;
	@FindBy (xpath="//a[@href='/question/1']")
	WebElement searchTheArray;
	@FindBy (xpath="//a[text()='Max Consecutive Ones']")
	WebElement maxConOnes;
	@FindBy (xpath="//a[text()='Find Numbers with Even Number of Digits']") 
	WebElement findNowithEvnNo;
	@FindBy (xpath="//a[text()='Squares of  a Sorted Array']") 
	WebElement sqOfASortArray;
	@FindBy (xpath="//a[@href='/tryEditor']")
	WebElement tryHereLink;
	@FindBy (xpath="//textarea[@tabindex='0']")
	WebElement editorInput;
	@FindBy (xpath ="//form/div/div/div/textarea")
	WebElement txtEditor; 
	@FindBy (xpath="//button[text()='Run']") 
	WebElement runButton;
	@FindBy (xpath="//pre[@id='output']") 
	WebElement output;
	@FindBy (id="answer_form") 
	WebElement answerform;
	@FindBy (xpath="//input[@value='Submit']") 
	WebElement submitButton;
	
	
//3.WebElements Actions
	public void clkArraybtn()
	{
		arraybtn.click();
	}
	
	public void clkArraysInPython()
	{
		arraysInpythonLink.click();
	}
	
	public void clkarraysUsingListLink()
	{
		arraysUsingListLink.click();
	}
	
	public void clkbasicOpinListsLink()
	{
		basicOpinListsLink.click();
	}
	
	public void clkappOfArrayLink()
	{
		appOfArrayLink.click();
	}
	
	
	public void clkpracticeQLink()
	{
		practiceQLink.click();
	}
	
	public void clksearchTheArray()
	{
		searchTheArray.click();
	}
	
	public void clkmaxConOnes()
	{
		maxConOnes.click();
	}
	
	public void clkfindNowithEvnNo()
	{
		findNowithEvnNo.click();
	}
	
	public void clksqOfASortArray()
	{
		sqOfASortArray.click();
	}
	
	public void cleartexteditor()
	{
		txtEditor.clear();
	}
	
}





























