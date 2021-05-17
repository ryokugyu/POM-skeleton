package com.AutomationTest;

import java.util.Properties;

import org.testng.annotations.Test;

import com.PageBaseClass.PageBaseClass;
import com.PageClasses.HomePage;
import com.PageClasses.LandingPage;
import com.PageClasses.ProfilePage;
import com.utilities.ReadPropertiesFile;

public class BaseTests {
	Properties prop = ReadPropertiesFile.readConfiguration();
	LandingPage landingPage;
	HomePage home;
	ProfilePage profilepage;
	
	@Test
	public void FacebookLoginTest() throws InterruptedException {
		PageBaseClass pagebaseclass = new PageBaseClass();
		pagebaseclass.invokeBrowser(prop.getProperty("browserName"));
		landingPage = pagebaseclass.openApplication(prop.getProperty("WebPageURL"));
		landingPage.inputUserName();
		landingPage.inputPassword();
		home = landingPage.clickLogin();
		profilepage = home.selectUserProfile();
		profilepage.displayProfileStatus();
		pagebaseclass.closeBrowser();
	}

}
