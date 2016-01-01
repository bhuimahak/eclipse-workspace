package reflection;

import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import propertiesEx.PropertiesUtil;
import jxl.Sheet;
import jxl.Workbook;

public class ReflectionDemoExcel {

	public static void main(String args[]) throws Exception {
		System.out.println("Starting...");
		
		String xl_filePath = PropertiesUtil.getProperty("xl_path");

		FileInputStream fis = new FileInputStream(xl_filePath);
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet(0);

		if(sh == null) {
			throw new Exception("Sheet NOT FOUND!!");
		}
		
		SampleClass ref = new SampleClass();

		for(int r = 1; r < sh.getRows(); r++) {
			String methodName = sh.getCell(0, r).getContents();
			Integer param = Integer.parseInt(sh.getCell(1, r).getContents());
			try {
				Method meth = ref.getClass().getMethod(methodName, Integer.class);
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
