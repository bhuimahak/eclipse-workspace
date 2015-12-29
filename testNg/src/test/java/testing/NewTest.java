package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class NewTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite-initalilzing sel webdriver object");
	}
	
	@BeforeTest
	public void connect() {
		System.out.println("@BeforeTest-connecting to db..");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("@BeforeClass-In BeforeClass Method");
	}

	@Test
	public void testSendEmail() {
		System.out.println("TEST-email sending testing");
	}

	@Test(enabled = false)
	public void testReceiveEmail() {
		System.out.println("TEST-email receiving testing");
	}

	@BeforeMethod
	public void openingBrowser() {
		System.out.println(" @BeforeMethod-opening browser");

	}

	@AfterMethod
	public void closingBrowser() {
		System.out.println("@AfterMethod-closing browser");
	}

	@AfterClass
	public void afterClass(){
		System.out.println("In After class method");
	}
	
	@AfterTest
	public void endingConnection() {
		System.out.println("@After Test-closing connection to db..");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite-destroying sel webdriver object");
	}

}
