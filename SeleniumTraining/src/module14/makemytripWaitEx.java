package module14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class makemytripWaitEx {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		WebElement holidayButton = driver.findElement(By.cssSelector("ul[class='tabs_list clearfix'] li:nth-child(4)"));
		System.out.println(holidayButton.getText());
		holidayButton.click();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input[class='typeahead-dest-city input-md form-control tt-input']")).sendKeys("Malaysia");
		driver.findElement(By.cssSelector("div.tt-dataset-holiday")).click();
		driver.findElement(By.xpath("//a[@id='submit-btn-holiday']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='flL last active']")));
		System.out.println(driver.getTitle());
		
		//or
		
		FluentWait<WebDriver> fwait = new FluentWait<>(driver);
		fwait.withTimeout(0, TimeUnit.SECONDS);
		fwait.pollingEvery(1, TimeUnit.SECONDS);
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='flL last active']")));
	}

}
