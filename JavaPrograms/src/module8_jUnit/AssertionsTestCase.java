package module8_jUnit;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

@SuppressWarnings("deprecation")
public class AssertionsTestCase {
	
	@Rule
	public ErrorCollector errCollector = new ErrorCollector();
	
	@Test
	public void testFriendListFaccebook(){
		int actual_total_friends = 100; //from selenium code
		int expected_total_friends = 10; //from xl
		System.out.println("Before Assert");
		
		try{
		Assert.assertEquals(expected_total_friends,actual_total_friends);
		}catch(Throwable t){
			System.out.println("ERROR ENCOUNTERED");
			errCollector.addError(t);;
		}
		System.out.println("After Assert");
		
		try{
			Assert.assertEquals("A","B");
			}catch(Throwable t){
				System.out.println("ERROR ENCOUNTERED");
				errCollector.addError(t);;
			}
		// Assert.assertTrue("error", 2>4);
	
	}
	

}
