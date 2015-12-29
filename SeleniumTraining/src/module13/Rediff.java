package module13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://shopping.rediff.com/?sc_cid=inhome_icon");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// WebElement box =
		driver.findElement(By.xpath("//*[@id='popular_cat']"));
		// List<WebElement> linksList = box.findElements(By.tagName("a"));
//		List<WebElement> linksList = driver.findElements(By.cssSelector("div#popular_cat h3 a"));
//		for (WebElement e : linksList) {
//			String linkName = e.getText();
//			System.out.println(linkName);
//		}

		// WebElement link = driver.findElement(By.cssSelector("div#popular_cat h3:nth-of-type(2) a"));
		// System.out.println(link.getText());

		// or

		 String part1 = "//*[@id='popular_cat']/h3[";
		 String part2 = "]/a";
		 for(int i=1; i<=14; i++){
		 WebElement link = driver.findElement(By.xpath(part1 +i+ part2));
		 System.out.println(link.getText());
		 link.click();
		 System.out.println(driver.getTitle());
		 driver.navigate().back();
		 }
		

		driver.close();
	}

}
