package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Evening_Dress;
import com.pom.HomePage;
import com.pom.LoginPage;

public class Page_Object_Manager {
	public WebDriver driver;
	
	
	private HomePage hp;
	private LoginPage login;
	private Evening_Dress ed;
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public HomePage getInstanceHP() {
		hp=new HomePage(driver);
		return hp;
	}
	public LoginPage getInstanceLogin() {
		login=new LoginPage(driver);
		return login;
	}
	public Evening_Dress getInstanceED() {
		ed = new Evening_Dress(driver);
		return ed;
	}

}
