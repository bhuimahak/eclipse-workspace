package module14;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakemytripPopup {

	public static void main(String[] argv) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		WebElement holidayOffers = driver.findElement(By.cssSelector("span[class='marR8 chilli_img chilli_img_pos']"));
		holidayOffers.click();
		holidayOffers.click();
		holidayOffers.click();
		holidayOffers.click();

		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("Total windows open > " + windowIds.size());

		Iterator<String> it = windowIds.iterator();
		String mainWindow = it.next();
		System.out.println("main window id: " + mainWindow);
		System.out.println(driver.getTitle());

		while (it.hasNext()) {
			String win = it.next();
			System.out.println("windowId " + win);
			driver.switchTo().window(win).close();
		}

		System.out.println("outside the loop");

		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.close();
	}
}
