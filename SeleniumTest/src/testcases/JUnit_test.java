package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnit_test {

	@Before
	public void setUp() throws Exception {
		System.out.println("I am in setup method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("I am in tear down method");
	}

	@Test
	public void testSum() {
		
		assertEquals(4,2+2);
	}
	
	@Test
	public void testMultiply() {
		
		assertEquals(5,2+3);
	}
	
	@Test
	public void testSummOfOtherClass(){
	ClassUnderTest obj = new ClassUnderTest();
	assertEquals(3,obj.sum(1, 2));
	}
	
	@Test
	public void testMulti(){
	ClassUnderTest obj1 = new ClassUnderTest();	
	assertEquals(8,obj1.multiply(2,4));
	}
	
}
	
	


