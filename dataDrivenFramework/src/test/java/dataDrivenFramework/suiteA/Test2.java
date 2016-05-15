package dataDrivenFramework.suiteA;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import dataDrivenFramework.dataDriven.TestBase;
import dataDrivenFramework.util.Constants;
import dataDrivenFramework.util.ExcelReader;
import dataDrivenFramework.util.TestDataProvider;
import dataDrivenFramework.util.Utility;

public class Test2 extends TestBase {
//	@BeforeSuite
//	public void beforeSuite() throws EncryptedDocumentException, InvalidFormatException, IOException {
//		ExcelReader reader = new ExcelReader("src\\test\\resources\\Suite.xlsx", Constants.SUITE_SHEET);
//		boolean isSuiteRunnable = Utility.isSuiteRunnable(Constants.FIRST_SUITE, reader);
//		if (!isSuiteRunnable) {
//			throw new SkipException("Suite is not Runnable");
//		}
//	}
//
//	@BeforeClass
//	public void beforeClass() throws EncryptedDocumentException, InvalidFormatException, IOException {
//		boolean isTestCaseRunnable = Utility.isTestCaseRunnable("Test2", new ExcelReader(
//				"src\\test\\resources\\SuiteA.xlsx", Constants.TESTCASES_SHEET));
//		if (isTestCaseRunnable == false) {
//			String message = "Before Class method-Skipping the test Test2 inside the suite A. Reason: Test Class NOT runnable.";
//			APPLICATION_LOG.debug(message);
//			throw new SkipException(message);
//		}
//	}

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "suiteADataProvider")
	public void test2(HashMap<String, String> map) {
		APPLICATION_LOG.debug("Executing Test2");
		String runmode = map.get(Constants.RUNMODE_COL);
		validateRunmodes("Test2", Constants.FIRST_SUITE, runmode);
	}
}
