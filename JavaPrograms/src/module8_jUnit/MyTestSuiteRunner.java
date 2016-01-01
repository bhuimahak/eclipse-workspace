package module8_jUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

	
@RunWith(Suite.class)
@SuiteClasses({
		AssertionsTestCase.class,
		firstTestCase.class,
		secondTestCase.class
	})
public class MyTestSuiteRunner {
	}
	
