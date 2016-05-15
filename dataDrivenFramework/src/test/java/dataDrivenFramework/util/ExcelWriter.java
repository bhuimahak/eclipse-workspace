package dataDrivenFramework.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	private Workbook wb = null;
	private String path = null;
	
	public ExcelWriter(String path) throws EncryptedDocumentException, InvalidFormatException, IOException {
		this.path = path;
		FileInputStream fsIP= new FileInputStream(new File(path));
		this.wb = new XSSFWorkbook(fsIP);
	}
	
	public void addSheet(String sheetName, List<String> headers, List<Map<String, String>> listOfMap) {
		Sheet sh = wb.createSheet(sheetName);
		
		CellStyle headerStyle = getHeaderCellStyle();

		Row r = sh.createRow(0);
		for(int j = 0; j < headers.size(); j++) {
			Cell c = r.createCell(j);
			c.setCellValue(headers.get(j));
			c.setCellStyle(headerStyle);
		}
		
		for(int i = 0; i < listOfMap.size(); i++) {
			Row row = sh.createRow(i + 1);
			Map<String, String> resultMap = listOfMap.get(i);
			for(int j = 0; j < headers.size(); j++) {
				String header = headers.get(j);
				String value = resultMap.get(header);
				Cell c = row.createCell(j);
				c.setCellValue(value);
			}
		}

		FileOutputStream output_file;
		try {
			output_file = new FileOutputStream(new File(path));
	        wb.write(output_file);
	        output_file.close();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private CellStyle getHeaderCellStyle() {
		CellStyle style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.LIME.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		
		Font font = wb.createFont();
	    font.setBold(true);
		style.setFont(font);
		return style;
	}
}
