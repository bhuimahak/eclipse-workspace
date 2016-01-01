package xl.jxl;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Reading {

	public static void main(String[] args) {

		try {
			// get the existing workbook
			File exlFile = new File("resources\\readXl.xls");
			Workbook workbook = Workbook.getWorkbook(exlFile);
			
			//get the sheet
			Sheet sheet = workbook.getSheet("sheetOne");
			//get cell ref 
			Cell colArow1 = sheet.getCell(0, 0);
			Cell colBrow1 = sheet.getCell(1, 0);
			Cell colArow2 = sheet.getCell(0, 1);
			
			//get the contents of the cell
			
			String str_colArow1 = colArow1.getContents();
			String str_colBrow1 = colBrow1.getContents();
			String str_colArow2 = colArow2.getContents();
			
			//display the cell contents
			System.out.println(str_colArow1  + " " + str_colBrow1+ " " +str_colArow2);
			
			
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
