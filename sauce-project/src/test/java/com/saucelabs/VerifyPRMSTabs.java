package com.saucelabs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyPRMSTabs {

	public static void main(String[] args) {

		List<WebDriver> drivers = new ArrayList<WebDriver>();
		//drivers.add(Common.useFFDriver());
		drivers.add(Common.useIEDriver());
		//WebDriver driver = Common.useFFDriver();
		for (WebDriver driver : drivers)
		{
			driver.get("https://test.salesforce.com");
			Common.seleniumWait(driver, 20);
			
			Common.loginAsPRMSRequestor(driver);
			Common.seleniumWait(driver, 20);
			
			PromotionPage.allTabsTab(driver).click();
			Common.seleniumWait(driver, 20);
			
			AllTabsPage.selectView(driver, "PRMS");
			Common.seleniumWait(driver, 20);
			
			driver.getCurrentUrl();
			List<WebElement> elements = AllTabsPage.allListItems(driver);
			for (WebElement e : elements)
			{
				Common.verifyExists(e.getText());
			}
		}
	}

}
