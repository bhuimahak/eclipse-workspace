package junit.test;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstTestCase {
	
	private static final Logger log = Logger.getLogger(FirstTestCase.class);

	@BeforeClass
	public static void openBrowser() {
		log.info("**TestCase1 started--Opening the browser**");
	}

	@Test
	public void loginTest() {
		log.info("Logging in the user");
	}

	@Test
	public void checkEmail() {
		log.info("Checking email");
	}

	@AfterClass
	public static void closeBrowser() {
		log.info("**TestCase1 ending--Closing the browser**");
	}

}
