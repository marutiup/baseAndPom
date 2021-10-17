package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath=("//input[@id='email']"))
	private WebElement username;
	@FindBy(xpath=("//input[@id='passwd']"))
	private WebElement password;
	@FindBy(id="SubmitLogin")
	private WebElement signinButton;
	public LoginPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSigninButton() {
		return signinButton;
	}
	
	

}
