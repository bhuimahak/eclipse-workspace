package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class linkedinLogin {
	
	

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver,5);
	driver.get("https://www.linkedin.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("login-email")).sendKeys("ema@gmail.com");;
	driver.findElement(By.id("login-password")).sendKeys("hello");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));
	driver.findElement(By.name("submit")).click();
	Thread.sleep(3000);
	driver.quit();
	

	}

}
