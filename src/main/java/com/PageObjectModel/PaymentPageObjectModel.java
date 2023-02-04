package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPageObjectModel {
	
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private static WebElement firstName;
	
	@FindBy(id = "last_name")
	private static WebElement lastName;
	
	@FindBy(id = "address")
	private static WebElement address;
	
	@FindBy(id = "cc_num")
	private static WebElement cardNumber;
	
	@FindBy(id = "cc_type")
	private static WebElement cardType;

	@FindBy(id = "cc_exp_month")
	private static WebElement expMonth;
	
	@FindBy(id = "cc_exp_year")
	private static WebElement expYear;

	@FindBy(id = "cc_cvv")
	private static WebElement Cvv;
	
	@FindBy(id = "book_now")
	private static WebElement book_Now;
	
	

	public static WebElement getFirstName() {
		return firstName;
	}

	public static WebElement getLastName() {
		return lastName;
	}

	public static WebElement getAddress() {
		return address;
	}

	public static WebElement getCardNumber() {
		return cardNumber;
	}

	public static WebElement getCardType() {
		return cardType;
	}

	public static WebElement getExpMonth() {
		return expMonth;
	}

	public static WebElement getExpYear() {
		return expYear;
	}

	public static WebElement getCvv() {
		return Cvv;
	}

	public static WebElement getBook_Now() {
		return book_Now;
	}
	public PaymentPageObjectModel(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		
	}
	


}
