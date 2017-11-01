import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterizedTestCase {
	
	//list of parametres required
	public String username;
	public String password;
	public int pin;
	 
    //constructor to set the params
	public ParameterizedTestCase(String username, String password, int pin){
		this.username = username;
		this.password = password;
		this.pin = pin;	
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		 Object[][] data = new Object[2][3];
		 data[0][0] = "username1";
		 data[0][1] = "password1";
		 data[0][2] = 123;
		 data[1][0] = "username2";
		 data[1][1] = "password2";
		 data[1][2] = 234;
		 return Arrays.asList(data);		
	}
	
	@Test
	public void testRegister(){
		System.out.println("---"+ username + "---"+ password + "----" + pin);
	}
}
