package com.PomModel.facebook.testCases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PomModel.facebook.base.Page;
import com.PomModel.facebook.pages.inbox.FriendsList;
import com.PomModel.facebook.pages.inbox.LandingPage;
import com.PomModel.facebook.pages.inbox.MyProfilePage;
import com.PomModel.facebook.pages.login.LoginPage;
import com.PomModel.facebook.util.TestUtil;

public class FindaFriendTest {

	@Test(dataProvider = "getData")
	public void findFriend(HashMap<String, String> data) {
		//find the runmode of the testcase
		if (!TestUtil.isExecutable("FindaFriendTest", Page.reader)) {
			throw new SkipException("Skipping this test as the Runmode is set to N");
		}
		System.out.println("Running find friend test");
		
		//find the runmode of this test set
		String runmode = data.get("Runmode");
		if (runmode.equals("N")) {
			throw new SkipException("Runmode of the test data set is set to N");
		}

		String friendName = data.get("FriendName");
		String expectedResult = data.get("ExpectedResult");

		LandingPage landingpage = null;
		// check whether the user is logged in or not
		if (!Page.isLoggedin) {
			System.out.println("is not logged in ..so logging in");
			// If I am not logged in then log me in
			LoginPage loginpage = new LoginPage();
			landingpage = loginpage.doLogin();
			Page.isLoggedin = true;
		} else {
			System.out.println("Its already logged in! no need to log in again!");
			// I am already logged in and now going to the landing page
			landingpage = Page.topmenu.gotoLandingPage();
		}

		MyProfilePage profilepage = landingpage.gotoProfile();
		FriendsList fs = profilepage.loadFriendList();
		boolean isFriendFound = fs.searchFriend(friendName);
		if (expectedResult.equals("Pass") & !(isFriendFound)) {
			Assert.fail("Its not able to find a valid friend");
			// can take screenshot here put in try catch
		}
		if (expectedResult.equals("Fail") & (isFriendFound)) {
			Assert.fail("Its able to find an invalid friend");
		}

	}

	@DataProvider
	public Object[][] getData() {
		return TestUtil.getData("FindaFriendTest", Page.dataReader);
	}

	@Test(dependsOnMethods = { "findFriend" })
	// if findFriend fails, this will not run
	public void messageFriend() {
		System.out.println("Running message friend test");
	}

}
