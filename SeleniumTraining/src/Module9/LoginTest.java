package Module9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority = 1, dataProviderClass = Data_Provider.class, dataProvider = "loginData")
	public void loginTest(String userName, String password) {
		System.out.println("*********");
		System.out.println("username: " + userName + " and Password :" + password);
		try {
			Assert.assertEquals("A", "B");
		} catch (Throwable t) {
			// code to report Error
			ErrorUtil.addVerificationFailure(t);
		}
		
		try {
			Assert.assertEquals("P", "Q");
		} catch (Throwable t) {
			// code to report Error
			ErrorUtil.addVerificationFailure(t);
		}
		System.out.println("*********");
	}

//	@Test(priority = 2, dataProviderClass = Data_Provider.class, dataProvider = "loginData")
//	public void emailTest(String userName, String password, String email) {
//		System.out.println("username: " + userName + " and Password :" + password + " and email" + email);
//		Assert.assertEquals("A", "B");
//	}

}
