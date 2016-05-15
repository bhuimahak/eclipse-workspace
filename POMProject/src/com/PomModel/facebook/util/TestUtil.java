package com.PomModel.facebook.util;

import java.util.HashMap;

public class TestUtil {

	public static boolean isExecutable(String testName, ExcelReader reader) {

		for (int rowNum = 1; rowNum < reader.getRowCount(); rowNum++) {

			String testCaseName = reader.getValue(rowNum, "TCID");// or getCellData(rowNum,
																	// 0);
			if (testName.equals(testCaseName)) {
				String runMode = reader.getValue(rowNum, "Runmode");
				if (runMode.equals("Y")) {
					return true;
				} else
					System.out.println("Rumnode is N");
				return false;
			}
		}
		System.out.println("TestCaseName was not found in the sheet");
		return false;
	}

	public static Object[][] getData(String testName, ExcelReader reader) {
		System.out.println("******************************");
		// 1.find the test in the excelSheet
		// 2.find the number of cols in the test
		// 3.find the number of rows in the test
		// 4.Put the data in the 2D-object array
		if (testName == null) {
			System.out.println("Please pass valid test case number");
			return null;
		}

		// 1.find the test in the excelSheet
		int test_case_startIndex = reader.getRowIndex(testName);
		System.out.println(testName + " : starts from row number " + test_case_startIndex);

		// 2.find the number of cols in the test
		int colStartIndex = test_case_startIndex + 1;
		int number_of_columns = reader.totalDataCols(colStartIndex);
		System.out.println("Total number of columns for " + testName + " is: " + number_of_columns);

		// 3. Now we will find the total number of rows for this test i.e.
		// Number of test sets
		int totalDataRows = reader.totalDataRows(testName);
		System.out.println("Total test sets/dataRows for " + testName + " is: " + totalDataRows);

		// putting data for each row in the map
		Object[][] data = new Object[totalDataRows][1];
		int dataStartIndex = test_case_startIndex + 2;
		HashMap<String, String> map = null;

		for (int rowNo = dataStartIndex; rowNo < dataStartIndex + totalDataRows; rowNo++) {
			map = new HashMap<String, String>();
			for (int colNo = 0; colNo < number_of_columns; colNo++) {
				String key = reader.getColName(colStartIndex, colNo);
				String value = reader.getCellData(rowNo, colNo);
				//System.out.println("Key is " + key + " and value is: " + value);
				map.put(key, value);
			}
			//System.out.println(map);
			data[rowNo-dataStartIndex][0] = map;
		}
		//System.out.println();

		return data;

	}

}
