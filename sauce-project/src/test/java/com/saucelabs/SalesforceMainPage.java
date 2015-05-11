package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesforceMainPage {
	
	public static WebElement salesforceLoginButton(WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='Login']"));
		return element;
	}

	public static void setUserName(WebDriver driver, String usr) {

		WebElement element = driver.findElement(By.xpath(".//input[@id='username']"));
		element.sendKeys(usr);
	}
	
	public static void setPassword(WebDriver driver, String password) {

		WebElement element = driver.findElement(By.xpath(".//input[@id='password']"));
		element.sendKeys(password);
	}
	
	
}
