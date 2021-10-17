package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuraction_Reader {
	
	public static Properties p;
	
	public  Configuraction_Reader() throws Throwable {
		File f=new File("C:\\Users\\SRIRAM\\eclipse-workspace\\project\\src\\main\\java\\com\\property\\configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p= new Properties();
		p.load(fis);		

	}
	
	public String getUserName() throws Throwable {
		//read the user data	
		
		String username = p.getProperty("username");
		return username;	

	}
	public String getPassword() throws Throwable {
		
		String password = p.getProperty("password");
		return password;
	}
	
	
	
	
}
