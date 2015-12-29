package Module9;

import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.internal.Utils;

public class Reporter_listener extends TestListenerAdapter implements IInvokedMethodListener {

	public void onTestFailure(ITestResult tr) {
		// Invoked each time a test fails.
		System.out.println("Test failed: " + tr.getName());
		// take screenshot
	}

	public void onTestSkipped(ITestResult tr) {
		// Invoked each time a test is skipped.
		System.out.println("This test Skipped: " + tr.getName());
	}

	public void onTestSuccess(ITestResult tr) {
		// Invoked each time a test succeeds.
		System.out.println("Test is successfull: " + tr.getName());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult result) {
		System.out.print("AfterInvocation: " + method.getTestMethod().getMethodName());
		System.out.println(", Result: " + result.getName());
		//Reporter.setCurrentTestResult(result);

		if (method.isTestMethod()) {
			List<Throwable> verificationFailures = ErrorUtil.getVerificationFailures();
			System.out.println("verificationFailures: "  + verificationFailures.size());
			// if there are verification failures...
			int size = verificationFailures.size();
			if (size != 0) {
				// set the test to failed
				result.setStatus(ITestResult.FAILURE);

				// if there is an assertion failure add it to
				// verificationFailures
//				if (result.getThrowable() != null) {
//					System.out.println("Throwable: " + result.getThrowable().toString());
//					verificationFailures.add(result.getThrowable());
//				}

				
				// if there's only one failure just set that
				if (size == 1) {
					result.setThrowable(verificationFailures.get(0));
				} else {
					// create a failure message with all failures and stack
					// traces (except last failure)
					StringBuffer failureMessage = new StringBuffer("Multiple failures (").append(size).append("):\n");
					for (int i = 0; i < size; i++) {
						failureMessage.append("Failure ").append(i + 1).append(" of ").append(size).append(":\n");
						Throwable t = verificationFailures.get(i);
						String fullStackTrace = Utils.stackTrace(t, false)[1];
						failureMessage.append(fullStackTrace);
					}

					// final failure
//					Throwable last = verificationFailures.get(size - 1);
//					failureMessage.append("Failure ").append(size).append(" of ").append(size).append(":\n");
//					failureMessage.append(last.toString());

					// set merged throwable
					Throwable merged = new Throwable(failureMessage.toString());
//					merged.setStackTrace(last.getStackTrace());

					result.setThrowable(merged);
				}
			}
		}
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
	}
}
