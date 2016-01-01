package module8_jUnit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//step1
@RunWith(Parameterized.class)
public class ParameterizedTestCase {
	// step2
	String username;
	String password;
	int pin;

	// step 3
	public ParameterizedTestCase(String username, String password, int pin) {
		this.username = username;
		this.password = password;
		this.pin = pin;
	}

	// step 4

	@Parameters
	public static List<Object[]> getData() {
		List<Object[]> list = new ArrayList<>();
		Object[] ob1 = {"testuser1", "Pass1", 345};
		list.add(ob1);

		Object[] ob2 = {"testuser2", "Pass2", 445};
		list.add(ob2);
		
		return list;

		// no of rows - no of times you want to repeat the test
		// no of cols - no of parameters you want to pass
		
//		Object[][] data = new Object[2][3];
//
//		// 2nd set of test data
//		data[0][0] = "testuser1";
//		data[0][1] = "Pass1";
//		data[0][2] = 345;
//
//		// 2nd set of test data
//		data[1][0] = "testuser2";
//		data[1][1] = "Pass2";
//		data[1][2] = 445;
//
//		return Arrays.asList(data);
	}

	@Test
	public void testregister() {
		System.out.println("testing registration--" + username + "--" + password + "--" + pin);
	}
}
