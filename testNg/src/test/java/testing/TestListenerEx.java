package testing;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListenerEx implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestListener: Test starting");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestListener: Test Succefull");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestListener: Test Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestListener: Test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TestListener: onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("TestListener: on start method");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("TestListener: on finish method");
	}
}
