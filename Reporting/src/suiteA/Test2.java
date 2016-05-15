package suiteA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void test2(){
		System.out.println("In test 2");
	Assert.assertEquals("A", "B");	
	}
}
