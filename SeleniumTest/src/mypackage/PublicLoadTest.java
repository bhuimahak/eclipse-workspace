package mypackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PublicLoadTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		try {
			driver.get("https://www.google.com");
			System.out.println("google loaded");
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.navigate().to("https://stackoverflow.com");
			System.out.println("stackoverf loaded");
			driver.navigate().back();
			System.out.println("it is loading in the specified time");
		}
		catch(TimeoutException ex) {
			System.out.println("Page did not load in the speacified time");
			ex.printStackTrace();
		}
		finally {
			driver.quit();
		}
	}

}
