package mypackage;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class GetDataFromXl {
	private Workbook wb;
	private Sheet sh;
		
	public GetDataFromXl(String path, String sheet) throws IOException, BiffException, MyException{
		FileInputStream fis = new FileInputStream(path);
		wb = Workbook.getWorkbook(fis);
		sh = wb.getSheet(sheet);
		if(sh == null) {
			throw new MyException("Sheet NOT FOUND!!");
		}
	}

	public  String getData(int colNumber, int rowNumber ) throws MyException {
		Cell cell = sh.getCell(colNumber, rowNumber);
		if(cell == null) {
			throw new MyException("Cell NOT FOUND!!");
		}
		String content = cell.getContents();
		return content;
	}	
}
			
	

