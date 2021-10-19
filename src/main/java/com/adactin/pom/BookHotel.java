package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {

	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy (id = "last_name")
	private WebElement lastname;
	
	@FindBy (id = "address")
	private WebElement address;
	
	@FindBy (id = "cc_num")
	private WebElement ccnumber;
	
	@FindBy (id = "cc_type")
	private WebElement cctype;
	
	@FindBy (id = "cc_exp_month")
	private WebElement cardmonth;
	
	@FindBy (id = "cc_exp_year")
	private WebElement cardyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cardpin;
	
	@FindBy (id = "book_now")
	private WebElement booknow;
	
	public BookHotel(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getCardpin() {
		return cardpin;
	}

	public WebElement getBooknow() {
		return booknow;
	}

		
}
