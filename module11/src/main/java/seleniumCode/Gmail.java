package seleniumCode;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Gmail {

	public static void main(String[] args) {
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("myProfile");
		WebDriver driver = new FirefoxDriver(myprofile);
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//*[@id='gmail-sign-in']")).click();
		WebElement emailField = driver.findElement(By.id("Email"));
		emailField.sendKeys("hello");
		emailField.clear();
		int x = emailField.getLocation().x;
		int y =emailField.getLocation().y;
		System.out.println("coordinates of element are " +x + "  "  +y );
		
		WebElement button = driver.findElement(By.name("signIn"));
		button.click();
		//Assert.assertEquals(("Please enter your email."), driver.findElement(By.id("errormsg_0_Email")).getText());
		//System.out.println("pass");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();
		
	
		
	}
}
