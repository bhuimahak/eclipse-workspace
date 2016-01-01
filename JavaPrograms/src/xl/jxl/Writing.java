package xl.jxl;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import jxl.Workbook;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Writing {

	public static void main(String[] args) {
		try {
			System.out.println("starting");
			File exlFile = new File("resources\\writeXl.xls");
			WritableWorkbook workbook = Workbook.createWorkbook(exlFile);
			WritableSheet sheet = workbook.createSheet("sheetOne", 0);
			
			//create data to put in the sheet
			Label label = new Label(0, 0, "Name");
			DateTime date = new DateTime(1, 0, new Date());
			
			//add data into the sheet
			sheet.addCell(label);
			sheet.addCell(date);
			
			//write and close the workbook
			workbook.write();
			workbook.close();
			
			System.out.println("completed");
			
		} catch (IOException | WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
