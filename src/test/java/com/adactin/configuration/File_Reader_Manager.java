package com.adactin.configuration;

public class File_Reader_Manager {

	private File_Reader_Manager() {

		
	}
	public static File_Reader_Manager getInstance() {
		File_Reader_Manager helper = new File_Reader_Manager();// Step 2: have to create constructor and object for the file Reader (present) class
		return helper;

	}
	
	public Configuration_Reader getInstanceCR() throws Throwable {

		Configuration_Reader reader = new Configuration_Reader (); // Step 1: have to create constructor and object for the configuration class
	return reader;
	}
	
	
	
}
