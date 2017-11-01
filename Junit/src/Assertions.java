import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class Assertions {
	
	@Rule
	public ErrorCollector errCollector = new ErrorCollector();
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSomething(){
		int actual_value = 100; //actual value from an application/API
		int expected_value = 101; //coming from the test data 
		try{
		Assert.assertEquals(expected_value, actual_value);
		}
		catch(Throwable t){
			//Error collector here..java code to report an error!!
			System.out.println("Error encountered!");
			errCollector.addError(t);
		}
		System.out.println("After first assertion");
		try{
			Assert.assertEquals(101, 100);
			}
			catch(Throwable t){
				//Error collector here..java code to report an error!!
				System.out.println("Error encountered!");
				errCollector.addError(t);
			}
	}
}
