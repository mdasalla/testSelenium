package com.saucelabs;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	
	private WebDriver driver;
	
    public void setUp() throws Exception {
        // Choose the browser, version, and platform to test
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("version", "17");
        capabilities.setCapability("platform", Platform.WIN8_1);
        // Create the connection to Sauce Labs to run the tests
        this.driver = new RemoteWebDriver(
                new URL("http://cb_safeway:41133e06-cc73-4ebe-a8b6-bcf7d3f68ca6@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
    }
	
	public static WebDriver useFFDriver() {
		DesiredCapabilities dc = DesiredCapabilities.firefox();
        WebDriver driver = new FirefoxDriver(dc);
		return driver;
	}
	
	public static WebDriver useIEDriver() {

		File file = new File("C:/Selenium/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
		WebDriver driver = new InternetExplorerDriver(dc);
		return driver;
	}
	
	public static void loginAsMike(WebDriver driver) {
		
		SalesforceMainPage.setUserName(driver,"michael.dasalla@safeway.com.dev5");
		SalesforceMainPage.setPassword(driver, "R0ckw3ll!");
		SalesforceMainPage.salesforceLoginButton(driver).click();
	
	}
	
	public static void loginAsPRMSRequestor(WebDriver driver) {
		
		SalesforceMainPage.setUserName(driver,"prmstestrequestor1@safeway.com.dev5");
		SalesforceMainPage.setPassword(driver, "dyi2oDHV21");
		SalesforceMainPage.salesforceLoginButton(driver).click();
	
	}
	
	public static void selectPromotionCategoryType(WebDriver driver, String categoryInDropDown) {
		
		Select select = new Select(PromotionPage.promotionCategoryTypeDropDown(driver));
		select.selectByVisibleText(categoryInDropDown);
	}
	
	public static void clickPromotionType(WebDriver driver, String promotionInDropDown) {
		
		Select select = new Select(PromotionPage.promotionTypeDropDown(driver));
		select.selectByVisibleText(promotionInDropDown);
	}
	
	public static void seleniumWait(WebDriver driver, int timeInSeconds) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
	}
	
	public static WebElement seleniumWaitUntilVisible(WebDriver driver, String elementXpath, int timeInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		WebElement element = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
		return element;
	}
	
	public static void verifyExists(String verify) {
		
		System.out.println(verify);
	}
}
