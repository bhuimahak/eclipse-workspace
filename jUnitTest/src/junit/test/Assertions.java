package junit.test;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

@SuppressWarnings("deprecation")
public class Assertions {

	@Rule
	public ErrorCollector errCollect = new ErrorCollector();

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		String actual = "A";
		String expected = "B";
		System.out.println("Before Assert statement");

		try {
			Assert.assertEquals(expected, actual);
		} catch (Throwable t) {
			System.out.println("ERROR FOUND");

			errCollect.addError(t);
		}

		System.out.println("After Assert statement");
		try {
			Assert.assertTrue(expected.equals(actual));
		} catch (Throwable t) {
			System.out.println("ERROR FOUND");
			errCollect.addError(t);
		}
	}

}
