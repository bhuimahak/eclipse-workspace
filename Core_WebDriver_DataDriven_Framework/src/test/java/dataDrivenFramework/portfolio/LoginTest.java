package dataDrivenFramework.portfolio;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import dataDrivenFramework.dataDriven.TestBase;
import dataDrivenFramework.util.Constants;
import dataDrivenFramework.util.TestDataProvider;

public class LoginTest extends TestBase {
	private Logger log = Logger.getLogger(LoginTest.class);

	// Accepts one parameter which has all thecols and valuescorresponding to it

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "PortfolioDataProvider")
	public void loginTest(HashMap<String, String> map) throws InterruptedException, MalformedURLException {
		try {
			log.debug("Executing test1");
			String runMode = map.get(Constants.RUNMODE_COL);
			// System.out.println("Runmode is" + runMode);
			validateRunmodes("loginTest", Constants.PORTFOLIO_SUITE, runMode);

			String browser = map.get(Constants.BROWSER_COL);
			String userName = map.get(Constants.USERNAME_COL);
			String password = map.get(Constants.PASSWORD_COL);
			String expectedResult = map.get(Constants.EXPECTEDRESULT_COL);

			// try to log in
			boolean isLoginSuccessFul = doLogin(browser, userName, password);

			System.out.println("isLoginSuccessFul :" + isLoginSuccessFul);
			if (expectedResult.equals("SUCCESS")) {
				if (!isLoginSuccessFul) {

					Assert.fail("Was not able to login with correct credentials");
				} else {
					System.out.println("test case passed : login successful");
				}
			} else if (expectedResult.equals("FAILURE")) {
				if (isLoginSuccessFul) {
					Assert.fail("Was able to login with even wrong credentials");
				} else {
					System.out.println("test case passed : login failed");
				}
			}
			Thread.sleep(1000);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void close() {
		quit();
	}
}
