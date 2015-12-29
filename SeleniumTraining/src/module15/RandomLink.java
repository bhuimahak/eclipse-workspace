package module15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RandomLink {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://americangolf.co.uk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		WebElement golfClubs = driver.findElement(By.cssSelector("div#navigation>nav>ul>li:nth-child(1)>a"));
		Actions actionBuilder = new Actions(driver);
		Action action = actionBuilder.moveToElement(golfClubs).build();
		action.perform();

		WebElement ladies = driver.findElement(By.xpath("//div[@id='navigation']/nav/ul/li[1]/div/div[1]/ul/li[3]/a"));
		actionBuilder.moveToElement(ladies).build().perform();

		// WebElement box =
		// driver.findElement(By.xpath("//div[@id='CLUBS_3']/div[1]"));
		// List<WebElement> links = box.findElements(By.tagName("a"));
		//
		// Random r = new Random();
		// int randomNumber = r.nextInt(links.size());
		// WebElement link = links.get(randomNumber);
		// System.out.println(link.getText());
		// link.click();

		WebElement link = driver
				.findElement(By
						.cssSelector("a[href='http://www.americangolf.co.uk/golf-clubs/drivers?prefn1=gender&prefv1=Female%7CUnisex']"));
		System.out.println(link.getText());
		link.click();

		System.out.println(driver.getTitle());
		// drag n drop operation

		// WebElement dragger = driver.findElement(By
		// .cssSelector("span[class^='ui-slider-handle ui-state-default ui-corner-all first']"));
		// actionBuilder.dragAndDropBy(dragger, 50, 0).build().perform();

		WebElement cobraGolf = driver.findElement(By.cssSelector("a.listingchange[title='Refine by: CobraGolf']"));
		actionBuilder.moveToElement(cobraGolf).click().build().perform();
	
		Thread.sleep(10 * 1000);
		WebElement nikeGolf = driver.findElement(By.cssSelector("a.listingchange[title='Refine by: NikeGolf']"));
		actionBuilder.click(nikeGolf).build().perform();

	}

}
