package com.PomModel.facebook.pages.inbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.PomModel.facebook.base.Page;

public class FriendsList extends Page {

	// search for a friend
	public boolean searchFriend(String name) {
		input("search_a_friend", name);
		click("search_icon");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isLinkPresent(name);
		
		// List<WebElement> list =
		// driver.findElements(By.className("fbProfileBrowserListItem"));
		// int number =
		// driver.findElements(By.className("fbProfileBrowserListItem")).size();
		// WebElement element = list.get(0);
		// element.click();
		// System.out.println("Total results" +number);

	}

}
