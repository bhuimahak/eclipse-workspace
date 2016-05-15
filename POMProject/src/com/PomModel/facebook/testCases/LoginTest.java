package com.PomModel.facebook.testCases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PomModel.facebook.base.Page;
import com.PomModel.facebook.pages.inbox.LandingPage;
import com.PomModel.facebook.pages.login.LoginPage;
import com.PomModel.facebook.util.ErrorUtil;
import com.PomModel.facebook.util.TestUtil;

public class LoginTest {
	@BeforeMethod
	public void launchApp() {
		if (!TestUtil.isExecutable("LoginTest", Page.reader)) {
			throw new SkipException("Runmode is set to N");
		}

	}

	@Test(dataProvider = "getData")
	public void loginTest(HashMap<String, String> data) {
		// check the runmode of the test case
		if (!TestUtil.isExecutable("LoginTest", Page.reader)) {
			throw new SkipException("Runmode is set to N");
		}

		System.out.println(data.get("Runmode") + "----" + data.get("Username") + "----" + data.get("Password"));
		if (!data.get("Runmode").equals("Y")) {
			throw new SkipException("Runmode of the test data set is set to N");
		}

		// logout if its logged in coz this test has to run with multiple sets
		// of data
		// if(Page.isLoggedin){
		// Page.topmenu.logOut();
		// Page.isLoggedin = false;
		// }

		String username = data.get("Username");
		String password = data.get("Password");
		// temp
		String expectedResult = data.get("ExpectedResult"); // expected result
		LoginPage loginpage = new LoginPage();
		LandingPage landingpage = loginpage.doLogin(username, password);

		// error
		if (expectedResult.equals("Pass") & landingpage == null) {
			try {
				Assert.fail("Not able to log in with correct data");
			} catch (Throwable t) {
				Page.takeScreenshot("Not able to log in with correct data.jpg");
				ErrorUtil.addVerificationFailure(t);
				return;
			}
		} else if (expectedResult.equals("Fail") & landingpage != null) {

			try {
				Assert.fail("Able to log in with incorrect data");
			} catch (Throwable t) {
				Page.takeScreenshot("Able to log in with incorrect data.jpg");
				ErrorUtil.addVerificationFailure(t);
				Page.topmenu.logOut();
				return;
			}
		}

		if (landingpage != null) { // Ask this statements
			try {
				Assert.assertTrue(loginpage.verifyLoginPageTitle(), "Logged in page titles doesn match!");
			} catch (Throwable t) {
				System.out.println("in catch");

				ErrorUtil.addVerificationFailure(t);
				// take screenshot
				Page.takeScreenshot("Login.jpg");
			}
			System.out.println("Reached here");
			Page.isLoggedin = true;

		} else {
			Page.isLoggedin = false;
		}
	}

	@AfterMethod
	public void closingBrowser() {
		Page.driver.close();
		Page.driver = null;
		// LoginPage page = new LoginPage();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = TestUtil.getData("LoginTest", Page.dataReader);
		return data;
	}

}
