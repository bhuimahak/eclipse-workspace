import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WindowHandler {
	WebDriver driver = null;
	String appUrl = "http://www.google.com";

	@Test
	public void test() {
		driver = new FirefoxDriver();
		driver.get(appUrl);

		// WebElement element = driver.findElement(By.xpath("c"));
		// Select sel = new Select(element);
		// sel.selectByIndex(2);

		// driver.findElement(By.xpath("k")).isDisplayed();
		String parentWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String windowId = iter.next();
			driver.switchTo().window(windowId);
			driver.close();
		}
		driver.switchTo().window(parentWindow);

	}

}
