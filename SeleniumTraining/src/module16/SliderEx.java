package module16;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SliderEx {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		WebDriver driver = new FirefoxDriver(profile);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/slider/");
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		System.out.println(slider.getAttribute("class"));
		int x = slider.getLocation().x;
		//int y = slider.getLocation().y;
		
		Actions builder = new Actions(driver);
		//builder.dragAndDropBy(slider, 50, 0);
//		Action act = builder.dragAndDropBy(slider, 50, 0).build();
		Action act = builder.clickAndHold(slider).moveByOffset(50, 0).release().build();

		act.perform();
	}

}
