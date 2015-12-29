package mypackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {  
	
	
	public static void main(String[] args) throws BiffException, IOException, InterruptedException  {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		File fs = new File("C:\\Users\\mahak\\Desktop\\Test_data.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet(0);
		
		for(int r = 0; r<sh.getRows(); r++) {
			
			for(int c = 0; c<sh.getColumns(); c++){
				String getCellContent = sh.getCell(c, r).getContents();
				driver.findElement(By.name("q")).sendKeys(getCellContent);
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(3000);
				driver.navigate().refresh();
			}
		}
		
		
		

	}

}
