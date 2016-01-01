package module11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LaunchDynamically {
	WebDriver driver = null;

	@Test(dataProvider = "getData")
	public void testApp(String browsername, String username, String password) {
		
		if(browsername.equals("Mozilla")){
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mahak\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = { { "Mozilla", "user1", "Pass1" }, { "Chrome", "user2", "pass2" } };
		return data;

	}

}
