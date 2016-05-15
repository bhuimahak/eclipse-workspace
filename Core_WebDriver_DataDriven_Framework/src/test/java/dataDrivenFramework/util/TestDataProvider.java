package dataDrivenFramework.util;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name = "PortfolioDataProvider", parallel = true)
	public static Object[][] getDataSuiteA(Method m) {
		ExcelReader reader = null;
		try {
			reader = new ExcelReader(PropertiesProvider.getProperty("xlsFileLocation") + "\\" + Constants.PORTFOLIO_SUITE
					+ ".xlsx", "Data"); //Data is the sheetName
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
		return Utility.getData(m.getName(), reader);  //this will return an object array

	}

	@DataProvider(name = "suiteBDataProvider")
	public static Object[][] getDataSuiteB(Method m) {
		ExcelReader reader = null;
		try {
			reader = new ExcelReader(PropertiesProvider.getProperty("xlsFileLocation") + "\\" + Constants.STOCK_SUITE
					+ ".xlsx", "Data");
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
		return Utility.getData(m.getName(), reader);

	}
}