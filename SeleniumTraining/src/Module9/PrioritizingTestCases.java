package Module9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrioritizingTestCases {
	
	@Test(priority = 1)
	public void loginTest(){
		Assert.assertEquals("A", "A");
		System.out.println("in login test");
	}
	
	@Test(priority = 2,dependsOnMethods={"loginTest"})
	public void changePassword(){
		System.out.println("in change password test");
	}
	
	@Test(priority = 3, dependsOnMethods ={"loginTest","changePassword"})
	public void logoutTest(){
		System.out.println("in logout test");
	}

}
