package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectModel {
	
	public static WebDriver driver;
	
	@FindBy(id = "username")
	private static WebElement userName;
	
	@FindBy(xpath = "//input[@type='password']")
	private static WebElement password;
	
	@FindBy(xpath = "//input[@type='Submit']")
	private static WebElement logIn;

	public static WebElement getUserName() {
		return userName;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getLogIn() {
		return logIn;
	}
	public LoginPageObjectModel(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	}
	
	


