package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private static LoginPageObjectModel LPO;
	
	private static SearchPageObjectModel SPO;
	
	private static ConfirmationPageObjectModel CPO;
	
	private static PaymentPageObjectModel PPO;
	
	private static LogoutPageObjectModel LPOM;
	
	//POJO - Plain Old Java Object

	public static LoginPageObjectModel getLPO() {
		LPO = new LoginPageObjectModel(driver);
		return LPO;
	}

	public static SearchPageObjectModel getSPO() {
		SPO = new SearchPageObjectModel(driver);
		return SPO;
	}

	public static ConfirmationPageObjectModel getCPO() {
		CPO = new ConfirmationPageObjectModel(driver);
		return CPO;
	}

	public static PaymentPageObjectModel getPPO() {
		PPO = new PaymentPageObjectModel(driver);
		return PPO;
	}

	public static LogoutPageObjectModel getLPOM() {
		LPOM = new LogoutPageObjectModel(driver);
		return LPOM;
	}
	
	public PageObjectManager(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		
	}






}
