package com.PomModel.facebook.pages.inbox;

import org.openqa.selenium.By;

import com.PomModel.facebook.base.Page;

public class TopMenu {
	
	public LandingPage gotoLandingPage(){
		Page.driver.findElement(By.xpath(Page.OR.getProperty("homepage_link"))).click();
		return new LandingPage();
		
	}
	
	public void logOut(){
		Page.driver.findElement(By.xpath(Page.OR.getProperty("top_menu_list"))).click();;
		Page.driver.findElement(By.xpath(Page.OR.getProperty("logout_link"))).click();
	}

}
