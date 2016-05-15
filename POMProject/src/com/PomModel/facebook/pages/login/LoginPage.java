package com.PomModel.facebook.pages.login;

import org.openqa.selenium.WebDriver;
import com.PomModel.facebook.base.Page;
import com.PomModel.facebook.pages.inbox.LandingPage;

public class LoginPage extends Page {

	public LandingPage doLogin(String username, String password) {
		String appUrl = CONFIG.getProperty("testSiteLandingpageUrl");
		driver.get(appUrl);
		clear("EMAIL");
		clear("PASSWORD");
		input("EMAIL", username);
		input("PASSWORD", password);
		click("LOGIN_BUTTON");
		boolean result = isElementPresent("go_to_profile");
		if (result) {
			return new LandingPage();
		} else {
			return null;
		}
	}

	public LandingPage doLogin() {
		return doLogin(CONFIG.getProperty("defaultUserName"), CONFIG.getProperty("defaultPassword"));
	}

	public boolean verifyLoginPageTitle() {
		String actual = driver.getTitle();
		if ("Faceook".equals(actual)) {
			return true;

		} else{
			return false;
		}
	}

	public void register() {

	}

}
