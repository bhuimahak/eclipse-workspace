package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebDriverListenerEx extends AbstractWebDriverEventListener {

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("WebDriverListener: beforeNavigateTo");
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("WebDriverListener: afterNavigateTo");
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("WebDriverListener: beforeNavigateBack");
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("WebDriverListener: afterNavigateBack");
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("WebDriverListener: beforeNavigateForward");
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("WebDriverListener: afterNavigateForward");
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("WebDriverListener: beforeFindBy");
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("WebDriverListener: afterFindBy");
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("WebDriverListener: beforeClickOn");
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("WebDriverListener: afterClickOn");
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("WebDriverListener: beforeChangeValueOf");
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("WebDriverListener: afterChangeValueOf");
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		System.out.println("WebDriverListener: beforeScript");
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		System.out.println("WebDriverListener: afterScript");
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("WebDriverListener: onException");
	}

}
