import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class Junit {
	
	@BeforeClass // this has to be static
	public static void beforeClass(){
		System.out.println("run before all the tests");
		Assume.assumeTrue(openBrowser());
	}
	
	public static boolean openBrowser(){
		return false;
	}
	
	@Test
	public void signInTest(){
		System.out.println("in sign in method");
	}
	
	//@Ignore
	@Test
	public void registerTest(){
		System.out.println("in register method");
	}
	
	@AfterClass
	public static void afterMethod(){
		System.out.println("run after all test methods");
	}
	
	
	

}
