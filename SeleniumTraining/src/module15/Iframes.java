package module15;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframes {
	static WebDriver driver = null;
	static List<WebElement> frames = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		driver.get("http://www.paytm.com");
		driver.findElement(By.cssSelector("a.login")).click();
		frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of the frames: " + frames.size());

		int frameno = getFrame();
		if (frameno >= 1) {
			driver.switchTo().frame(frameno);
			driver.findElement(By.xpath("//input[@id='input_0']")).sendKeys("hello");
			Thread.sleep(2000);
		} else {
			System.out.println("frame not found");
		}

		driver.switchTo().defaultContent();
		driver.quit();

	}

	public static int getFrame() {
		for (int i = 0; i < frames.size(); i++) {
			driver.switchTo().frame(i);
			int size = driver.findElements(By.xpath("//input[@id='input_0']")).size();
			System.out.println(size);
			if (size >= 1) {
				driver.switchTo().defaultContent();
				return i;
			}
			driver.switchTo().defaultContent();
		}
		return -1;
	}

}
