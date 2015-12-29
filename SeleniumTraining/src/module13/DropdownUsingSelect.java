package module13;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownUsingSelect {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.qtpselenium.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.cssSelector("div.banner_btn>button:nth-child(3)"));
		System.out.println(driver.getTitle());
		System.out.println(button.getText());	
		button.click();
		System.out.println(driver.getTitle());
		
		WebElement droplist = driver.findElement(By.cssSelector("select[class='form-control'][name='country_id']"));
		Select sel = new Select(droplist);
		System.out.println(sel.isMultiple());
		sel.selectByVisibleText("China");
		sel.selectByIndex(1);
		List<WebElement> options = sel.getAllSelectedOptions();
		for(WebElement e: options){
			System.out.println(e.getText());
		}
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getAbsolutePath());
	    FileUtils.copyFile(scrFile, new File("D:\\Study\\screenshot.jpg"));

		

	}

}
