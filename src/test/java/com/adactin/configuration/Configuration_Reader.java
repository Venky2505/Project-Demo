package com.adactin.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;



public class Configuration_Reader {

	public static Properties pro;
	
	public Configuration_Reader() throws Throwable {
File f = new File("C:\\Users\\USER\\eclipse-workspace\\Cucumber_Project\\src\\test\\java\\com\\adactin\\configuration\\Adactin.Properties");
	FileInputStream fis = new FileInputStream(f);
	pro = new Properties();
	pro.load(fis);
	}
	
	public String getbrowser() {
String browser = pro.getProperty("browser");
return browser;
	}
	
	public String getUrl() {
String url = pro.getProperty("url");
	return url;
	}
}
