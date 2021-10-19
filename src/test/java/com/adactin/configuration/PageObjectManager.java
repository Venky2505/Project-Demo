package com.adactin.configuration;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotel;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
public static WebDriver driver;
	private LoginPage lp;
	private SearchHotel sh;
	private SelectHotel s;
	private BookHotel b;
	
	public PageObjectManager(WebDriver driver2) {
this.driver = driver2;

	}

	public LoginPage getInstanceLoginPage() {
LoginPage lp = new LoginPage(driver);
return lp;
}
	
	public SearchHotel getInstanceSearchHotel() {
SearchHotel sh = new SearchHotel(driver);
return sh;
	}
	
	public SelectHotel getInstanceSelectHotel() {
SelectHotel s = new SelectHotel(driver);
return s;
	}
	
	public BookHotel getInstanceBookHotel() {
BookHotel b = new BookHotel(driver);
	return b;
	}
}


