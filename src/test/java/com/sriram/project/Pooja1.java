package com.sriram.project;

import org.openqa.selenium.WebDriver;

import com.helper.File_Reader_Manager;
import com.pom.Evening_Dress;
import com.pom.HomePage;
import com.pom.LoginPage;
import com.reusable.BC1;

public class Pooja1 extends BC1 {
	public static WebDriver driver=BC1.getDriver("chrome");
	public static HomePage hp=new HomePage(driver);
	public static LoginPage lp=new LoginPage(driver);
	public static Evening_Dress ed=new Evening_Dress(driver);
	public static void main(String[] args) throws Throwable {
		
		getUrl("http://automationpractice.com/index.php");
		clickOnElement(hp.getSignin_button());
		String userName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUserName();
		inputValueElement(lp.getUsername(), userName);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		inputValueElement(lp.getPassword(), password);
		clickOnElement(lp.getSigninButton());
		Thread.sleep(3000);
		ed.getDress();
		mouseOver(ed.getDress());
		Thread.sleep(3000);
		mouseOver(ed.getEveningDress());
		Thread.sleep(3000);
		clickOnElement(ed.getEveningDress());
		mouseOver(ed.getDressImage());
		mouseOver(ed.getQuickView());
		clickOnElement(ed.getQuickView());
		
		
		
		
		
		
	}
	

}
