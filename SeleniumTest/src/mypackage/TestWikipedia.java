package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWikipedia {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		
		
		
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		WebElement link;
		link = driver.findElement(By.linkText("English"));
		link.click();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchBox = driver.findElement(By.xpath("//*[@id='searchInput']"));
		//WebElement searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software");
		searchBox.submit();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();
		
		

	}
}
