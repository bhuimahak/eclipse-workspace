package module8_jUnit;

import org.junit.Ignore;
import org.junit.Test;

public class firstTestCase {
	
	@Test
	public void loginTest(){
		System.out.println("loggin in the user");
	}
	
	@Ignore
	@Test
	public void registerTest(){
		System.out.println("Registering the user");
	}
	
	@Test
	public void databaseTest(){
		System.out.println("Testing the database");
	}
}
