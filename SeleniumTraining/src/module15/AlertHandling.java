package module15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	 
	 driver.findElement(By.name("proceed")).click();
	 System.out.println("after click");
	 WebDriverWait wait = new WebDriverWait(driver,20);
	 wait.until(ExpectedConditions.alertIsPresent());
	 //for ie
	 //driver.switchTo().activeElement();
	 
	 Alert al = driver.switchTo().alert();
	 System.out.println(al.getText());
	 Thread.sleep(2000);
	 al.accept();
	// al.dismiss();
	 
	 driver.quit();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	}

}
