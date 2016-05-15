package com.PomModel.facebook.pages.inbox;

import org.openqa.selenium.WebDriver;

import com.PomModel.facebook.base.Page;

public class LandingPage extends Page {

	
	public MyProfilePage gotoProfile() {
		
		System.out.println("Going to Profile");
		click("go_to_profile");
		return new MyProfilePage();

	}

}
