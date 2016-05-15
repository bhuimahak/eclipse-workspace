import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieEx {
	WebDriver driver = null;
	String URL = "http://flipkart.com/";

	public static void main(String[] args) {
		CookieEx obj = new CookieEx();
	obj.addCookie();
	//	obj.deleteCookie();
	}

	public void addCookie() {
		driver = new FirefoxDriver();

		driver.navigate().to(URL);
		// we should pass name and value for cookie as parameters
		// In this example we are passing, name=mycookie and value=123456789123
		Cookie cookie = new Cookie("mycookie", "123456789123");
		driver.manage().addCookie(cookie);

		// After adding the cookie we will check that by displaying all the
		// cookies.
		Set<Cookie> cookiesList = driver.manage().getCookies();
		for (Cookie getcookies : cookiesList) {
			System.out.println(getcookies);
		}

	}

	public void deleteCookie() {
		driver = new FirefoxDriver();
		driver.navigate().to(URL);
		//driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("mycookie");
		Set<Cookie> cookiesList = driver.manage().getCookies();
		for (Cookie getcookies : cookiesList) {
			System.out.println(getcookies);
		}

	}
}