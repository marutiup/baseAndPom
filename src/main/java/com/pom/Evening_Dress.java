package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evening_Dress {
	
	public  WebDriver driver;
	@FindBy(xpath="(//a[normalize-space()='Dresses'])[2]")
	private WebElement dress;
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	private WebElement eveningDress;
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement dressImage;
	@FindBy(xpath="//a[@class='quick-view']")
	private WebElement quickView;
	public  Evening_Dress(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDress() {
		return dress;
	}
	public WebElement getEveningDress() {
		return eveningDress;
	}
	public WebElement getDressImage() {
		return dressImage;
	}
	public WebElement getQuickView() {
		return quickView;
	}
	
	

}
