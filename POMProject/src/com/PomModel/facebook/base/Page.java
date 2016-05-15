package com.PomModel.facebook.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.PomModel.facebook.pages.inbox.TopMenu;
import com.PomModel.facebook.util.ExcelReader;

public class Page {
	public static WebDriver driver = null; // we need all the page objects
											// created to use the same instance
											// of WebDriver
	public static Properties CONFIG = null;
	public static Properties OR = null;
	public static TopMenu topmenu = null;
	public static ExcelReader reader = new ExcelReader("src//com//PomModel//facebook//xls//TestCases.xlsx",
			"Test Cases");
	public static ExcelReader dataReader = new ExcelReader("src//com//PomModel//facebook//xls//TestCases.xlsx",
			"Test Data");
	// second parameter is the sheet name in ExcelReader

	public static boolean isLoggedin = false;

	public Page() {
		if (driver == null) {
			// initialize the properties file
			CONFIG = new Properties();
			OR = new Properties();
			try {
				// Loading CONFIG.properties file
				FileInputStream fs = new FileInputStream("src//com//PomModel//config//config.properties");
				CONFIG.load(fs);

				// Loading OR.properties file
				fs = new FileInputStream("src//com//PomModel//config//OR.properties");
				OR.load(fs);

			} catch (IOException e) {
				System.out.println("File was not found!");
				e.printStackTrace();
			}
			String browser = CONFIG.getProperty("Browser");
			System.out.println("Browser is: " + browser);
			if ("Mozilla".equals(browser)) {
				this.driver = new FirefoxDriver();
			} else if ("Chrome".equals(browser)) {
				System.setProperty("webdriver.chrome.driver", "chromedriver//chromedriver.exe");
				this.driver = new ChromeDriver();
			}
			// setting implicit wait for the whole application
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			topmenu = new TopMenu();
		}

	}

	public void clear(String xpathKey) {
		try {
			String xpathValue = OR.getProperty(xpathKey);
			driver.findElement(By.xpath(xpathValue)).clear();
		} catch (Exception e) {
			System.out.println("couldn't find element!--in clear function");
			e.printStackTrace();
		}
	}

	// click
	public void click(String xpathKey) {
		try {
			String xpathValue = OR.getProperty(xpathKey);
			driver.findElement(By.xpath(xpathValue)).click();
		} catch (Exception e) {
			System.out.println("In click method--couldn't find element!");
			e.printStackTrace();
		}
		
	}

	// input
	public void input(String xpathkey, String text) {
		try {
			String xpathValue = OR.getProperty(xpathkey);
			driver.findElement(By.xpath(xpathValue)).sendKeys(text);
		} catch (Exception e) {
			System.out.println("In input method--couldn't find element!");
		}
	}

	// verification
	public boolean isElementPresent(String xpathkey) {
		try {
			String xpathValue = OR.getProperty(xpathkey);
			driver.findElement(By.xpath(xpathValue));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean isLinkPresent(String linkText) {
		try {
			driver.findElement(By.linkText(linkText));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	// mouseOver
	public void mouseOver(String xpathkey) {
		try {
			String xpathValue = OR.getProperty(xpathkey);
			WebElement element = driver.findElement(By.xpath(xpathValue));
			Actions builder = new Actions(driver);
			Action act = builder.moveToElement(element).build();
			act.perform();
		} catch (Exception e) {
			System.out.println("Action cant be completed/element could not be found!");
		}
	}

	public static void takeScreenshot(String screenshotName) {
		System.out.println("Taking screenshot....");
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File(System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
