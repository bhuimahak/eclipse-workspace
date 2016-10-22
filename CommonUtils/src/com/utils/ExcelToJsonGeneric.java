package com.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.JSONArray;
import org.json.JSONObject;

public class ExcelToJsonGeneric {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		Workbook workbook = WorkbookFactory
				.create(new File("C:\\Users\\mahabhui\\personal_git\\eclipse-workspace\\CommonUtils\\SampleData.xlsx"));
		Sheet sheet = workbook.getSheetAt(0);
		int firstRowNumber = sheet.getFirstRowNum();
		int lastRowNumber = sheet.getLastRowNum();
		
		Row headerRow = sheet.getRow(firstRowNumber);
		Map<Integer, String> headerMap = new HashMap<>();
		for(Cell cell : headerRow) {
			headerMap.put(cell.getColumnIndex(), cell.getStringCellValue());
		}
		
		JSONArray employeesJsonArray = new JSONArray();
		for (int rowNumber = firstRowNumber + 1; rowNumber <= lastRowNumber; rowNumber++) {
			Row row = sheet.getRow(rowNumber);
			JSONObject employeeJSON = new JSONObject();
			for(Cell cell : row) {
				employeeJSON.put(headerMap.get(cell.getColumnIndex()), getCellValue(cell));
			}
			employeesJsonArray.put(employeeJSON);
		}
		System.out.println(employeesJsonArray.toString());
	}
	
	private static Object getCellValue(Cell cell) {
		Object value = "";
		switch(cell.getCellType()) {
		case Cell.CELL_TYPE_NUMERIC:
			value = cell.getNumericCellValue();
			break;
		case Cell.CELL_TYPE_STRING:
			value = cell.getStringCellValue();
			break;
		case Cell.CELL_TYPE_BLANK:
			value = "";
			break;
		}
		return value;
	}
}
