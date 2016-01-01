package seleniumCode;


import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriverEx {

	public static void main(String[] args) {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("Mozilla");
		HtmlUnitDriver driver = new HtmlUnitDriver(cap);

	}

}
