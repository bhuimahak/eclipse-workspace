package module13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownHandling {

	public static void main(String[] args) {
		
//select an element from drop down, total no, print elems, print selected elements
		
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.qtpselenium.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement button = driver.findElement(By.cssSelector("div.banner_btn>button:nth-child(3)"));
	System.out.println(driver.getTitle());
	System.out.println(button.getText());	
	button.click();
	System.out.println(driver.getTitle());
	
	WebElement droplist = driver.findElement(By.cssSelector("select[class='form-control'][name='country_id']"));
	List<WebElement> options = droplist.findElements(By.tagName("option"));
	System.out.println("Total number of countries are" +options.size());
	
	droplist.sendKeys("China");
	
	//droplist.findElement(By.)
	for(WebElement option:options){
//		String attribute = option.getAttribute("selected");
//		if(attribute != null && attribute.equals("true")){
//			System.out.println(option.getText());
//		}
		
		if("true".equals(option.getAttribute("selected"))){
			System.out.println(option.getText());
		}
		
//		System.out.println(option.getText() + " and " + option.getAttribute("selected") );
	}
	System.out.println("***************************");
	
	System.out.println("here");
	//driver.close();
		
		
		
		
	}

}
