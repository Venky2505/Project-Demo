package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy (id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement roomnos;
	
	@FindBy(id = "datepick_in")
	private WebElement checkin;
	
	@FindBy (id = "datepick_out")
	private WebElement checkout;
	
	@FindBy(id = "adult_room")
	private WebElement adult;
	
	@FindBy (id = "child_room")
	private WebElement children;
	
	@FindBy (id = "Submit")
	private WebElement Submit;

	public SearchHotel(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSubmit() {
		return Submit;
	}

		
}

