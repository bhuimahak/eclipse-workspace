package module15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Dragabble_Droppable {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.jqueryui.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		int frames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frames);
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//*[@id='droppable']")).getText());
		WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement destination = driver.findElement(By.xpath("//*[@id='droppable']"));

		Actions builder = new Actions(driver);
		Action act = builder.dragAndDrop(source, destination).build();
		act.perform();
		System.out.println(driver.findElement(By.xpath("//*[@id='droppable']")).getText());

		driver.quit();

	}

}
