package dataDrivenFramework.dataDriven;

import java.util.List;

import org.apache.log4j.Logger;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.internal.Utils;

public class CustomListener extends TestListenerAdapter implements IInvokedMethodListener {
	
	private Logger log = Logger.getLogger(CustomListener.class);

	public void onTestFailure(ITestResult tr) {
		// Invoked each time a test fails.
		log.debug("Failed:- " + tr.getName());
		//System.out.println("Test failed: " + tr.getName());
		// take screenshot
	}

	public void onTestSkipped(ITestResult tr) {
		// Invoked each time a test is skipped.
		log.debug("Skipped:- " + tr.getName());
		//System.out.println("This test Skipped: " + tr.getName());
	}

	public void onTestSuccess(ITestResult tr) {
		// Invoked each time a test succeeds.
		log.debug("Successfull:- " + tr.getName());
		//System.out.println("Test is successfull: " + tr.getName());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult result) {
		
		}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
	}
}
