package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LookupPage {
	
	public static WebElement searchEditBox(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath("//*[@id='theForm']/div/div/input[contains(@placeholder, 'Search')]"));
		return element;
	}
	
	public static WebElement businessUnitName(WebDriver driver, String businessUnitName) {

		WebElement element = driver.findElement(By.xpath(".//*/a[contains(text(), '" + businessUnitName + "')]"));
		return element;
	}

	public static WebElement searchGoButton(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//*[@id='theForm']/div/div/input[@title='Go!']"));
		return element;
	}
	
	public static void swithToLookupPage(WebDriver driver) {

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='searchFrame']")));
	}
}
