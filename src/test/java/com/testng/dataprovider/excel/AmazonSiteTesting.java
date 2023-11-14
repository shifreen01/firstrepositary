package com.testng.dataprovider.excel;

import org.testng.annotations.Test;

import com.base.utils.BaseClass;
import com.facebook.page.repositary.AmazonSitePageRepositary;

public class AmazonSiteTesting extends BaseClass {
	
	@Test(dataProvider = "loginData", dataProviderClass = ExcelUtil.class)
	public void TestLogin(String userName, String password, String scenarioTested, String browser, String url,
			String expectedValue,String info1,String info2,String info3,String info4,String info5,String info6) throws Exception {
		System.out.println("The username test data used: " + userName);
		System.out.println("The password test data used: " + password);
		System.out.println("The sceanrio tested: " + scenarioTested);
		System.out.println("The browser used for testing: " + browser);
		System.out.println("The url used for testing: " + url);
		BaseClass.browserLaunch(browser, url);
		testName(scenarioTested);
		BaseClass.click(AmazonSitePageRepositary.helloSignIn());
		BaseClass.sleepTime(2000);
		BaseClass.dataSend(AmazonSitePageRepositary.emailField(), userName);
		BaseClass.sleepTime(2000);
		BaseClass.click(AmazonSitePageRepositary.continueButton());
		BaseClass.sleepTime(2000);
		BaseClass.dataSend(AmazonSitePageRepositary.passwordField(), password);
		BaseClass.sleepTime(2000);
		BaseClass.click(AmazonSitePageRepositary.passwordSubmit());
		BaseClass.sleepTime(4000);
		BaseClass.loggingInformation(info1, info2, info3,info4,info5,info6);
		BaseClass.sleepTime(4000);
		BaseClass.assertData(expectedValue, AmazonSitePageRepositary.userVerified());
		

	}
}
