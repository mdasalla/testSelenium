package com.saucelabs;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PromotionTests {

	public PromotionTests(WebDriver driver) {
		WebDriver currentDriver = driver;
	}

	public static void createBXGYPromotion(WebDriver remoteDriver) throws Exception{
		/**
		URL url = new URL("http://cb_safeway:41133e06-cc73-4ebe-a8b6-bcf7d3f68ca6@ondemand.saucelabs.com:80/wd/hub");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("version", "35");
        capabilities.setCapability("platform", Platform.WIN8_1);
		remoteDriver = new RemoteWebDriver(url, capabilities);
		*/
		//Run on Firefox and IE browsers
		List<WebDriver> drivers = new ArrayList<WebDriver>();
		drivers.add(remoteDriver);
		//drivers.add(Common.useIEDriver());
		//WebDriver driver = Common.useFFDriver();
		for (WebDriver driver : drivers)
		{
			driver.get("https://test.salesforce.com");
			Common.seleniumWait(driver, 20);
			
			Common.loginAsMike(driver);
			Common.seleniumWait(driver, 20);
			
			PromotionPage.promotionNewButton(driver).click();
			Common.seleniumWait(driver, 20);

			PromotionPage.departmentBUGMEditBox(driver).sendKeys("TELECOM CARD SERVICES");
			PromotionPage.selectCategoryTypeItem(driver, "Buy X Get Y Free");
			Common.seleniumWait(driver, 20);
			PromotionPage.selectGroupItem(driver, "Corporate");
			PromotionPage.brandAndSizeEditBox(driver).sendKeys("12");
			PromotionPage.offerStartDate(driver).sendKeys("11/6/2014");
			PromotionPage.offerEndDate(driver).sendKeys("11/6/2014");
			PromotionPage.pluInputBox(driver).sendKeys("12345");
			PromotionPage.saveButton(driver).click();
			
			Common.verifyExists(PromotionPage.createdBy(driver).getText());
			Common.verifyExists(PromotionPage.phoneNumber(driver).getText());
//			
//			PromotionPage.newDivisionDetailsButton(driver).click();
//			Common.seleniumWait(driver, 10);
//			
//			SelectDivisionsPage.newDivisionDetailsButton(driver).click();
//			Common.seleniumWait(driver, 10);
//			SelectDivisionsPage.divisionCheckbox(driver, "Denver").click();

		}
		
	}
}
