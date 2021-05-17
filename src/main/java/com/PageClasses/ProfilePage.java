package com.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageBaseClass.PageBaseClass;
import com.PageObjects.ConversionPageObjects;

public class ProfilePage extends PageBaseClass {
	ConversionPageObjects conversionPageObject;


	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		
		conversionPageObject = new ConversionPageObjects(driver);
		PageFactory.initElements(driver, conversionPageObject);

	}
	
	public void displayProfileStatus() {
		System.out.println("Inside the page..");
	}


}
