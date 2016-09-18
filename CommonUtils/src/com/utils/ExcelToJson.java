package com.utils;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.JSONArray;
import org.json.JSONObject;

public class ExcelToJson {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		Workbook workbook = WorkbookFactory
				.create(new File("C:\\Users\\mahabhui\\personal_git\\eclipse-workspace\\CommonUtils\\SampleData.xlsx"));
		Sheet sheet = workbook.getSheetAt(0);
		int firstRowNumber = sheet.getFirstRowNum();
		int lastRowNumber = sheet.getLastRowNum();
		JSONArray employeesJsonArray = new JSONArray();
		for (int rowNumber = firstRowNumber + 1; rowNumber <= lastRowNumber; rowNumber++) {
			Row row = sheet.getRow(rowNumber);

			int columnNumber = 0;
			String firstName = row.getCell(columnNumber++).getStringCellValue();
			String lastName = row.getCell(columnNumber++).getStringCellValue();
			String designation = row.getCell(columnNumber++).getStringCellValue();
			String company = row.getCell(columnNumber++).getStringCellValue();
			int age = (int) row.getCell(columnNumber++).getNumericCellValue();
			String phone = row.getCell(columnNumber++).getStringCellValue();

			String[] phoneNumbers = phone.split(";");
			JSONArray phoneNumberJsonArray = new JSONArray();
			for (String number : phoneNumbers) {
				phoneNumberJsonArray.put(number);
			}

			JSONObject name = new JSONObject();
			name.put("firstName", firstName);
			name.put("lastName", lastName);

			JSONObject employeeJSON = new JSONObject();
			employeeJSON.put("name", name);
			employeeJSON.put("designation", designation);
			employeeJSON.put("company", company);
			employeeJSON.put("age", age);
			employeeJSON.put("phone", phoneNumberJsonArray);
			employeesJsonArray.put(employeeJSON);
		}
		System.out.println(employeesJsonArray.toString());

	}

}
