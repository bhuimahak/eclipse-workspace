package dataDrivenFramework.dataDriven;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.SkipException;

import dataDrivenFramework.util.Constants;
import dataDrivenFramework.util.ExcelReader;
import dataDrivenFramework.util.PropertiesProvider;
import dataDrivenFramework.util.Utility;

public class TestBase {

	// public WebDriver driver = null;
	RemoteWebDriver driver = null;
	protected Logger APPLICATION_LOG = Logger.getLogger(TestBase.class);

	public void validateRunmodes(String testName, String suiteName, String dataRunmode) {
		try {
			APPLICATION_LOG.debug("Validating runmode for testName: " + testName + "and suiteName: " + suiteName);
			boolean isSuiteRunnable = Utility.isSuiteRunnable(suiteName,
					new ExcelReader(PropertiesProvider.getProperty("xlsFileLocation") + "Suite.xlsx",
							Constants.SUITE_SHEET));
			if (isSuiteRunnable == false) {
				String message = "Skipping the test " + testName + " inside the suite " + suiteName
						+ ". Reason: Suite NOT runnable.";
				APPLICATION_LOG.debug(message);
				throw new SkipException(message);
			}
			boolean isTestCaseRunnable = Utility.isTestCaseRunnable(testName,
					new ExcelReader(PropertiesProvider.getProperty("xlsFileLocation") + suiteName + ".xlsx",
							Constants.TESTCASES_SHEET));

			if (isTestCaseRunnable == false) {
				String message = "Skipping the test " + testName + " inside the suite " + suiteName
						+ ". Reason: Test case NOT runnable.";
				APPLICATION_LOG.debug(message);
				throw new SkipException(message);
			}
			if (!dataRunmode.equals(Constants.RUNMODE_YES)) {
				String message = "Skipping the test " + testName + "inside the suite " + suiteName
						+ ". Reason: Test input NOT runnable.";
				APPLICATION_LOG.debug(message);
				throw new SkipException(message);
			}
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
	}

	// *******************GENERIC FUNCTIONS**************************

	public void openBrowser(String browserName) throws MalformedURLException {
		System.out.println("Browser:" + browserName + ":");
		try{
		DesiredCapabilities cap = null;
		if (browserName.equals("Mozilla")) {
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			System.out.println("opening ff");

		} else if (browserName.equals("Chrome")) {
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			System.out.println("opening chrome");

		}
		cap.setPlatform(Platform.ANY);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);

		/*
		 * if (browserName.equalsIgnoreCase("Mozilla")) { driver = new
		 * FirefoxDriver(); } else if (browserName.equalsIgnoreCase("Chrome")) {
		 * System.setProperty("webdriver.chrome.driver",
		 * PropertiesProvider.getProperty("chromedriverexe")); driver = new
		 * ChromeDriver(); }
		 */
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		catch(Exception e){
			Assert.fail("Not able to open the browser " +e.getMessage());
		}

	}

	public void click(String identifier) {
		By by = getBy(identifier);

		if (by != null) {
			try {
				driver.findElement(by).click();
			} catch (NoSuchElementException e) {
				System.out.println("Element not found!");
				Assert.fail("Element not found: " + identifier);
			}
		}
	}

	public void navigate(String URLkey) {
		System.out.println("getting url key:  " + URLkey);
		String url = PropertiesProvider.getProperty(URLkey);
		System.out.println("getting " + url);
		driver.get(PropertiesProvider.getProperty(URLkey));
		System.out.println("navigated!");
	}

	public void input(String identifier, String data) {
		By by = getBy(identifier);
		if (by != null) {
			try {
				driver.findElement(by).sendKeys(data);
			} catch (NoSuchElementException e) {
				System.out.println("Element not found!");
				Assert.fail("Element not found: " + identifier);
			}
		}
	}

	public By getBy(String identifierKey) {
		if (identifierKey == null) {
			return null;
		}
		By by = null;

		String identifierValue = PropertiesProvider.getProperty(identifierKey);
		if (identifierValue == null) {
			// identifier not present in the properties file
			by = By.xpath(identifierKey);
		} else {
			if (identifierKey.endsWith("_xpath")) {
				by = By.xpath(identifierValue);
			} else if (identifierKey.endsWith("_id")) {
				by = By.id(identifierValue);
			} else if (identifierKey.endsWith("_name")) {
				by = By.name(identifierValue);
			}
		}
		return by;
	}

	public boolean verifyTitle(String expectedTitleKey) {
		String expectedTitle = PropertiesProvider.getProperty(expectedTitleKey);
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isElementPresent(String identifier) {
		By by = getBy(identifier);
		int size = 0;
		if (by != null) {
			try {
				size = driver.findElements(by).size();
				System.out.println("Identifier: " + identifier + ", SIZE: " + size);
			} catch (NoSuchElementException e) {
				System.out.println("Element not found!");
				Assert.fail("Element not found: " + identifier);
			}
		}

		if (size > 0) {
			return true;
		} else {
			return false;
		}
	}

	// *******************APP SPECIFIC FUNCTIONS**************************

	public boolean doLogin(String browser, String userName, String password) throws InterruptedException,
			MalformedURLException {
		openBrowser(browser);
		System.out.println("browser opened");
		navigate("testSiteUrl");
		System.out.println("navugated to the site");
		boolean isElementPresentResult = isElementPresent("moneyLink_xpath");
		Assert.assertTrue(isElementPresentResult, "Element not found! - moneyLink_xpath");
		click("moneyLink_xpath");
		System.out.println("Mpney link clicked");
		click("myPortfolio_xpath");
		System.out.println("Portfolio link clicked");
		boolean result = verifyTitle("portfoliopage");
		Assert.assertTrue(result, "Titles do not match got title as " + driver.getTitle());

		input("loginUsername_xpath", userName);
		Thread.sleep(1500);
		click("continueLogin_xpath");
		// WebDriverWait wait = new WebDriverWait(driver, 15);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)))

		Thread.sleep(1500);
		boolean isLoginSuccessful = false;
		if (isElementPresent("loginPassword_xpath")) {
			input("loginPassword_xpath", password);
			Thread.sleep(1500);
			try{
			driver.findElement(By.xpath("//*[@id='rememberflag']")).click();
			}catch(NoSuchElementException e){
				System.out.println("Element not found!");
				Assert.fail("Element not found: ");
			}
			click("loginButton_xpath");
			System.out.println("Checking Sign Out Link");
			isLoginSuccessful = isElementPresent("signOutLink_xpath");
		} else {
			isLoginSuccessful = false;
		}
		return isLoginSuccessful;
	}

	public String getText(String identifier) {
		By by = getBy(identifier);
		if (by != null) {
			String text = driver.findElement(by).getText();
			return text;
		} else
			APPLICATION_LOG.info("In getText funtion, but By object was out to be null ");
		return null;
	}

	public void quit() {
		if (driver != null) {
			System.out.println("Closing the browser!");
			driver.quit();
			driver = null;
		}
	}
}
