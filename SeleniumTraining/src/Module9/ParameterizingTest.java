package Module9;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizingTest {

	@Test(dataProviderClass=Data_Provider.class, dataProvider = "registerTestDataProvider")
	public void registerTest(String username, String password, String city, String pincode) {
		System.out.println(username + "----" +password +"----" +city+"----" +pincode);

	}

	
}
