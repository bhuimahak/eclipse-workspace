package module15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMovements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://americangolf.co.uk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		WebElement golfClubs = driver.findElement(By.cssSelector("div#navigation>nav>ul>li:nth-child(1)>a"));
		
		Actions act = new Actions(driver);
		act.moveToElement(golfClubs).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")));
		
		driver.findElement(By.xpath("//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")).click();
		
		System.out.println("Current page title is: " + driver.getTitle());
		
		//drag n drop operation
		
		WebElement dragger = driver.findElement(By.cssSelector("span[class^='ui-slider-handle ui-state-default ui-corner-all first']"));
		act.dragAndDropBy(dragger, 50, 0).build().perform();
		
		
	}

}
