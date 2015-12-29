package dataDrivenFramework.util;

import java.util.HashMap;

public class Utility {

	public static boolean isSuiteRunnable(String suiteName, ExcelReader reader) {
		String runmode = reader.getValue(suiteName, Constants.RUNMODE_COL);
//		System.out.println("Is suite runnable? : " + runmode);
		boolean result = false;
		if (Constants.RUNMODE_YES.equals(runmode)) {
			result = true;
		}
		return result;
	}

	public static boolean isTestCaseRunnable(String testCaseName, ExcelReader reader) {
		String runmode = reader.getValue(testCaseName, Constants.RUNMODE_COL);
//		System.out.println("is test case runnable?: " + runmode);
		boolean result = false;
		if (Constants.RUNMODE_YES.equals(runmode)) {
			result = true;
		}
		return result;
	}

	public static int testCaseRowNo(String testName, ExcelReader reader) {
		// getRowNumber of the test
		int rowNo = reader.getRowIndex(testName);
//		System.out.println("#####Row number of " + testName + " is: " + rowNo);
		return rowNo;
	}

	public static int totalDataRows(String testName, ExcelReader reader) {
		int totalDataRows = reader.totalDataRows(testName);
		return totalDataRows;
	}

	public static int totalDataCols(int colHeaderRow, ExcelReader reader) {
		int totalDataCols = reader.totalDataCols(colHeaderRow);

		return totalDataCols;
	}

	public static Object[][] getData(String testName, ExcelReader reader) {
		// boolean isTestRunnable = Utility.isTestRunnable("Test1", reader);
		// System.out.println("total data rows:^^^^^^^^");
		int testCase_RowNo = Utility.testCaseRowNo(testName, reader);
//		System.out.println("TestCase is in row no: " + testCase_RowNo);

		int totalDataRows = Utility.totalDataRows(testName, reader);
//		System.out.println("total data rows: " + totalDataRows);

		int totalDataCols = Utility.totalDataCols(testCase_RowNo + 1, reader);
//		System.out.println("Total Data cols is: " + totalDataCols);

		Object[][] data = new Object[totalDataRows][1];
		int dataStartRow = testCase_RowNo + 2;
		int colStartRow = testCase_RowNo + 1;
		int r = 0;
		for (int rowNo = dataStartRow; rowNo < dataStartRow + totalDataRows; rowNo++) {
			HashMap<String, String> map = new HashMap<>();

			for (int colNo = 0; colNo < totalDataCols; colNo++) {
				String s = reader.getCellData(rowNo, colNo);
//				System.out.print(s + "--");
				// getColName given row no and colno
				String columnName = reader.getColName(colStartRow, colNo);
				if (columnName != null) {
					// data[r][colNo] = s;
					map.put(columnName, s);
				}
			}
			data[r][0] = map;
			System.out.println("For row " + r + " map is " + map + " ");
			r++;
		}
		return data;
	}

}
