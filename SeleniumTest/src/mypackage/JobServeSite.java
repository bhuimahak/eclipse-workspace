package mypackage;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JobServeSite {

	public static void main(String[] args) throws BiffException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.jobserve.com.au/Homepage.aspx");
		driver.findElement(By.xpath("//*[@id='ddcl-selInd']/span/span")).click();
		driver.findElement(By.xpath("//*[@id='ddcl-selInd-i0']")).click();
		
		try {
			GetDataFromXl dataObj = new GetDataFromXl("C:\\Users\\mahak\\Desktop\\jobserve.xls", "Droplist");
			String values = dataObj.getData(0, 1);
			String selections[] = values.split(",");

			String xpath_start = "//*[@id='ddcl-selInd-ddw']/div/div[";
			String xpath_end = "]/label";
			for (int i = 0; i < selections.length; i++) {
				driver.findElement(By.xpath(xpath_start + selections[i] + xpath_end)).click();
			}
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
