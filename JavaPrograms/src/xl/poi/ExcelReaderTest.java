package xl.poi;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ExcelReaderTest {
	
	public static void main(String[] args) {
		try {
			ExcelReader reader = new ExcelReader("resources\\ExcelReader2.xls",0);
			// reader.getAllData();
			// System.out.println("*******************");
			// System.out.println(reader.getCellData(0, 0));
//			reader.getSheetData();
			System.out.println("Row count: " + reader.getRowCount());
			System.out.println("Column count: " + reader.getColCount(0));
			//System.out.println(reader.getValue(5, "password"));
			System.out.println(reader.getValue("Nexus 5", "0"));
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
