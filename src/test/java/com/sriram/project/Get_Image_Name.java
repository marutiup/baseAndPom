package com.sriram.project;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Get_Image_Name {	

		
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SRIRAM\\eclipse-workspace\\Verson2.0\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.gettyimages.in/");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			List<WebElement> nameLists = driver.findElements(By.xpath(
					"//div[@class='square-grid-item__details square-grid-item__info']//child::div[@class='square-grid-item__contributor-name']"));

			Actions act = new Actions(driver);

			Iterator<WebElement> iterator = nameLists.iterator();
			ArrayList<String> arrayList = new ArrayList<String>();

			while (iterator.hasNext()) {

				WebElement next = iterator.next();

				act.moveToElement(next).build().perform();

				Thread.sleep(1000);

				String text = next.getText();
				System.out.println(text);
				
				arrayList.add(text);
	 }
			for(int i =1; i < arrayList.size(); i++) {
		         if (arrayList.contains(arrayList.get(i))) {
		        	 System.out.println("contains duplicate");
		         }
		         else {
		        	 System.out.println("No duplicate Name");
		         }
			
		}	
				
				
				
			}

			}
			
			
				
				
			
			

//			WebElement name = driver.findElement(By.xpath("(//div[text()='Sean Murphy'])[1]"));
	//
//			Actions act = new Actions(driver);
	//
//			act.moveToElement(name).build().perform();
	//
//			Thread.sleep(2000);
	//
//			System.out.println(name.getText());

		
		
		
		
		
		
		
		
		
	

