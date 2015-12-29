package module16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptExecutorEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('hello!')");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	
		driver.get("http://www.makemytrip.com");
		
//		WebElement radio = driver.findElement(By.xpath("//a[@id='one_way_button1']/span/input"));
//		System.out.println(radio.isDisplayed());
//		if(radio.isDisplayed()){
//			radio.click();
//		}
		js.executeScript("change_trip_type('one_way_button', 'trip_type', 'o');");
		
		
		
	

	}

}
