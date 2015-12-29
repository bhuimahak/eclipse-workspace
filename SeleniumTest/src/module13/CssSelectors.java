package module13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.deshawindia.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String text = driver.findElement(By.xpath("//ul[@id='nav']/li[1]/a")).getAttribute("href");
		//System.out.println(text);
		//String text1 = driver.findElement(By.cssSelector("ul[id='nav'] > li:nth-child(2) > a")).getText();
		//String text1 = driver.findElement(By.cssSelector("ul#nav > li:nth-child(2) > a")).getText();
		//System.out.println(text1);
//		String text1 = driver.findElement(By.cssSelector("ul.secondarynav a")).getText();
		//String text2 = driver.findElement(By.xpath("//ul[@class='secondarynav']//a")).getText();
		//System.out.println("text is:" + text2);
		System.out.println(driver.findElement(By.cssSelector("li#searchFormContainer a:nth-of-type(1)")).getAttribute("href"));
		driver.quit();
		
		

	}

}
