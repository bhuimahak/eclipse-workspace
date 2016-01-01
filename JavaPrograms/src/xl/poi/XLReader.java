package xl.poi;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLReader {

	public static void main(String[] args) {
		Workbook workbook = null;
		try {
			File file = new File("resources\\readXl.xls");

			// Get the workbook instance for XLS file
			workbook = WorkbookFactory.create(file);

			// Get first sheet from the workbook
			Sheet sheet = workbook.getSheetAt(0);

			// Get iterator to all the rows in current sheet
//			Iterator<Row> rowIterator = sheet.iterator();
//			while (rowIterator.hasNext()) {
//				Row row = rowIterator.next();
			for(Row row : sheet) {

				// Get iterator to all cells of current row
//				Iterator<Cell> cellIterator = row.cellIterator();
//
//				while (cellIterator.hasNext()) {
//					Cell cell = cellIterator.next();
				for(Cell cell : row) {
					switch (cell.getCellType()) {
						case Cell.CELL_TYPE_BOOLEAN:
							System.out.print(cell.getBooleanCellValue() + "\t\t");
							break;
						case Cell.CELL_TYPE_NUMERIC:
							System.out.print(cell.getNumericCellValue() + "\t\t");
							break;
						case Cell.CELL_TYPE_STRING:
							System.out.print(cell.getStringCellValue() + "\t\t");
							break;
					}
				}
				System.out.println("");
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
