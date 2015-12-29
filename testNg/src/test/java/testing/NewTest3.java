package testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest3 {

	@Test(dataProvider = "data")
	public void testRegister(String username, String password, String city) {

		System.out.println("username, password and city is : " + username + " " + password + " " + city);

	}

	@DataProvider(name = "data")
	public Object[][] getData() {
		Object[][] data = { { "Mehak", "Pass1", "Hyd" }, { "Arslan", "Pass2", "Del" } };

		// Object[] data1 = { "Mehak", "Pass1", "Hyd" };
		// Object[] data2 = { "Arslan", "Pass2", "Del" };

		// Object[][] data12 = {data1, data2};

		// T[] data11 = { new T(), new T() };

		return data;

	}
	
	@Test
	public void arrayTest(){
		Object[][][] data2 = {{{1,2,3},{3,4,5},{4,5,6}},{{6,7,8},{9,2,1},{1,2,3}}};
		//Object[][][] data3 = new Object[3][][];
		//Object[][] data2 = new Object[4][];
		for(int i =0; i<data2.length ;i++){
			Object[][] data00= data2[i];
			for(int j = 0; j<data00.length; j++){
				Object[] data11 =data00[j];
				for(int k = 0; k<data11.length;k++){
					Object m = data11[k];
					System.out.print(m + "--");
				}
				System.out.println(" ");
			}
			
		}
		
	}

}
