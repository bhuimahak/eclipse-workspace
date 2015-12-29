package module17;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShopingCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://uk.webuy.com/search/index.php?stext=*&section=&catid=956");

//		final Predicate<WebDriver> condition = new Predicate<WebDriver>() {
//			@Override
//			public boolean apply(WebDriver t) {
//				Object str = ((JavascriptExecutor)t).executeScript("return document.readyState;");
//				return "complete".equals(str);
//			}
//		};
//
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		wait.until(condition);

		//execute_script("return document.readyState;") == "complete" 
		List<WebElement> boxes = driver.findElements(By.cssSelector("div.searchRecord ")); //[contains(text(),\"NEW\")]  [@class='hotproducts']
		
		for(WebElement box: boxes) {
			//System.out.println(box.getText());
			//System.out.println("-----------------------------------");	
			String name = box.findElement(By.tagName("h1")).getText(); // Theft Auto V (5) *2 Disc*						
			if(name != null && "Sims 3 - Offline (SN) (Not EA Origins)".equals(name.trim())) {
				System.out.println(name);
				WebElement buttonEl = box.findElement(By.xpath("//div[@class='action']/div/a[contains(@href, 'buy')]")); //input[contains(@class, 'suggest')].

				buttonEl.click();
				System.out.println(buttonEl.getText());
				System.out.println("-----------------------------------");
			}
		}
		System.out.println(boxes.size());
		//driver.quit();
	}

}
