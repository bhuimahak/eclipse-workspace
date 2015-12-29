package module17;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnpredictablePopups {

	static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://qtpselenium.com/test/unpredictable.php");
		
		closePopUpIfPresent();

	}

	private static void closePopUpIfPresent() {
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("Total windows -> " +windowIds.size());
		
		if(windowIds.size()>1){
		Iterator<String> iter = windowIds.iterator();
		String mainWindow = iter.next();
		String popupWindow = iter.next();
		driver.switchTo().window(popupWindow);
		driver.close();
		driver.switchTo().window(mainWindow);
		
		}
		
		List<Map<String, String>> list = null; // get from excel
		List<WebElement> boxes = null;//.... Get list of boxes.
		for(int i = 0; i < list.size(); i++) {
			Map<String, String> product = list.get(i);
			String productName = product.get("productName");
			for(WebElement box: boxes) {
				String name = box.findElement(By.cssSelector("div.prodName > a")).getText(); // Theft Auto V (5) *2 Disc*						
				if(name.equals(productName)) {
					WebElement buttonEl = box.findElement(By.cssSelector("div.buyNowButton"));
					buttonEl.click();
				}
			}
		}
	
	}
}
