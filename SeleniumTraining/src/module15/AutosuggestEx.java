package module15;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutosuggestEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("software");
		WebElement box = driver.findElement(By.xpath("//div[@id='sbtc']/div[2]/div[2]/div[1]"));
		List<WebElement> lists = box.findElements(By.className("sbqs_c"));
		System.out.println("Size of options are: " +lists.size());
		
		for(WebElement e : lists){
			System.out.println(e.getText());
			if((e.getText()).equals("software testing")){
				System.out.println("in if");
				e.sendKeys(Keys.ENTER);
				break;
			}
		}
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
