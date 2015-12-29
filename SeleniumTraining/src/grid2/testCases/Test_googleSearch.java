package grid2.testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.remote.RemoteWorker;

public class Test_googleSearch {
	
	@Parameters("browser")
	@Test
	public void searchTest(String b) throws MalformedURLException{
		System.out.println(b);
		//In Grid, we use RemoteWebDriver as RemoteWebDriver helps us to run the test cases through Grid
		//give the URL of hub to create RWDriver object
		//RemoteWebDriver(java.net.URL remoteAddress, Capabilities desiredCapabilities) 
		DesiredCapabilities cap = null;
		if(b.equals("firefox")){
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);
		}
		else if(b.equals("chrome")){
			cap=DesiredCapabilities.chrome();	
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		
		
		
	}

}
