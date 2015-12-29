package roughwork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import dataDrivenFramework.util.ExcelReader;

public class ReadingData {

	public static void main(String[] args) {
		try {
			ExcelReader reader = new ExcelReader("src\\test\\resources\\SuiteA.xlsx", "Data");
			String testName = "Test3";
			int rowNo = reader.getRowIndex(testName);
			System.out.println("Test case row number is: "+ rowNo);
			
			
			
			
			
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
