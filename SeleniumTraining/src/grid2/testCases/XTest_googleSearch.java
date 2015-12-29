package grid2.testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XTest_googleSearch {

	@Test(dataProvider = "getData")
	public void searchTest(String key, String b) throws MalformedURLException {
		System.out.println(b);
		// In Grid, we use RemoteWebDriver as RemoteWebDriver helps us to run
		// the test cases through Grid
		// give the URL of hub to create RWDriver object
		// RemoteWebDriver(java.net.URL remoteAddress, Capabilities
		// desiredCapabilities)
		DesiredCapabilities cap = null;
		if (b.equals("firefox")) {
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		} else if (b.equals("chrome")) {
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys(key);
		driver.quit();

	}

	@DataProvider(parallel = true)
	public Object[][] getData() {

		Object[][] data = new Object[3][2];

		data[0][0] = "java";
		data[0][1] = "chrome";

		data[1][0] = "qtp";
		data[1][1] = "chrome";
		
		data[2][0] = "qtp";
		data[2][1] = "firefox";

		return data;
	}

}
