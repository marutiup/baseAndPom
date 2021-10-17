package com.reusable;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BC1 {
	public static WebDriver driver;

	public static WebDriver getDriver(String type) {


		if (type.equalsIgnoreCase("chrome") ) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIRAM\\eclipse-workspace\\Maven_demo\\driver\\chromedriver.exe");
			driver=new ChromeDriver();

		}
		else if (type.equalsIgnoreCase("firefox") ) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\SRIRAM\\eclipse-workspace\\Maven_demo\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();

		return driver;
	}



public static void getUrl(String url) {
	driver.get(url);

}
public static String getTitle() {
	String title = null;
	
		title = driver.getTitle();
	
	return title;
}
public static void clickOnElement(WebElement element) {
	element.click();
	
}
public static void navigateTo(String url) {
	driver.navigate().to(url);
	
}
public static void inputValueElement(WebElement element1 , String value) {
	element1.sendKeys(value);
	
}
public static void mouseOver(WebElement element) {	
	
		Actions ac = new Actions(driver);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			ac.moveToElement(element).build().perform();
		}
public static void dropdown(WebElement element, String value, String i) {
	Select s = new Select(element);

	if (value.equals("index")) {

		s.selectByIndex(Integer.parseInt(i));
	} else if (value.equals("value")) {

		s.selectByValue(value);

	}

	else if (value.equals("text")) {
		s.selectByVisibleText(value);
	}
}
public static void getText(WebElement element) {
	
		System.out.println(element.getText());
	
	}




}
