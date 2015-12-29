package dataDrivenFramework.suiteA;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import dataDrivenFramework.dataDriven.TestBase;
import dataDrivenFramework.util.Constants;
import dataDrivenFramework.util.TestDataProvider;

public class Test1 extends TestBase {
	private Logger log = Logger.getLogger(Test1.class);
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "suiteADataProvider")
	public void test1(HashMap<String, String> map) { //one parameter which has all the cols and values correpondin to it
		try {
			log.debug("Executing test1");
			String runMode = map.get(Constants.RUNMODE_COL);
			System.out.println("Runmode is" +runMode);
			validateRunmodes("Test1", Constants.FIRST_SUITE, runMode);

			// System.out.println("Data is: " + map);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
