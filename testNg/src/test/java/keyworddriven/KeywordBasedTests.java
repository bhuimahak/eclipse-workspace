package keyworddriven;

import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

public class KeywordBasedTests {

	@Test
	public void KeywordBasedTest() throws Exception {
		String xl_filePath = "xl_path";

		FileInputStream fis = new FileInputStream(xl_filePath);
		Workbook wb = new HSSFWorkbook(fis);
		Sheet sh = wb.getSheetAt(0);

		if (sh == null) {
			throw new Exception("Sheet NOT FOUND!!");
		}

		//BrowserUtil ref = new BrowserUtil();

		for (int r = 1; r < sh.getLastRowNum(); r++) {
			Row row = sh.getRow(r);
			String className = row.getCell(0).getStringCellValue();
			String methodName = row.getCell(0).getStringCellValue();
			Integer param = (int) row.getCell(1).getNumericCellValue();
			try {
				Class<?> classRef = Class.forName(className);
				Object ref = classRef.newInstance();
				Method meth = classRef.getMethod(methodName, Integer.class, Integer.class);
				meth.invoke(ref, param);
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Ending...");

	}
}
