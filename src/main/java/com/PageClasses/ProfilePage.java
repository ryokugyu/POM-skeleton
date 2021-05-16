package com.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageBaseClass.PageBaseClass;
import com.PageObjects.ConversionPageObjects;

public class ProfilePage extends PageBaseClass {
	ConversionPageObjects cpo;


	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		
		cpo = new ConversionPageObjects(driver);
		PageFactory.initElements(driver, cpo);

	}
	
	public void displayProfileStatus() {
		System.out.println(cpo.profileStatus.getText());
	}


}
