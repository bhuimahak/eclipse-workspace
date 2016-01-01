package xl.poi;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLReaderSpecificColumns {

	public static void main(String[] args) {
		Workbook workbook = null;
		try {
			File file = new File("resources\\readXl.xls");

			// Get the workbook instance for XLS file
			workbook = WorkbookFactory.create(file);

			// Get first sheet from the workbook
			Sheet sheet = workbook.getSheetAt(0);

			// Get iterator to all the rows in current sheet
			for(int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				String userName = row.getCell(0).getStringCellValue();
				String password = row.getCell(1).getStringCellValue();
				
				System.out.println("userName: " + userName + ", password: " + password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (workbook != null) {
				try {
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
