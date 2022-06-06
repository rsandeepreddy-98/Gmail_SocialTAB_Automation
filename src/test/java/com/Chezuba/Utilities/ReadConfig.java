package com.Chezuba.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

public Properties properties;
	
	public ReadConfig() {
		try {
			FileInputStream fileInputStream = new FileInputStream("./Configurations/data.Properties");
			properties = new Properties();
			try {
				properties.load(fileInputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		return url;
	} 
	
	public String getUsername() {
		String username = properties.getProperty("username");
		return username;
	} 
	
	public String getPassword() {
		String password = properties.getProperty("password");
		return password;
	}
	
	public String getToAddress() {
		String Toadress = properties.getProperty("Toadress");
		return Toadress;
	}
	
	public String getSubjectText() {
		String subject = properties.getProperty("subject");
		return subject;
	}
	
	public String getBody() {
		String body = properties.getProperty("Body");
		return body;
	}
	

	public String getPath() {
		String cpath = properties.getProperty("chromepath");
		return cpath;
	}
}
