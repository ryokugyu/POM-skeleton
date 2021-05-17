package com.AutomationTest;

import java.util.Hashtable;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageBaseClass.PageBaseClass;
import com.PageClasses.HomePage;
import com.PageClasses.LandingPage;
import com.PageClasses.ProfilePage;
import com.utilities.ReadPropertiesFile;
import com.utilities.TestDataProvider;

public class BaseTests {
	Properties prop = ReadPropertiesFile.readConfiguration();
	LandingPage landingPage;
	HomePage home;
	ProfilePage profilepage;
	
	@Test(dataProvider="AutomationTestData",description="provides data for the base test")
	public void FacebookLoginTest(Hashtable<String, String> testData) throws InterruptedException {
		PageBaseClass pagebaseclass = new PageBaseClass();
		pagebaseclass.invokeBrowser(prop.getProperty("browserName"));
		landingPage = pagebaseclass.openApplication(prop.getProperty("WebPageURL"));
		landingPage.inputUserName(testData.get("UserName"));
		landingPage.inputPassword(testData.get("Password"));
		home = landingPage.clickLogin();
		profilepage = home.selectUserProfile();
		profilepage.displayProfileStatus();
		pagebaseclass.closeBrowser();
	}
	
	@DataProvider
	public Object[][] AutomationTestData(){
		return TestDataProvider.getTestData("TestData.xlsx", "AutomationBaseTestData", "BaseTest");
	}

}
