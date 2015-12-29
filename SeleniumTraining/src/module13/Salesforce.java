package module13;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Salesforce {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='button-login']")).click();
		driver.getTitle();
		
		//loginpage
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("bhuimahak@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vik@405805");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		System.out.println("Login success");
		System.out.println("Title of this page is " + driver.getTitle());
		
		//recently view page
		driver.findElement(By.xpath("//*[@id='actionCard_Lead']/a/div/div[2]/div")).click();
		driver.findElement(By.cssSelector("a.forceActionLink")).click();
		
		//check the text "Create lead"
		System.out.println(driver.findElement(By.cssSelector("div.modal-header h2")).getText());
		
		//fill out form for new lead------
		
		//select lead status
		WebElement droplist =driver.findElement(By.cssSelector("select.select[id^='40'][class*='select']"));
		Select leadStatus = new Select(droplist);
		leadStatus.selectByVisibleText("Working");
		
		//selecting salutation
		WebElement salutatio = driver.findElement(By.cssSelector("select[id^='82'][class*='compoundTLRadius']"));
		Select salutation = new Select(salutatio);
		salutation.selectByVisibleText("Ms.");
		
		//enter first name
		driver.findElement(By.xpath("//input[@placeholder ='First Name']")).sendKeys("Vikram");
		
		//enter last name
		driver.findElement(By.xpath("//input[@placeholder='Last Name (required)']")).sendKeys("Jeet");
		
		//enter Company
		driver.findElement(By.cssSelector("input[id^='174'][maxlength='255']")).sendKeys("Accenture");
		
		//click on save
		driver.findElement(By.cssSelector("div[class*='forceModalActionContainer--footerAction']>button:nth-child(2)")).click();
		
		
		System.out.println("form filled");
		System.out.println(driver.getTitle());
		
		String leadName = driver.findElement(By.cssSelector("div.col>h1")).getText();
		
		//verify lead name
		if("Ms. Vikram Jeet".equals(leadName)){
			System.out.println("test successfull");
		}

	}

}
