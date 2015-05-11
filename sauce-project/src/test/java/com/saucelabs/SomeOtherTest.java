package com.saucelabs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SomeOtherTest {
	
	public static void main(String[] args){
		
		WebElement element;
		//Loads the IEWebDriver and navigates to the promotion
		File file = new File("C:/Selenium/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
		WebDriver driver = new InternetExplorerDriver(dc);
		driver.get("https://safeway--dev5.cs24.my.salesforce.com/a0d190000000Kab");//takes us to promotion P-000000

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//wait 10 seconds
		
		//Login as Mike
		element = driver.findElement(By.xpath(".//input[@id='username']"));
		element.sendKeys("michael.dasalla@safeway.com.dev5");
		
		element = driver.findElement(By.xpath(".//input[@id='password']"));
		element.sendKeys("12345");
		
		element = driver.findElement(By.xpath(".//*[@id='Login']"));
		element.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//wait 10 seconds
		
		//Get the Created By field and print it out to console
		element = driver.findElement(By.xpath(".//tr/td[contains(text(), 'Created')]"));
		String s = element.getText();
		System.out.println(s);
	}

}
