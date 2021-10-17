package com.sriram.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeScreenShot extends BaseClass {

	public static void main(String[] args) throws Throwable {
		browserLuanch();
		driver.get("https://www.gettyimages.in/");
		List<WebElement> findElements = driver.findElements(By.xpath("//a[contains(@class, 'square-grid')]"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements(findElements));
		int size = findElements.size();
		System.out.println(size);
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			System.out.println(text);

		}

	}

}
