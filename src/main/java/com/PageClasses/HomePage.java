package com.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageBaseClass.PageBaseClass;
import com.PageObjects.ConversionPageObjects;

public class HomePage extends PageBaseClass {
	ConversionPageObjects conversionPageObject;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		
		conversionPageObject = new ConversionPageObjects(driver);
		PageFactory.initElements(driver, conversionPageObject);
	}
	
	public ProfilePage selectUserProfile() throws InterruptedException {
		
		conversionPageObject.selectProfile.click();
		Thread.sleep(5000);
		
		ProfilePage profilepage = new ProfilePage(driver);
		PageFactory.initElements(driver, profilepage);
		
		return profilepage ;
		
	}

}
