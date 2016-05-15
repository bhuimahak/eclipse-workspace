package suiteA;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

	@Test(dataProvider ="getData")
	public void test1(String name, String password){
		System.out.println("In test 1");
		if(name.equals("U1")){
			Assert.fail("First Set Failed");
		}
		
	}
	
	@DataProvider
	public Object[][] getData(){
		Object [][] data = new Object[2][2];
		
		data[0][0] = "U1";
		data[0][1] = "P1";		
		
		data[1][0] = "U2";
		data[1][1] ="P2";
		
		return data;
	}
}
