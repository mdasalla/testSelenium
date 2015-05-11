package com.saucelabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AllTabsPage {

	public static void selectView(WebDriver driver, String view) {
		
		Select select = new Select(driver.findElement(By.xpath(".//*[@id='p1']")));
		select.selectByVisibleText(view);
	}	
	
	public static List<WebElement> allListItems(WebDriver driver) {
		
		List<WebElement> elements = driver.findElements(By.xpath(".//*/table/tbody/tr/td/a"));
		return elements;

	}	
}
