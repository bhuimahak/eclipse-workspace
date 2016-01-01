package junit.test;

import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SecondTestCase {
	
	
	public static boolean checkLogin(){
		return true;
	}
	
	@BeforeClass
	public static void begin(){
		Assume.assumeTrue(checkLogin());
		System.out.println("Beginning of second test case");
	}
	
	
	@Test
	public void registerTest(){
		System.out.println("Registering the user");
	}
	
	@Ignore
	@Test
	public void loginTest(){
		System.out.println("Testing logging in functionality after registration");
	}
	
	@Test
	public void logoutTest(){
		System.out.println("Testing Logging out functionality");
	}
	
	@AfterClass
	public static void ending(){
		System.out.println("Ending");
	}

}
