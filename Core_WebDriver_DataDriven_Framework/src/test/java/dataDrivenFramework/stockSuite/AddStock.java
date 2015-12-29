package dataDrivenFramework.stockSuite;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.testng.annotations.Test;

import dataDrivenFramework.dataDriven.TestBase;
import dataDrivenFramework.util.Constants;

public class AddStock extends TestBase {
	@Test
	public void addStock(HashMap<String, String> map) throws InterruptedException, MalformedURLException {
	
			APPLICATION_LOG.debug("Executing test1");
			System.out.println("Executing Add stock test");
			String runMode = map.get(Constants.RUNMODE_COL);
			// System.out.println("Runmode is" + runMode);
			validateRunmodes("addStock", Constants.STOCK_SUITE, runMode);

	}

}
