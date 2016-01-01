package seleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SeleniumCode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahak\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ProfilesIni profile = new ProfilesIni();
		//FirefoxProfile myProfile = profile.getProfile("myProfile");
		//WebDriver driver = new FirefoxDriver(myProfile);
		driver.navigate().to("http://www.google.com");
		try {
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
