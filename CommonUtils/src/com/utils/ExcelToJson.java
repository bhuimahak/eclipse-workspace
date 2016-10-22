package com.utils;

import java.io.File;
import java.io.FileWriter;
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
import org.json.JSONException;
import org.json.JSONObject;

public class ExcelToJson {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		Workbook workbook = WorkbookFactory
				.create(new File("C:\\Users\\mahabhui\\personal_git\\eclipse-workspace\\CommonUtils\\SampleData.xlsx"));
		Sheet sheet = workbook.getSheetAt(0);
		int firstRowNumber = sheet.getFirstRowNum();
		int lastRowNumber = sheet.getLastRowNum();
		
		Row headerRow = sheet.getRow(firstRowNumber);
		Map<String, Integer> headerMap = new HashMap<>();
		for(Cell cell : headerRow) {
			headerMap.put(cell.getStringCellValue(), cell.getColumnIndex());
		}		
		
		JSONArray employeesJsonArray = new JSONArray();
		for (int rowNumber = firstRowNumber + 1; rowNumber <= lastRowNumber; rowNumber++) {
			Row row = sheet.getRow(rowNumber);
			String designation = row.getCell(headerMap.get("Designation")).getStringCellValue();
			String firstName = row.getCell(headerMap.get("First Name")).getStringCellValue();
			String lastName = row.getCell(headerMap.get("Last Name")).getStringCellValue();
			String company = row.getCell(headerMap.get("Company")).getStringCellValue();
			int age = (int) row.getCell(headerMap.get("Age")).getNumericCellValue();
			String phone = row.getCell(headerMap.get("Phone")).getStringCellValue();

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
		System.out.println(employeesJsonArray.toString(4));

		try(FileWriter file = new FileWriter(new File("Employees.json"))) {
			file.write(employeesJsonArray.toString(4));
		} catch (JSONException ex) {
			ex.printStackTrace();
		}

	}

}
