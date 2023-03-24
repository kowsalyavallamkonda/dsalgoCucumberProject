package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ConfigReader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class LoginPage {
	private WebDriver driver;

//1.constructor for loginpage

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

//2.WebElements

	
	@FindBy(xpath = "//input[@id='id_username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;

	@FindBy(xpath = "//div[contains(text(),'Invalid Username and Password')]")
	WebElement alertMesg;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/a[1]")
	WebElement registerlink;

	@FindBy(xpath = "//div[contains(text(),'You are logged in')]")
	WebElement successLoginmsg;

	@FindBy(xpath = "//a[@href='/logout']")
	WebElement signout;

	@FindBy(xpath = "//div[contains(text(),'Logged out successfully')]")
	WebElement sucLogout;

	// To get LOg in URL
	public void getLoginurl() {
		driver.get("https://dsportalapp.herokuapp.com/login");
	}

	public void enterUsername(String uName) {

		username.sendKeys(uName);

	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickLogin() {
		loginbtn.click();
	}

	public String successAlert() {
		String alert = successLoginmsg.getText();
		return alert;
	}

	public String invalidAlertmesg() {
		String altMessage = alertMesg.getText();
		return altMessage;
	}

	public String validateUsername(String validationMessge) {
		String message = username.getAttribute("validationMessage");
		System.out.println("message");
		return message;

	}

	public String validatePasswordfield(String validationMessge) {
		String message = password.getAttribute("validationMessage");
		System.out.println("message");
		return message;

	}

	public void register() {
		registerlink.click();
	}

	public String register_page() {
		String title = driver.getTitle();
		return title;
	}

	public void logout() {
		signout.click();
	}

	public String successLogout() {
		String alert = sucLogout.getText();
		return alert;
	}

	public void dologin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
	}
}
