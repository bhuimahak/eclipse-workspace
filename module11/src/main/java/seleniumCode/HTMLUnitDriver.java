package seleniumCode;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriver {

	public static void main(String[] args) {

HtmlUnitDriver driver = new HtmlUnitDriver();
driver.get("http://www.google.com");
driver.quit();

	}

}
