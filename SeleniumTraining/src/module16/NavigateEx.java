package module16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class NavigateEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		MyListener activityCapture = new MyListener();
		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		event.register(activityCapture);
		
		
		
		event.manage().window().maximize();
		event.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		event.navigate().to("http://www.gmail.com");
		System.out.println(event.getTitle());
		
		event.findElement(By.xpath("//*[text()[contains(.,'Need help?')]]"));
		System.out.println("before navigating back");
		event.navigate().back();
		System.out.println(event.getTitle());
		
		//System.out.println("element found");
		
		

	}

}
