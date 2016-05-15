package listener;

import java.util.HashMap;
import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.internal.Utils;

public class CustomListener extends TestListenerAdapter implements IInvokedMethodListener, ISuiteListener {
	public static HashMap<String, String> resultMap = null;

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
		}
	}

	@Override
	public void onFinish(ISuite suite) {
		if (resultMap != null) {
			System.out.println("Finished the suite: " + suite.getName());
			System.out.println(resultMap);
			resultMap = null;
		}
	}

	public void report(String testName, String result) {
		int iteration_Number = 1;
		while (resultMap.containsKey(testName + "-iteration" + iteration_Number)) {
			iteration_Number++;
		}
		resultMap.put(testName + "-iteration" + iteration_Number, result);
	}
}
