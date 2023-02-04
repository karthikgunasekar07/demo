package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageObjectModel {

	public static WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private static WebElement location;


	@FindBy(id = "hotels")
	private static WebElement hotel;

	@FindBy(xpath = "//select[@name='room_type']")
	private static WebElement roomType;

	@FindBy(id = "room_nos")
	private static WebElement No_Of_Room;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private static WebElement checkIn;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private static WebElement checkOut;

	@FindBy(id = "adult_room")
	private static WebElement Adultroom;

	@FindBy(xpath = "//select[@id='child_room']")
	private static WebElement Childroom;
	
	@FindBy(xpath = "//input[@value='Search']")
	private static WebElement Search;

	public static WebElement getLocation() {
		return location;
		
	}

	public static WebElement getHotel() {
		return hotel;
	}

	public static WebElement getRoomType() {
		return roomType;
	}

	public static WebElement getNo_Of_Room() {
		return No_Of_Room;
	}

	public static WebElement getCheckIn() {
		return checkIn;
	}

	public static WebElement getCheckOut() {
		return checkOut;
	}

	public static WebElement getAdultroom() {
		return Adultroom;
	}

	public static WebElement getChildroom() {
		return Childroom;
	}

	public static WebElement getSearch() {
		return Search;
	}
	public SearchPageObjectModel(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	}

	
	
	
	
	


