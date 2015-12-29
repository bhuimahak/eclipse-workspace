package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Webdriver_example {
	
	public static void main(String[] args) {
		
		 ProfilesIni allProfs = new ProfilesIni();
		FirefoxProfile myProfile = allProfs.getProfile("selenium");
		WebDriver driver = new FirefoxDriver(myProfile); 
		
		
		//WebDriver driver =   new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://mail.google.com");
		driver.manage().window().maximize();
		
		//WebElement username = driver.findElement(By.id("Email"));
		//or u can use Xpath(partial xpath and not absolute)
		 
		WebElement username = driver.findElement(By.xpath("//input[@id='Email']"));
		username.sendKeys("bhuimahak@gmail.com");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement nextButton = driver.findElement(By.id("next"));
		nextButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement password = driver.findElement(By.id("Passwd"));
		password.sendKeys("Meh@405805");
		
		WebElement signin_button = driver.findElement(By.id("signIn"));
		signin_button.click();
		
	}

}
