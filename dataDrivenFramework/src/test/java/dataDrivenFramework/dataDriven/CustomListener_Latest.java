package dataDrivenFramework.dataDriven;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import dataDrivenFramework.util.Constants;
import dataDrivenFramework.util.ExcelWriter;

public class CustomListener_Latest extends TestListenerAdapter implements IInvokedMethodListener, ISuiteListener {
	public static HashMap<String, String> resultMap = null;
	public static List<String> keys = null;
	public static List<Map<String, String>> listOfMap = null;
	public static String resultFolderName = null;
	public static String resultFilePath = null;

	private static final String TEST_NAME = "Test Name";
	private static final String RESULT = "Result";

	public void onTestFailure(ITestResult tr) {
		// Invoked each time a test fails, reports and logs, can take
		// screenshots
		// System.out.println("Test failed: " + tr.getName());
		report(tr.getName(), tr.getThrowable().getMessage());
	}

	public void onTestSkipped(ITestResult tr) {
		// Invoked each time a test is skipped, reports and logs
		// System.out.println("This test Skipped: " + tr.getName());
		report(tr.getName(), tr.getThrowable().getMessage());
	}

	public void onTestSuccess(ITestResult tr) {
		// Invoked each time a test succeeds, reports and logs
		// System.out.println("Test is successfull: " + tr.getName());
		report(tr.getName(), "PASS");
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult result) {
		// System.out.print("AfterInvocation: " +
		// method.getTestMethod().getMethodName());
		// System.out.println(", Result: " + result.getName());
		// Reporter.setCurrentTestResult(result);

		// if (method.isTestMethod()) {
		// List<Throwable> verificationFailures =
		// ErrorUtil.getVerificationFailures();
		// System.out.println("verificationFailures: " +
		// verificationFailures.size());
		// if there are verification failures...
		// int size = verificationFailures.size();
		// if (size != 0) {
		// set the test to failed
		// result.setStatus(ITestResult.FAILURE);

		// if there is an assertion failure add it to
		// verificationFailures
		// if (result.getThrowable() != null) {
		// System.out.println("Throwable: " + result.getThrowable().toString());
		// verificationFailures.add(result.getThrowable());
		// }

		// if there's only one failure just set that
		// if (size == 1) {
		// result.setThrowable(verificationFailures.get(0));
		// } else {
		// // create a failure message with all failures and stack
		// // traces (except last failure)
		// StringBuffer failureMessage = new
		// StringBuffer("Multiple failures (").append(size).append("):\n");
		// for (int i = 0; i < size; i++) {
		// failureMessage.append("Failure ").append(i +
		// 1).append(" of ").append(size).append(":\n");
		// Throwable t = verificationFailures.get(i);
		// String fullStackTrace = Utils.stackTrace(t, false)[1];
		// failureMessage.append(fullStackTrace);
		// }
		//
		// // final failure
		// // Throwable last = verificationFailures.get(size - 1);
		// //
		// failureMessage.append("Failure ").append(size).append(" of ").append(size).append(":\n");
		// // failureMessage.append(last.toString());
		//
		// // set merged throwable
		// Throwable merged = new Throwable(failureMessage.toString());
		// // merged.setStackTrace(last.getStackTrace());
		//
		// result.setThrowable(merged);
		// }
		// }
		// }
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ISuite suite) {
		// invoked before TestNG starts running the suite, after test class is
		// instantiated and before any config meth is called"
		if (resultMap == null) {
			System.out.println("Starting the suite: " + suite.getName());
			resultMap = new HashMap<String, String>();
			keys = new ArrayList<>();
			listOfMap = new ArrayList<>();

			if (resultFolderName == null) { // only runs for First suite
				Date date = new Date();
				resultFolderName = date.toString().replace(":", "_");
				File f = new File(System.getProperty("user.dir") + "//target//reports//" + resultFolderName);
				f.mkdir();
				resultFilePath = System.getProperty("user.dir") + "//target//reports//" + resultFolderName
						+ "//Report.xlsx";
				File srcFile = new File(System.getProperty("user.dir") + "//target//reports//ReportTemplate.xlsx");
				File destFile = new File(resultFilePath);

				try {
					FileUtils.copyFile(srcFile, destFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void onFinish(ISuite suite) {
		if (resultMap != null) {
			System.out.println("Finished the suite: " + suite.getName());
			System.out.println(resultMap);
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println(listOfMap);
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

			// write results in xls
			try {
				if (!suite.getName().equals(Constants.ROOT_SUITE)) {
					ExcelWriter xl = new ExcelWriter(resultFilePath);
					xl.addSheet(suite.getName(), Arrays.asList(TEST_NAME, RESULT), listOfMap);
					// add the results in the sheet

					// create column names
					for (String key : keys) {
						String value = resultMap.get(key);
						System.out.println(key + "value =" + value);
					}
				}
			} catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (InvalidFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			resultMap = null;
			keys = null;
			listOfMap = null;
		}
	}

	public void report(String testName, String result) {
		int iteration_Number = 1;
		while (resultMap.containsKey(testName + "-iteration" + iteration_Number)) {
			iteration_Number++;
		}
		String key = testName + "-iteration" + iteration_Number;
		resultMap.put(key, result);
		keys.add(key);

		// ////////////////////////////////////////////

		Map<String, String> map = new HashMap<>();
		map.put(TEST_NAME, testName);
		map.put(RESULT, result);
		listOfMap.add(map);
	}
}
