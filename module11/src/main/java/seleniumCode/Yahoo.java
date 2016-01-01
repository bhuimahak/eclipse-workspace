package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.com");
		driver.findElement(By.cssSelector("input[id ='UHSearchBox']")).sendKeys("games");

		Thread.sleep(2000);

		String element = driver.findElement(By.cssSelector("ul[id^='yui_3_12_0_1'] li")).getText();
		System.out.println(element);
		//Thread.sleep(2000);
		

	}

}
