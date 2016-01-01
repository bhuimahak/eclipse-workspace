package seleniumCode;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesEx {

	public static void main(String[] args) {
		Proxy pro = new Proxy();
		pro.setProxyAutoconfigUrl("https://www.proxysite.com/");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, pro);
		WebDriver driver = new FirefoxDriver(cap);
		// now the browser will launch with the desired capability i.e this url will be set in the browser session.

	}

}
