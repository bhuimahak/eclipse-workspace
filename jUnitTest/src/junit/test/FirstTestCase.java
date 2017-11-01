package junit.test;

import java.util.logging.LogManager;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstTestCase {
	
	private static final java.util.logging.Logger log = LogManager.getLogManager()g);

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
