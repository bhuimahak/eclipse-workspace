package junit.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestCase {
	
	private String userName;
	private String password;
	private Integer pin;
	
	public ParameterizedTestCase(String userName, String password, int pin){
		this.userName = userName;
		this.password = password;
		this.pin = pin;
	}
	
	@Parameters
	public static List<Object[]> getData(){
		List<Object[]> list = new ArrayList<>();
		Object[] obj1  ={"user1","pass1",10};
		list.add(obj1);
		Object[] obj2 = {"user2","pass2",20};
		list.add(obj2);
		return list;
	}

	@Test
	public void registerTest(){
		System.out.println("testing registration--" + userName + "--" + password + "--" + pin);
		
	}
}
