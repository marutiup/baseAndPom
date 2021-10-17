package com.sriram.project;

import java.awt.Window;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class WebDriverTestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.gettyimages.in");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement userIcon = driver.findElement(By.xpath("//a[text()='SIGN IN']"));
		userIcon.click();
//		WebElement registerTab = driver.findElement(By.xpath("//div[text()='REGISTER']"));
//		registerTab.click();
//		WebElement firstName = driver.findElement(By.id("register_first_name"));
//		firstName.sendKeys("sri");
//		WebElement lastName = driver.findElement(By.id("register_last_name"));
//		lastName.sendKeys("ram");
//		WebElement firstDropDown = driver.findElement(By.xpath("(//select[@required='required'])[1]"));
//
//		Select s = new Select(firstDropDown);
//		s.selectByValue("10");
//		WebElement organization = driver.findElement(By.id("register_organization_name"));
//		organization.sendKeys("Soft Crylic");
//		WebElement jobTitle = driver.findElement(By.xpath("(//select[@required='required'])[2]"));
//		Select s1 = new Select(jobTitle);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		s1.selectByValue("47");
//		WebElement email = driver.findElement(By.id("register_email"));
//		email.sendKeys("ttinuntw@gmail.com");
//		WebElement mobileNumber = driver.findElement(By.id("register_telephone"));
//		mobileNumber.sendKeys("8825505849");
//		WebElement id = driver.findElement(By.id("register_extension"));
//		id.sendKeys("11/11/2247");
//		WebElement password = driver.findElement(By.id("register_password"));
//		password.sendKeys("Soft0910");
//		WebElement radioButton = driver.findElement(By.xpath("//input[@checked='checked']"));
//
//		if (radioButton.isEnabled()) {
//
//		} else {
//			radioButton.click();
//
//		}
//		WebElement register = driver.findElement(By.id("register-button"));
//		register.click();

//		String currentUrl = driver.getCurrentUrl();
//		WebElement creativeTab = driver.findElement(By.xpath("(//a[@target='_self'])[1]"));
//		creativeTab.click();
//		String currentUrl2 = driver.getCurrentUrl();
//
//		boolean check = currentUrl.equals(currentUrl2);
//		System.out.println(check);

		// WebElement image_text =
		// driver.findElement(By.xpath("(//div[@data-testid='galleryMosaicAsset'])[2]"));

//		List<WebElement> all_Images = driver
//				.findElements(By.xpath("//div[@class='square-grid-item__contributor-name']"));
//		
//		System.out.println("Before");
//		
//		for (WebElement images : all_Images) {
//			
//			WebDriverWait wait = new WebDriverWait(driver, 120);
//			
//			wait.until(ExpectedConditions.visibilityOf(images));
//			
//			System.out.println("Title : "+images.getText());
//			
//			
//		}
//		
//		System.out.println("After");
//		
//		//System.out.println("Size : "+all_Images.size());
		
		
//		
//
//		WebElement img = driver.findElement(By.xpath("//img[@style=\"display:none\"]"));
//
//		System.out.println(img.getAttribute("src"));
//
//		WebElement boards = driver.findElement(By.xpath("//div[text()='BOARDS']"));
//		boards.click();
//		WebElement boardName = driver.findElement(By.xpath("//input[@type='text']"));
//		boardName.sendKeys("first");
//		WebElement boardButton = driver.findElement(By.xpath("//button[text()='CREATE']"));
//		boardButton.click();
//		Thread.sleep(5000);
////		WebElement assetId = driver.findElement(By.xpath("//input[@ng-model='searchPhrase']"));
////		assetId.sendKeys("sun");
////		WebElement assetButton = driver.findElement(By.xpath("//button[text()='Add']"));
////		assetButton.click();
////	
//		WebElement image = driver.findElement(By.xpath("(//div[@data-testid='galleryMosaicAsset'])[2]"));

		WebElement id = driver.findElement(By.id("new_session_username"));
		id.sendKeys("ttinuntw@gmail.com");
		WebElement pass = driver.findElement(By.id("new_session_password"));
		pass.sendKeys("Soft0910");
		driver.findElement(By.id("sign_in")).click();
		
		String currentUrl = driver.getCurrentUrl();
		WebElement creativeTab = driver.findElement(By.xpath("(//a[@target='_self'])[1]"));
		creativeTab.click();
		String currentUrl2 = driver.getCurrentUrl();

		boolean check = currentUrl.equals(currentUrl2);
		System.out.println(check);
		
	    WebElement boards = driver.findElement(By.xpath("//div[text()='BOARDS']"));
//		boards.click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement newBoared = driver.findElement(By.xpath("//button[text()='CREATE BOARD']"));
//		newBoared.click();
//		WebElement boardName = driver.findElement(By.xpath("//input[@type='text']"));
//		boardName.sendKeys("first");
//		WebElement boardButton = driver.findElement(By.xpath("//button[text()='CREATE']"));
//		boardButton.click();
//		WebElement close = driver.findElement(By.xpath("//button[@ng-click='closeRightPanel()']"));
//		close.click();
		
		boards.click();
		WebElement getBoard = driver.findElement(By.xpath("(//a[@data-ui-location='header_side_panel_right'])[1]"));
		getBoard.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement listel = driver.findElement(By.xpath("//a[@data-nav='nav_Boards_View_All_Boards']"));
		listel.click();
		WebElement addImage = driver.findElement(By.xpath("//div[@class='board-thumbnail']"));
		addImage.click();
		
		WebElement assatName = driver.findElement(By.xpath("//input[@placeholder='Enter asset ID...']"));
		assatName.sendKeys("2");
		
		WebElement addAssat = driver.findElement(By.xpath("//button[text()='Add']"));
		addAssat.click();
		Thread.sleep(3000);
		WebElement sourceImage = driver.findElement(By.xpath("(//img[@width='612'])[1]"));
//		WebElement addImages = driver.findElement(By.xpath("/html/body/div[2]/section/div/main/div/div/div[3]/div[2]/div[2]/div[1]/article/div[1]/div[2]/div/button"));
////		JavascriptExecutor js= (JavascriptExecutor) driver;
////		js.executeScript("Window.scrollBy(0,1000);");

//		Actions s= new Actions(driver);
//		s.moveToElement(sourceImage).build().perform();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		s.moveToElement(addImages).build().perform();
//		addImages.click();
		String oldWindow = driver.getWindowHandle();
		
		
//		
		sourceImage.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String getNew : windowHandles) {
			driver.switchTo().window(getNew);
		}
		WebElement addCart = driver.findElement(By.xpath("//div[@ng-if='boardReady']"));
		addCart.click();
		driver.close();
		driver.switchTo().window(oldWindow);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement boards1 = driver.findElement(By.xpath("//div[text()='BOARDS']"));
		boards1.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement liste2 = driver.findElement(By.xpath("//a[@data-nav='nav_Boards_View_All_Boards']"));

		liste2.click();
		WebElement verify = driver.findElement(By.xpath("(//div[@class='board-image-count'])[1]"));
		String text = verify.getText();
		System.out.println("Number of image in first Board is:  "+ text);		
		
		
		
		
		
	}

}
