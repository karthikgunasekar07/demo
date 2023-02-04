package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageObjectModel {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='logout']")
	private static WebElement logOut;

	public static WebElement getLogOut() {
		return logOut;
	}
	public LogoutPageObjectModel(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

}
