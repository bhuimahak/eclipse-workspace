package dataDrivenFramework.dataDriven;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.SkipException;
import dataDrivenFramework.util.Constants;
import dataDrivenFramework.util.ExcelReader;
import dataDrivenFramework.util.PropertiesProvider;
import dataDrivenFramework.util.Utility;

public class TestBase {

	protected Logger APPLICATION_LOG = Logger.getLogger(TestBase.class);

	public void validateRunmodes(String testName, String suiteName, String dataRunmode) {
		try {
			APPLICATION_LOG.debug("Validating runmode for testName: " + testName + "and suiteName: " + suiteName);
			boolean isSuiteRunnable = Utility.isSuiteRunnable(suiteName,
					new ExcelReader(PropertiesProvider.getProperty("xlsFileLocation") + "Suite.xlsx",
							Constants.SUITE_SHEET));
			if (isSuiteRunnable == false) {
				String message = "Skipping the test " + testName + " inside the suite " + suiteName
						+ ". Reason: Suite NOT runnable.";
				APPLICATION_LOG.debug(message);
				throw new SkipException(message);
			}
			boolean isTestCaseRunnable = Utility.isTestCaseRunnable(testName,
					new ExcelReader(PropertiesProvider.getProperty("xlsFileLocation") + suiteName + ".xlsx",
							Constants.TESTCASES_SHEET));

			if (isTestCaseRunnable == false) {
				String message = "Skipping the test " + testName + " inside the suite " + suiteName
						+ ". Reason: Test case NOT runnable.";
				APPLICATION_LOG.debug(message);
				throw new SkipException(message);
			}
			if (!dataRunmode.equals(Constants.RUNMODE_YES)) {
				String message = "Skipping the test " + testName + "inside the suite " + suiteName
						+ ". Reason: Test input NOT runnable.";
				APPLICATION_LOG.debug(message);
				throw new SkipException(message);
			}
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
