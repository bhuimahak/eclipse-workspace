package test_rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;

import com.carwale.pages.CarLandingPage;

public class test_landing {

	public static void main(String[] args) throws InterruptedException {
		ProfilesIni allProfiles= new ProfilesIni();
		FirefoxProfile profile = allProfiles.getProfile("SeleniumProfile");
		
		 WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.cardekho.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CarLandingPage page = PageFactory.initElements(driver, CarLandingPage.class);
		
		page.searchByBrand("BMW", "X1");

	}

}
