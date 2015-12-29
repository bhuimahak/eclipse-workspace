package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

public class NewTestNg {

	public WebDriver driver;
	public WebDriverWait wait;

	// locators

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		wait = new WebDriverWait(driver, 5);
	}

	@Test(dataProvider = "empLogin")
	public void verifyInvalidLogin(String userName, String password) {
		driver.navigate().to("https://www.linkedin.com/nhome");
		driver.findElement(By.id("session_key-login")).sendKeys(userName);
		driver.findElement(By.id("session_password-login")).sendKeys(password);
		// wait for element to be visible and perform click
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("signin")));
		driver.findElement(By.name("signin")).click();

		// check for error message
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("global-alert-queue")));
		String actualErrorDisplayed = driver.findElement(By.id("global-alert-queue")).getText();
		String expectedError = "Please correct the marked field(s) below.";
		Assert.assertEquals(actualErrorDisplayed, expectedError);
	}

	@DataProvider(name = "empLogin")
	public Object[][] loginData() {
		Object[][] arrayObject = getExcelData("C:\\Users\\mahak\\Desktop\\testData.xls", "Sheet1");
		return arrayObject;
	}

	public String[][] getExcelData(String fileName, String sheetName) {

		String[][] arrayExcelData = null;

		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalrows = sh.getRows();
			int totalcols = sh.getColumns();
			System.out.println("ROWS: " + totalrows);
			System.out.println("COLS: " + totalcols);

			arrayExcelData = new String[totalrows - 1][totalcols];

			for (int i = 1; i < totalrows; i++) {
				for (int j = 0; j < totalcols; j++) {
					arrayExcelData[i - 1][j] = sh.getCell(j, i).getContents();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
