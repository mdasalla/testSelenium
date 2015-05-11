package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDivisionsPage {
	
	public static WebElement newDivisionDetailsButton(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//*/input[contains(@title, 'Division Details')]"));
		return element;
	}
	
	public static WebElement divisionCheckbox(WebDriver driver, String division) {

		WebElement element = driver.findElement(By.xpath(".//*/label[contains(text(), '"+ division + "')]/preceding-sibling::input[@type='checkbox']"));
		return element;
	}

}
