package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPageObjectModel {
	
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private static WebElement radiobutton;
	
	@FindBy(xpath = "//input[@type='submit']")
	private static WebElement submit;

	public static WebElement getRadiobutton() {
		return radiobutton;
	}

	public static WebElement getSubmit() {
		return submit;
	}
	public ConfirmationPageObjectModel(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		
	}
	
	

}
