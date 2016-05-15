package com.PomModel.facebook.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.PomModel.facebook.base.Page;
import com.PomModel.facebook.pages.inbox.LandingPage;
import com.PomModel.facebook.pages.inbox.MyProfilePage;
import com.PomModel.facebook.pages.login.LoginPage;
import com.PomModel.facebook.util.TestUtil;

public class ChangePicTest {

	@Test
	public void changePic() {
		// check Runmode of this test first
		if (!TestUtil.isExecutable("ChangePicTest", Page.reader)) {
			throw new SkipException("Runmode is set to N");
		}

		LandingPage landingpage = null;
		// check whether the user is logged in or not
		if (!Page.isLoggedin) {
			// do Login
			LoginPage loginpage = new LoginPage();
			landingpage = loginpage.doLogin();
		} else {
			landingpage = Page.topmenu.gotoLandingPage();
		}
		

		MyProfilePage myprofile = landingpage.gotoProfile();
		//myprofile.changePicture("C://Users//mahak//Desktop//me.png");

	}

}
