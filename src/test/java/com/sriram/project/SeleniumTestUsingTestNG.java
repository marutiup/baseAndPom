package com.sriram.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SeleniumTestUsingTestNG {
	WebDriver driver;

	@BeforeSuite
	public void beforeStart() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test
	public void navigateAndGetTitle() {
		driver.navigate().to("https://www.gettyimages.in");
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(enabled=false)
	public void register() {
		WebElement userIcon = driver.findElement(By.xpath("//a[text()='SIGN IN']"));
		userIcon.click();
		WebElement registerButton = driver.findElement(By.xpath("//div[text()='REGISTER']"));
		registerButton.click();
		WebElement firstName = driver.findElement(By.id("register_first_name"));
		firstName.sendKeys("sri");
		WebElement lastName = driver.findElement(By.id("register_last_name"));
		lastName.sendKeys("ram");
		WebElement firstDropDown = driver.findElement(By.xpath("(//select[@required='required'])[1]"));

		Select s = new Select(firstDropDown);
		s.selectByValue("10");
		WebElement organization = driver.findElement(By.id("register_organization_name"));
		organization.sendKeys("Soft Crylic");
		WebElement jobTitle = driver.findElement(By.xpath("(//select[@required='required'])[2]"));
		Select s1 = new Select(jobTitle);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		s1.selectByValue("47");
		WebElement email = driver.findElement(By.id("register_email"));
		email.sendKeys("ttinuntw@gmail.com");
		WebElement mobileNumber = driver.findElement(By.id("register_telephone"));
		mobileNumber.sendKeys("8825505849");
		WebElement id = driver.findElement(By.id("register_extension"));
		id.sendKeys("11/11/2247");
		WebElement password = driver.findElement(By.id("register_password"));
		password.sendKeys("Soft0910");
		WebElement radioButton = driver.findElement(By.xpath("//input[@checked='checked']"));

		if (radioButton.isEnabled()) {

		} else {
			radioButton.click();

		}
		WebElement register = driver.findElement(By.id("register-button"));
		register.click();		
	}
	
	@Test(dependsOnMethods = "navigateAndGetTitle")
	public void login() {
		WebElement userIcon = driver.findElement(By.xpath("//a[text()='SIGN IN']"));
		userIcon.click();
		WebElement id = driver.findElement(By.id("new_session_username"));
		id.sendKeys("ttinuntw@gmail.com");
		WebElement pass = driver.findElement(By.id("new_session_password"));
		pass.sendKeys("Soft0910");
		driver.findElement(By.id("sign_in")).click();

	}
	@Test(dependsOnMethods = "login")
	public void creativeTab() {
		String currentUrl = driver.getCurrentUrl();
		WebElement creativeTab = driver.findElement(By.xpath("(//a[@target='_self'])[1]"));
		creativeTab.click();
		String currentUrl2 = driver.getCurrentUrl();

		boolean check = currentUrl.equals(currentUrl2);
		System.out.println(check);
	}
	@Test(dependsOnMethods = "creativeTab")
	public void getImageNameAndCheckDuplicate() {

		List<WebElement> nameLists = driver.findElements(By.xpath(
				"//div[@class='square-grid-item__details square-grid-item__info']//child::div[@class='square-grid-item__contributor-name']"));

		Actions act = new Actions(driver);

		Iterator<WebElement> iterator = nameLists.iterator();
		ArrayList<String> arrayList = new ArrayList<String>();

		while (iterator.hasNext()) {

			WebElement next = iterator.next();

			act.moveToElement(next).build().perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String text = next.getText();
			System.out.println(text);

			arrayList.add(text);
		}
		for(int i =0; i < arrayList.size(); i++) {
			if (arrayList.contains(arrayList.get(i))) {
				System.out.println("contains duplicate");
			}
			else {
				System.out.println("No duplicate Name");
			}		
		}	
	}
	@Test(dependsOnMethods = "getImageNameAndCheckDuplicate")
	public void createBoard() {
		WebElement boards = driver.findElement(By.xpath("//div[text()='BOARDS']"));
		boards.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement newBoared = driver.findElement(By.xpath("//button[text()='CREATE BOARD']"));
		newBoared.click();
		WebElement boardName = driver.findElement(By.xpath("//input[@type='text']"));
		boardName.sendKeys("first");
		WebElement boardButton = driver.findElement(By.xpath("//button[text()='CREATE']"));
		boardButton.click();
		WebElement close = driver.findElement(By.xpath("//button[@ng-click='closeRightPanel()']"));
		close.click();

	}
	@Test(dependsOnMethods = "createBoard")
	public void addImageAndVerify() {
		WebElement boards = driver.findElement(By.xpath("//div[text()='BOARDS']"));
		boards.click();
		//		WebElement getBoard = driver.findElement(By.xpath("(//a[@data-ui-location='header_side_panel_right'])[1]"));
		//		getBoard.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement listel = driver.findElement(By.xpath("//a[@data-nav='nav_Boards_View_All_Boards']"));
		listel.click();
		WebElement addImage = driver.findElement(By.xpath("//div[@class='board-thumbnail']"));
		addImage.click();

		WebElement assatName = driver.findElement(By.xpath("//input[@placeholder='Enter asset ID...']"));
		assatName.sendKeys("2");

		WebElement addAssat = driver.findElement(By.xpath("//button[text()='Add']"));
		addAssat.click();

		WebElement sourceImage = driver.findElement(By.xpath("(//img[@width='612'])[1]"));

		String oldWindow = driver.getWindowHandle();
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
	@AfterSuite
	public void end() {
		driver.quit();
	}

}
