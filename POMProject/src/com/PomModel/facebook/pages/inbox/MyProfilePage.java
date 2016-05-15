package com.PomModel.facebook.pages.inbox;

import com.PomModel.facebook.base.Page;

public class MyProfilePage extends Page {

	public void changePicture(String newPicPath) {
		mouseOver("profile_pic");
		System.out.println("mouse over complete");
		click("update_profile_pic");
		System.out.println(isElementPresent("upload_photo"));
		input("upload_photo", newPicPath);
		// System.out.println("clicked on upload photo link");
	}

	public FriendsList loadFriendList() {
		click("friends_link");
		return new FriendsList();
	}

}
