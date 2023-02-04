package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.PageObjectModel.PageObjectManager;
import com.adactin.runner.Adactin_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adaction_Step extends Base_Class {
	public static WebDriver driver= Adactin_Runner.driver;
	
	public static PageObjectManager web = new PageObjectManager(driver);
	
	
	@Given("User can able to launch the URL")
	public void user_can_able_to_launch_the_url() {
		
		Url("https://adactinhotelapp.com/");
	    
	}

	@When("User can able to enter the username in the username field")
	public void user_can_able_to_enter_the_username_in_the_username_field() {
		inputValue(web.getLPO().getUserName(), "lovetoday");
	    
	}

	@When("user can able to enter the password in the password field")
	public void user_can_able_to_enter_the_password_in_the_password_field() {
	    inputValue(web.getLPO().getPassword(), "Love@1234");
	}

	@Then("User can able to click the login button")
	public void user_can_able_to_click_the_login_button() {
	    logIn(web.getLPO().getLogIn());
	}
	@When("User can able to select hotel location from location dropdown")
	public void user_can_able_to_select_hotel_location_from_location_dropdown() {
	    Dropdown(web.getSPO().getLocation(), "New York");
	}

	@When("User can able to select hotel from select hotel dropdown")
	public void user_can_able_to_select_hotel_from_select_hotel_dropdown() {
		Dropdown(web.getSPO().getHotel(), "Hotel Cornice");
	    
	}

	@When("User can able to select room type from room type dropdown")
	public void user_can_able_to_select_room_type_from_room_type_dropdown() {
	    Dropdown(web.getSPO().getRoomType(), "Double");
	}

	@When("User can able to select No,of Room from No.of Room dropdown")
	public void user_can_able_to_select_no_of_room_from_no_of_room_dropdown() {
	    Dropdown(web.getSPO().getNo_Of_Room(), "5 - Five");
	}

	@When("User can able to enter the CheckIn date in the checkIn date field")
	public void user_can_able_to_enter_the_check_in_date_in_the_check_in_date_field() {
	    Clear(web.getSPO().getCheckIn(), "31/12/2022");
	}

	@When("User can able to enter the CheckOut date in the checkOut date field")
	public void user_can_able_to_enter_the_check_out_date_in_the_check_out_date_field() {
	   Clear(web.getSPO().getCheckOut(), "01/01/2023");
	}

	@When("User can able to select adult per room from Adults per room dropdown")
	public void user_can_able_to_select_adult_per_room_from_adults_per_room_dropdown() {
		Dropdown(web.getSPO().getAdultroom(), "4 - Four");
	}
	

	@When("User can able to select children per room from children per room dropdown")
	public void user_can_able_to_select_children_per_room_from_children_per_room_dropdown() throws Throwable {
	    Dropdown(web.getSPO().getChildroom(), "3 - Three");
	    Thread.sleep(3000);
	}

	@Then("User can able to click the search button")
	public void user_can_able_to_click_the_search_button() {
		logIn(web.getSPO().getSearch());
	}
	@When("User can able to select and click radio button")
	public void user_can_able_to_select_and_click_radio_button() {
	    logIn(web.getCPO().getRadiobutton());
	}

	@Then("user can able to click the continue button")
	public void user_can_able_to_click_the_continue_button() {
	   logIn(web.getCPO().getSubmit());
	}

	@When("User can able to enter the First Name in the First Name field")
	public void user_can_able_to_enter_the_first_name_in_the_first_name_field() {
	    inputValue(web.getPPO().getFirstName(), "Ricky");
	}

	@When("User can able to enter the Last Name in the Last Name field")
	public void user_can_able_to_enter_the_last_name_in_the_last_name_field() {
	    inputValue(web.getPPO().getLastName(), "Ponting");

	}

	@When("User can able to enter the address details in the Billing Address field")
	public void user_can_able_to_enter_the_address_details_in_the_billing_address_field() {
	    inputValue(web.getPPO().getAddress(), "11, Thunivu Street, Varisu Nagar, Jailer 202022");
	}

	@When("User can able to enter the Creditcard Number in the Credit Card No field")
	public void user_can_able_to_enter_the_creditcard_number_in_the_credit_card_no_field() {
	    inputValue(web.getPPO().getCardNumber(), "5637127826345673");
	}

	@When("User can able to select card type from Credit Card Type dropdown")
	public void user_can_able_to_select_card_type_from_credit_card_type_dropdown() {
	    Dropdown(web.getPPO().getCardType(), "Master Card");
	}

	@When("User can able to select Exp Month from Select month dropdown")
	public void user_can_able_to_select_exp_month_from_select_month_dropdown() {
	    Dropdown(web.getPPO().getExpMonth(), "December");
	}

	@When("User can able to select Exp Year from Select year dropdown")
	public void user_can_able_to_select_exp_year_from_select_year_dropdown() {
	    Dropdown(web.getPPO().getExpYear(), "2022");
	}

	@When("User can able to enter the CVV number in the CVV number field")
	public void user_can_able_to_enter_the_cvv_number_in_the_cvv_number_field() {
	    inputValue(web.getPPO().getCvv(), "5674");
	}

	@Then("User can able to click the BookNow button")
	public void user_can_able_to_click_the_book_now_button() throws Throwable {
	    logIn(web.getPPO().getBook_Now());
	    Thread.sleep(8000);
	}

	@When("User can able to scroll down the current page")
	public void user_can_able_to_scroll_down_the_current_page() throws Throwable {
		javaScriptExe(web.getLPOM().getLogOut());
	    Thread.sleep(3000);
	}

	@Then("User can to able to click the logout button")
	public void user_can_to_able_to_click_the_logout_button() {
		Logout(web.getLPOM().getLogOut());
	    
	}


}
