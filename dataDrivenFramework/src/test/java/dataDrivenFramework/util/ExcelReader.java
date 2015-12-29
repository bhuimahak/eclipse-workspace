package dataDrivenFramework.util;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	private Workbook wb = null;
	private Sheet sh = null;

	public ExcelReader(String path, String sheetName) throws EncryptedDocumentException, InvalidFormatException,
			IOException {
		wb = WorkbookFactory.create(new File(path));
		sh = wb.getSheet(sheetName);
	}

	public ExcelReader(String path, int sheetNo) throws EncryptedDocumentException, InvalidFormatException, IOException {
		wb = WorkbookFactory.create(new File(path));
		sh = wb.getSheetAt(sheetNo);
	}

	public ExcelReader(String path) throws EncryptedDocumentException, InvalidFormatException, IOException {
		wb = WorkbookFactory.create(new File(path));
		sh = wb.getSheetAt(0);
	}

	// to get the col name given col number and colHeaderRowNum
	public String getColName(int colHeaderRowNo, int colNo) {
		Row r = sh.getRow(colHeaderRowNo);
		Cell c = r.getCell(colNo);
		if (c == null) {
			return null;
		} else {
			return c.getStringCellValue();
		}
	}

	// to get the count of the test data rows
	public int totalDataRows(String testName) {
		int count = 0;
		int testCaserowNo = getRowIndex(testName);
		int rowNo = testCaserowNo + 2;
		Row r = sh.getRow(rowNo);
		while (r != null && r.getCell(0) != null) {
			count++;
			rowNo++;
			r = sh.getRow(rowNo);
		}
		return count;
	}

	// to get number of data columns
	public int totalDataCols(int colHeaderRow) {
		Row r = sh.getRow(colHeaderRow);
		int col_Start = r.getFirstCellNum();
		int col_end = r.getLastCellNum();
		return col_end - col_Start;
	}

	// to get row no
	public int getRowIndex(String rowName) {
		int rowStart = sh.getFirstRowNum();
		int rowEnd = sh.getLastRowNum();
		int rowIndex = -1;
		// to find row
		for (int i = rowStart; i <= rowEnd; i++) {
			Row r = sh.getRow(i);
			if (r == null) {
				continue;
			}
			int firstCellIndexOfEachRow = r.getFirstCellNum();
			Cell firstCellOfEachRow = r.getCell(firstCellIndexOfEachRow);
			if (rowName.equalsIgnoreCase(firstCellOfEachRow.getStringCellValue())) {
				System.out.println("Row name found! " + firstCellOfEachRow.getStringCellValue());
				rowIndex = firstCellOfEachRow.getRowIndex();
				break;
			}
		}
		return rowIndex;
	}

	// to get col no
	public int getColIndex(int headerRowNo, String colName) {
		int colINdex = -1;
		Row headerRow = sh.getRow(headerRowNo);
		int firstCell = headerRow.getFirstCellNum();
		int lastCell = headerRow.getLastCellNum();
		// System.out.println("First cell is: "+firstCell);
//		System.out.println("Last cell is: " + lastCell);
		for (int j = firstCell + 1; j < lastCell; j++) {
			Cell col = headerRow.getCell(j);
			if (colName.equalsIgnoreCase(col.getStringCellValue())) {
				System.out.println("Column name found! " + col.getStringCellValue());
				colINdex = col.getColumnIndex();
			}
		}
		return colINdex;
	}

	public String getValue(String rowName, String colName) {
		int rowStart = sh.getFirstRowNum();
		// to find row no
		int rowIndex = getRowIndex(rowName);
		int colINdex = getColIndex(rowStart, colName);

		if (rowIndex == -1 || colINdex == -1) {
			System.out.println("Data not found!");
			return null;

		} else {
			Row resultRow = sh.getRow(rowIndex);
			Cell resultCol = resultRow.getCell(colINdex);
			return resultCol.getStringCellValue();
		}
	}

	// getting cellData given rownumber and col name:
	public String getValue(int rowNo, String colName) {
		if (rowNo < sh.getFirstRowNum() || rowNo > sh.getLastRowNum()) {
			System.out.println("Row not in range.");
			return null;
		}

		int firstRowNum = sh.getFirstRowNum();
		Row r = sh.getRow(firstRowNum);

		Iterator<Cell> columns = r.cellIterator();
		int colNo = -1;
		while (columns.hasNext()) {
			Cell c = columns.next();
			String cname = c.getStringCellValue();
			if ((cname != null) && cname.equalsIgnoreCase(colName)) {
//				System.out.println("col found");
				colNo = c.getColumnIndex();
				break;
			}
		}

		String value = null;
		if (colNo != -1) {
			Row userRow = sh.getRow(rowNo);
			Cell val = userRow.getCell(colNo);
			value = val.getStringCellValue();
		} else {
			System.out.println("col not found");
		}
		return value;
	}

	// get rowCount
	public int getRowCount() {
		int startRow = sh.getFirstRowNum();
		int endRow = sh.getLastRowNum();
		return (endRow - startRow) + 1;
	}

	// getColCount
	public int getColCount(int rowNo) {
		Row r = sh.getRow(rowNo);
		short cStart = r.getFirstCellNum();
		short cEnd = r.getLastCellNum();
		return cEnd - cStart;
	}

	// get Sheet data without using iterator
	public void getSheetData() {
		int rowStart = sh.getFirstRowNum();
		// System.out.println("row start: "+rowStart);
		int rowEnd = sh.getLastRowNum();
		// System.out.println("row end: " +rowEnd);
		for (int i = rowStart; i <= rowEnd; i++) {
			Row r = sh.getRow(i);
			short cellStart = r.getFirstCellNum();
			// System.out.println("Cell start: "+cellStart);
			short cellEnd = r.getLastCellNum();
			// System.out.println("Cell End: "+cellEnd);
			for (int j = cellStart; j < cellEnd; j++) {
				Cell cell = r.getCell(j);
				System.out.print(cell.getStringCellValue() + " --");
			}
			System.out.println(" ");
		}
	}

	// get cell data given row no and col no
	public String getCellData(int rowno, int colno) {
		if (rowno < sh.getFirstRowNum() || rowno > sh.getLastRowNum()) {
			System.out.println("Row not in range.");
			return null;
		}

		Row r = sh.getRow(rowno);
		if (colno < r.getFirstCellNum() || colno > r.getLastCellNum()) {
			System.out.println("Col not in range.");
			return null;
		}
		Cell c = r.getCell(colno);
		if (c == null) {
			return "";
		} else
			return c.getStringCellValue();
	}

	// get all data using iterator
	public void getAllData() {
		try {
			Iterator<Row> itRow = sh.iterator();
			while (itRow.hasNext()) {
				Row r = itRow.next();
				Iterator<Cell> itCell = r.iterator();
				while (itCell.hasNext()) {
					Cell c = itCell.next();

					switch (c.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						System.out.print(c.getStringCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(c.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(c.getBooleanCellValue());
						break;
					}
					System.out.print("--");
				}
				System.out.println("");
			}
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} finally {
			if (wb != null) {
				try {
					wb.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
