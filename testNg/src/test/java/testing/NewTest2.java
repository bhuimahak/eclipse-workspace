package testing;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest-in second test case -NewTest2 class");
		System.out.println("skippin this");
		throw new SkipException("Skipping this test because of some reason");
	}

	@Test
	public void testMethod() {
		System.out.println("in second test case -NewTest2 class");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass- in before class of Newtest2");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass- in after class of Newtest2");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest-in second test case -NewTest2 class");
	}

}
