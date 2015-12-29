package module14;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		String companyName = "Future Retail";

		List<WebElement> companyNames = driver.findElements(By.cssSelector("table.dataTable>tbody>tr>td:nth-child(1)"));
		List<WebElement> prices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total company names: " + companyNames.size());
		System.out.println("total prices" + prices.size());

		for (int i = 0; i < companyNames.size(); i++) {
			// System.out.println("in for");
			if (companyName.equals(companyNames.get(i).getText())) {
				System.out.println(companyNames.get(i).getText() + "----" + prices.get(i).getText());
				break;
			}

		}

		int rowNo = getRowWithCellDataNew("41.45");
		if (rowNo == -1) {
			System.out.println("data not found");
		}
		else {
			System.out.println("present in: " + rowNo);
		}

	}

	public static int getRowWithCellDataNew(String data) {
		System.out.println("in fun");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("total rows: " + rows.size());
		for (int rowNo = 0; rowNo < rows.size(); rowNo++) {
			System.out.println("row is: " + rowNo);
			WebElement row = rows.get(rowNo);

			List<WebElement> rowcells = row.findElements(By.tagName("td"));

			for (int cellNo = 0; cellNo < rowcells.size(); cellNo++) {
				String text = rowcells.get(cellNo).getText();
				if (text.equals(data)) {
					return rowNo + 1;
				}
//				System.out.print(text + "--");
			}
//			System.out.println(" ");
		}
		return -1;
	}
	public static int getRowWithCellData(String data) {
		System.out.println("in fun");
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println("total rows: " + rows);
		for (int rowNo = 1; rowNo <= rows; rowNo++) {
			System.out.println("row is: " + rowNo);
			// System.out.println("in for");

			List<WebElement> rowcells = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[" + rowNo
					+ "]/td"));
			// System.out.println("total cells: " + rowcells.size());

			for (int cellNo = 0; cellNo < rowcells.size(); cellNo++) {
				String text = rowcells.get(cellNo).getText();
				if (text.equals(data)) {
					return rowNo;
				}
				System.out.print(text + "--");
			}
			System.out.println(" ");
		}
		return -1;
	}
}
