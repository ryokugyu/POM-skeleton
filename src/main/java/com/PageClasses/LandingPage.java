package com.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageBaseClass.PageBaseClass;
import com.PageObjects.ConversionPageObjects;

public class LandingPage extends PageBaseClass {
	ConversionPageObjects cpo;
	
	public LandingPage(WebDriver driver) {
		this.driver= driver;
		
		cpo = new ConversionPageObjects(driver);
		PageFactory.initElements(driver, cpo);
		
	}
	
	public void inputUserName() {
		cpo.username.clear();
		cpo.username.sendKeys("*********");
		
	}
	
	public void inputPassword() {
		cpo.password.clear();
		cpo.password.sendKeys("********");
	}
	
	public HomePage clickLogin() {
		
		try{
			cpo.login.click();
			Thread.sleep(5000);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		HomePage home = new HomePage(driver);
		PageFactory.initElements(driver, home);
		
		return home;
		
	}
	

}
