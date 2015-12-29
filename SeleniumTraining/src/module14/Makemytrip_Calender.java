package module14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Makemytrip_Calender {

	static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@id='start_date_sec']/span[2]")).click();
		
		String dateToBeSelected = "06/01/2016";
		boolean isSelected = selectDate(dateToBeSelected);
		if(isSelected) {
			System.out.println("yay!! Date is selected");
		}
		else {
			System.out.println("Couldn't select the date.");
		}

	}

	public static boolean selectDate(String dateToBeSelected) {
		boolean isFound = false;
		//DateCompare comparison = new DateCompare();
		String dateDisplayed = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/div/div")).getText();
		System.out.println("Date displayed on the calendar is: " + dateDisplayed);
		while (true) {
			try {
				System.out.println("in while");
				int value = DateCompare.compareDate(dateDisplayed, dateToBeSelected);
				if(value < 0){
					//move forward
					System.out.println("Displayed month is smaller than date to be selected.. So moving forward  ");
					driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[3]/div/a/span")).click();
				}
				else if(value > 0){
					//move backward
					System.out.println("Displayed month is greater than date to be selected.. So moving backward ");
					WebElement e = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/div/a"));
					String cssClass = e.getAttribute("class");
					System.out.println("Back button CSS Class: " + cssClass);
					if(e.isEnabled() && !cssClass.contains("disabled")){
						e.click();
					}
					else{
						System.out.println("Element is disabled");
						break;
					}
				}
				else if(value == 0){
					System.out.println("Current month is displayed i.e. 'value == 0'");
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					Date d = sdf.parse(dateToBeSelected);
					String day = new SimpleDateFormat("d").format(d);
					System.out.println("Day: " + day);
					
					String xpath = "//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr/td/a[text()='" + day + "']";
					//or
					//String xpath = "//a[text()='" + day + "']";
					
					driver.findElement(By.xpath(xpath)).click();
					isFound = true;
					break;
				}
				dateDisplayed = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/div/div")).getText();
				System.out.println("Date Displayed" + dateDisplayed);
								
			} catch (ParseException e) {
				e.printStackTrace();
			}			
		}
		return isFound;
	}
}
