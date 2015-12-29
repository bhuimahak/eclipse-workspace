package dataDrivenFramework.suiteB;

import java.util.HashMap;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import dataDrivenFramework.dataDriven.TestBase;
import dataDrivenFramework.util.Constants;
import dataDrivenFramework.util.TestDataProvider;

public class Test1 extends TestBase {

	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "suiteBDataProvider")
	public void test1(HashMap<String, String> map) {
		try {
			// ExcelReader reader = new
			// ExcelReader("src\\test\\resources\\Suite.xlsx",
			// Constants.SUITE_SHEET);
			// boolean suiteRunnable = Utility.isSuiteRunnable("SuiteA",
			// reader);
			// System.out.println("suiteRunnable" + "********* " +
			// Utility.isSuiteRunnable("SuiteA", reader));
			//
			// ExcelReader reader1 = new
			// ExcelReader("src\\test\\resources\\SuiteA.xlsx",
			// Constants.TESTCASES_SHEET);
			// boolean testcaseRunnable = Utility.isTestCaseRunnable("Test1",
			// reader1);
			// System.out.println("testcaseRunnable: " + "****************" +
			// testcaseRunnable);

			String runMode = map.get("Runmode");
			validateRunmodes("Test1", Constants.SECOND_SUITE, runMode);

			// System.out.println("Data is: " + map);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
