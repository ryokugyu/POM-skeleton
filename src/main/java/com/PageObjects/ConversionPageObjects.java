package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.PageBaseClass.PageBaseClass;

public class ConversionPageObjects extends PageBaseClass{
	
	public ConversionPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//*[@id=\"email\"]")
	public WebElement username;

	@FindBy(xpath="//*[@id=\"pass\"]")
	public WebElement password;

	@FindBy(name="login")
	public WebElement login;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/div[4]/a/span/span")
	public WebElement selectProfile;
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/span/span")
	public WebElement profileStatus;

}
