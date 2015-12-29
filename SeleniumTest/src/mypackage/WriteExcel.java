package mypackage;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class WriteExcel {    
	public static void main(String[] args) throws IOException  {
		File f = new File("C:\\Users\\mahak\\Desktop\\Write_data.xls");
		WritableWorkbook wb = Workbook.createWorkbook(f);
		WritableSheet sh = wb.createSheet("Data", 0);
		
		for(int r = 0; r < 4; r++) {
			for(int c = 0; c < 5; c++) {
				String cellContent = "" + r + ":" + c;
				Label label= new Label(c, r, cellContent);
				try {
					sh.addCell(label);
				} catch (WriteException e) {
					e.printStackTrace();
				}
				
			}
		}
		wb.write();
		try {
			wb.close();
		} catch (WriteException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
