package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.configuration.File_Reader_Manager;
import com.adactin.configuration.PageObjectManager;
import com.adactin.pom.BookHotel;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.Runner;

import io.cucumber.java.en.*;

public class Stepdefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);
//	LoginPage lp = new LoginPage(driver);

	@Given("^User want to lauch the adactin application$")

	public void user_want_to_lauch_the_adactin_application() throws Throwable {
//		getUrl("https://adactinhotelapp.com/");
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
	}

	@When("User want to enter the {string} login details")
	public void user_want_to_enter_the_login_details(String String) throws Throwable {
		// lp.getUsername().sendKeys("venkatalakshmi25"); // Old one
		SendKeys(pom.getInstanceLoginPage().getUsername(), String);
	}

	@When("User enter the {string} valid password")
	public void user_enter_the_valid_password(String String) throws Throwable {
//		lp.getPassword().sendKeys("Devkalyan@123");
		SendKeys(pom.getInstanceLoginPage().getPassword(), String);
	}

	@Then("^User verify the details$")
	public void user_verify_the_details() throws Throwable {
		// lp.getLogin().click();
		click(pom.getInstanceLoginPage().getLogin());
	}

//search Hotel
	// SearchHotel sh = new SearchHotel(driver);

	@When("User want to enter the location")
	public void user_want_to_enter_the_location() {
		// dropDown(sh.getLocation(), "byVisibleText", "London");
		dropDown(pom.getInstanceSearchHotel().getLocation(), "byVisibleText", "London");
	}

	@When("User want to enter the hotel")
	public void user_want_to_enter_the_hotel() {
		// dropDown(sh.getHotels(), "byVisibleText", "Hotel Hervey");
		dropDown(pom.getInstanceSearchHotel().getHotels(), "byVisibleText", "Hotel Hervey");
	}

	@When("User want to enter the room type")
	public void user_want_to_enter_the_room_type() {
		// dropDown(sh.getRoomtype(), "byVisibleText", "Double");
		dropDown(pom.getInstanceSearchHotel().getRoomtype(), "byVisibleText", "Double");
	}

	@When("User want to enter the number of rooms")
	public void user_want_to_enter_the_number_of_rooms() {
		// dropDown(sh.getRoomnos(), "byVisileText", "3 - Three");
		dropDown(pom.getInstanceSearchHotel().getRoomnos(), "byVisibleText", "3 - Three");
	}

	@When("User want to enter the check in date")
	public void user_want_to_enter_the_check_in_date() {
		// clear(sh.getCheckin());
		// SendKeys(sh.getCheckin(), "12/10/2021");
		clear(pom.getInstanceSearchHotel().getCheckin());
		SendKeys(pom.getInstanceSearchHotel().getCheckin(), "12/10/2021");
	}

	@When("User want to enter the check out date")
	public void user_want_to_enter_the_check_out_date() {
		// clear(sh.getCheckout());
		// SendKeys(sh.getCheckout(), "14/10/2021");
		clear(pom.getInstanceSearchHotel().getCheckout());
		SendKeys(pom.getInstanceSearchHotel().getCheckout(), "14/10/2021");
	}

	@When("User want to enter the number of adults")
	public void user_want_to_enter_the_number_of_adults() {
		// dropDown(sh.getAdult(), "byVisibleText", "2 - Two");
		dropDown(pom.getInstanceSearchHotel().getAdult(), "byVisibleText", "2 - Two");
	}

	@When("User want to enter the number of children")
	public void user_want_to_enter_the_number_of_children() {
		// dropDown(sh.getChildren(), "byVisibleText", "2 - Two");
		dropDown(pom.getInstanceSearchHotel().getChildren(), "byVisibleText", "2 - Two");
	}

	@Then("User want to enter the search hotel")
	public void user_want_to_enter_the_search_hotel() {
		// click(sh.getSubmit());
		click(pom.getInstanceSearchHotel().getSubmit());
	}

	// Select Hotel

	// SelectHotel s = new SelectHotel(driver);

	@When("User want to click the selected hotel")
	public void user_want_to_click_the_selected_hotel() {
		// click(s.getSelect());
		click(pom.getInstanceSelectHotel().getSelect());
	}

	@When("User want to confirm the hotel")
	public void user_want_to_confirm_the_hotel() {
		// click(s.getContinue());
		click(pom.getInstanceSelectHotel().getContinue());
	}
//Book Hotel

	// BookHotel b = new BookHotel(driver);

	@When("User want to enter the first name")
	public void user_want_to_enter_the_first_name() {
		// SendKeys(b.getFirstname(), "venkatalakshmi");
		SendKeys(pom.getInstanceBookHotel().getFirstname(), "venkatalakshmi");
	}

	@When("User want to enter the last name")
	public void user_want_to_enter_the_last_name() {
		// SendKeys(b.getLastname(), "E");
		SendKeys(pom.getInstanceBookHotel().getLastname(), "E");
	}

	@When("User want to enter the billing address")
	public void user_want_to_enter_the_billing_address() {
		// SendKeys(b.getAddress(), "15, Gandhi street, chennai");
		SendKeys(pom.getInstanceBookHotel().getAddress(), "15, Gandhi street, chennai");
	}

	@When("User want to enter the credit card number")
	public void user_want_to_enter_the_credit_card_number() {
		// SendKeys(b.getCcnumber(), "1234567890123456");
		SendKeys(pom.getInstanceBookHotel().getCcnumber(), "1234567890123456");
	}

	@When("User want to enter the credit card type")
	public void user_want_to_enter_the_credit_card_type() {
		// dropDown(b.getCctype(), "byVisibleText", "VISA");
		dropDown(pom.getInstanceBookHotel().getCctype(), "byVisibleText", "VISA");
	}

	@When("User want to enter the expiry month")
	public void user_want_to_enter_the_expiry_month() {
		// dropDown(b.getCardmonth(), "byVisibleText", "August");
		dropDown(pom.getInstanceBookHotel().getCardmonth(), "byVisibleText", "August");
	}

	@When("user want to eneter the expiry year")
	public void user_want_to_eneter_the_expiry_year() {
		// dropDown(b.getCardyear(), "byVisibleText", "2013");
		dropDown(pom.getInstanceBookHotel().getCardyear(), "byVisibleText", "2013");
	}

	@When("user want to enter the Cvv number")
	public void user_want_to_enter_the_cvv_number() {
		// SendKeys(b.getCardpin(), "222");
		SendKeys(pom.getInstanceBookHotel().getCardpin(), "222");
	}

	@Then("User want to click the book now")
	public void user_want_to_click_the_book_now() {
		// click(b.getBooknow());
		click(pom.getInstanceBookHotel().getBooknow());
	}

}
