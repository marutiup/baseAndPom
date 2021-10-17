package com.sriram.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.helper.File_Reader_Manager;
import com.reusable.BC1;

public class Pooja extends BC1 {
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		driver=getDriver("chrome");
		getUrl("http://automationpractice.com/index.php");
		WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
		clickOnElement(login);
		String un = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUserName();
		WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
			
		inputValueElement(emailid,un);
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		String password2 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		inputValueElement(password, password2);
		WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
		clickOnElement(loginButton);
		WebElement dresses = driver.findElement(By.xpath("(//a[normalize-space()='Dresses'])[2]"));
		mouseOver(dresses);
		WebElement eveningDress = driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));
		mouseOver(eveningDress);
		clickOnElement(eveningDress);
		WebElement image = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		mouseOver(image);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement qview = driver.findElement(By.xpath("//a[@class='quick-view']"));
		mouseOver(qview);
		WebDriverWait wt=new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOf(qview));
		clickOnElement(qview);


		
		
		
		
		
		
		
	}

}
