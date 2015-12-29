import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataDrivenFramework.util.PropertiesProvider;


public class RoughWork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("http://in.rediff.com");
		driver.findElement(By.xpath("//div[@id='homewrapper']/div[5]/a[3]/div/u")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='wrapper']/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys("bhuimahak@gmail.com");
		driver.findElement(By.xpath("//input[@id='emailsubmit']")).click();
		System.out.println("continue clicked");
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 2500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userpass']")));
		System.out.println("wait over!!");
		driver.findElement(By.xpath("//input[@id='userpass']")).sendKeys("A123456");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='loginsubmit']")).click();
		
		List<WebElement> fundsList = driver.findElements(By.xpath("//table[@id='mf']/tbody//tr/td[2]/span/a"));
		System.out.println("List");
		for(WebElement e: fundsList){
			System.out.println("in for");
			System.out.println(e.getText());
		}
		
		

	}

}
