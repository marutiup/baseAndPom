package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	private WebElement signin_button;
	
	public HomePage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin_button() {
		return signin_button;
	}

	
	
	

}
