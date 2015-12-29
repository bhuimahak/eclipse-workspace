package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@SuppressWarnings("unused")
public class Sel  {
	
	
    public static void main(String[] args) {
    	
    	String browser = "Chrome"; //read from xml or other sources DYNAMIC INITIALIZATION 
    	
    	WebDriver driver = null;
    	
    	if(browser.equals("Mozilla"))
    		driver = new FirefoxDriver();
    	if(browser.equals("Chrome")) {
    		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\chromedriver\\chromedriver.exe");
    		driver = new ChromeDriver();
    	}
    	
    	
    	
    	driver.get("http://gmail.com");
    	
    	//to run your code in chrome browser,first download the chrome driver from the internet and copy the exe file under this project in a folder
    	//String path = System.getProperty("user.dir") ; // gives current path of the project
    	//System.out.println(path);
    	//System.setProperty("webdriver.chrome.driver",path +"\\chromedriver\\chromedriver.exe");
    	
    	//ChromeDriver d2 = new ChromeDriver();
    	//driver.get("http://yahoo.com") ;
    	System.out.println(driver.getTitle());
    }
}