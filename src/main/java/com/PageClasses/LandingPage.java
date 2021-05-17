package com.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageBaseClass.PageBaseClass;
import com.PageObjects.ConversionPageObjects;

public class LandingPage extends PageBaseClass {
	ConversionPageObjects conversionPageObject;
	
	public LandingPage(WebDriver driver) {
		this.driver= driver;
		
		conversionPageObject = new ConversionPageObjects(driver);
		PageFactory.initElements(driver, conversionPageObject);
		
	}
	
	public void inputUserName(String username) {
		conversionPageObject.username.clear();
		conversionPageObject.username.sendKeys(username);
		
	}
	
	public void inputPassword(String password) {
		conversionPageObject.password.clear();
		conversionPageObject.password.sendKeys(password);
	}
	
	public HomePage clickLogin() {
		
		try{
			conversionPageObject.login.click();
			Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		HomePage home = new HomePage(driver);
		PageFactory.initElements(driver, home);
		
		return home;
		
	}
	

}
