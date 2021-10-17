package com.sriram.project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {
	
	static WebDriver driver;
	public static void browserLuanch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	public static void getURL(String u) {
		driver.get(u);
	}

	public static void takepic(String location) throws Throwable {
		TakesScreenshot photo=(TakesScreenshot) driver;
		File screen = photo.getScreenshotAs(OutputType.FILE);
		File file = new File(location);
		//FileUtils.copyFile(screen, file);
		FileHandler.copy(screen, file);
	}
}
