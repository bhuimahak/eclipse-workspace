package module8_jUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class secondTestCase {
	
	public static boolean checkLogin(){
		return true;
		//true - success
	}
	
	@BeforeClass
	public static void beginning(){
		System.out.println("*******Beginning********");
		Assume.assumeTrue(checkLogin());
	}
	
	@AfterClass
	public static void ending(){
		System.out.println("*******ending**********");
	}
	
	@Before
	public void openBrowser(){
		System.out.println("opening browser");
	}
	
	@After
	public void closeBrowser(){
		System.out.println("closing browser");
	}
	
	@Test
	public void sendEmailTest(){
		System.out.println("Sending email");
		}
	
	@Test
	public void sendMessageTest(){
		System.out.println("Sending message");
	}
	

}
