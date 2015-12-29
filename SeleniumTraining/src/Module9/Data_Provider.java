package Module9;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider {

	// creating data provider for multiple test cases

	@DataProvider(name = "registerTestDataProvider")
	public static Object[][] registerData() {

		Object[][] data = new Object[3][4];

		data[0][0] = "user1";
		data[0][1] = "pass1";
		data[0][2] = "city1";
		data[0][3] = "pincode1";

		data[1][0] = "user2";
		data[1][1] = "pass2";
		data[1][2] = "city2";
		data[1][3] = "pincode2";

		data[2][0] = "user3";
		data[2][1] = "pass3";
		data[2][2] = "city3";
		data[2][3] = "pincode3";

		return data;
	}

	@DataProvider(name = "loginData")
	public static Object[][] loginData(Method m) {
		Object[][] data= null;

		if (m.getName().equals("loginTest")) {
			data = new Object[3][2];

			data[0][0] = "user1";
			data[0][1] = "pass1";

			data[1][0] = "user2";
			data[1][1] = "pass2";

			data[2][0] = "user3";
			data[2][1] = "pass3";
			

		} else if (m.getName().equals("EmailTest")) {
			data = new Object[2][3];

			data[0][0] = "user22";
			data[0][1] = "pass21";
			data[0][2] = "mahak.bhui@gmail.com";

			data[1][0] = "user34";
			data[1][1] = "pass45";
			data[1][2] = "arslan.qadri@gmail.com";
		}
		return data;
	}

}
