package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PromotionPage {
	
	public static WebElement promotionTab(WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath(".//*/a[contains(@title, 'Promotions')]"));
		return element;
	}
	
	public static WebElement createdBy(WebDriver driver) {
		String saveButtonXpath = ".//*[contains(@id, 'CreatedBy')]";
		WebElement element = Common.seleniumWaitUntilVisible(driver, saveButtonXpath, 60);
		return element;
	}
	
	public static WebElement departmentBUGMSearchIcon(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//*/a/img[contains(@title, 'Department/BUGM Lookup')]"));
		return element;
	}
	
	public static WebElement departmentBUGMEditBox(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//*[@class='lookupInput']/input"));
		return element;
	}
	
	public static WebElement brandAndSizeEditBox(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//label[contains(text(), 'Brand & Size')]/../following::input[1]"));
		return element;
	}
	
	public static WebElement offerStartDate(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//label[contains(text(), 'Offer Start Date')]/../following::input[1]"));
		return element;
	}
	
	public static WebElement offerEndDate(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//label[contains(text(), 'Offer End Date')]/../following::input[1]"));
		return element;
	}
	
	public static WebElement pluInputBox(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//label[contains(text(), 'PLU')]/../following::input[1]"));
		return element;
	}
	
	public static WebElement promotionCategoryTypeDropDown(WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath(".//select[contains(@id, 'Category_Type.input')]"));
		return element;
	}
	
	public static void selectCategoryTypeItem(WebDriver driver, String categoryTypeInDropDown) {
		//finds the exact option and then finds the parent
		Select select = new Select(driver.findElement(By.xpath(".//select//option[contains(@value, '" + categoryTypeInDropDown + "')]/parent::*")));
		System.out.println(select);
		select.selectByVisibleText(categoryTypeInDropDown);
	}
	
	public static void selectGroupItem(WebDriver driver, String groupInDropDown) {
		//finds the exact option and then finds the parent
		Select select = new Select(driver.findElement(By.xpath(".//select//option[contains(@value, '" + groupInDropDown + "')]/parent::*")));
		System.out.println(select);
		select.selectByVisibleText(groupInDropDown);
	}
	
	public static WebElement promotionTypeDropDown(WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath(".//select[contains(@id, 'Promotion_Type.input')]"));
		return element;
	}
	
	public static WebElement promotionTypeItem(WebDriver driver, String promotionInDropDown) {
		
		WebElement element = driver.findElement(By.xpath(".//*[contains(@id, 'Promotion_Type.input')]/option[contains(text(), '" + promotionInDropDown + "')]"));
		return element;
	}

	public static WebElement promotionInList(WebDriver driver, String promotion) {
		
		WebElement element = driver.findElement(By.xpath(".//a[contains(text(), " + promotion));
		return element;
	}
	
	public static WebElement promotionFinishButton(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//*[contains(@id, 'finish')]"));
		return element;
	}
	
	public static WebElement promotionNewButton(WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath(".//*/input[@title='New']"));
		return element;
	}
	
	public static WebElement promotionNextButton(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//*[contains(@id, 'next')]"));
		return element;
	}
	
	public static WebElement phoneNumber(WebDriver driver) {
		String saveButtonXpath = ".//*[contains(text(), 'Phone Number')]";
		WebElement element = Common.seleniumWaitUntilVisible(driver, saveButtonXpath, 60);
		return element;
	}
	
	public static WebElement saveButton(WebDriver driver) {
		String saveButtonXpath = ".//*[contains(@value, 'Save')]";
		WebElement element = Common.seleniumWaitUntilVisible(driver, saveButtonXpath, 60);
		return element;
	}
	
	public static WebElement newDivisionDetailsButton(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//*/input[contains(@title, 'Division Details')]"));
		return element;
	}
	
	public static WebElement allTabsTab(WebDriver driver) {

		WebElement element = driver.findElement(By.xpath(".//*[@id='AllTab_Tab']/a/img"));
		return element;
	}

}
