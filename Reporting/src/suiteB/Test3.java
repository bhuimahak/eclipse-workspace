package suiteB;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void test3(){
		System.out.println("In test 3");
	throw new SkipException("skipping the test due to N runmode");	
	}
}
