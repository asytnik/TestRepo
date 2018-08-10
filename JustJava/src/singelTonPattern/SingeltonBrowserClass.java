package singelTonPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingeltonBrowserClass {

	// instance of singleton class
	private static SingeltonBrowserClass instanceOfSingletonBrowserClass = null;

	private WebDriver driver;

	// Constructor
	private SingeltonBrowserClass() {
		System.setProperty("webdriver.chrome.driver", "/home/sqa-user/Selenium/chromedriver");
		driver = new ChromeDriver();
	}

	// TO create instance of class
	public static SingeltonBrowserClass getInstanceOfSingletonBrowserClass() {
		if (instanceOfSingletonBrowserClass == null) {
			instanceOfSingletonBrowserClass = new SingeltonBrowserClass();
		}
		return instanceOfSingletonBrowserClass;
	}

	// To get driver
	public WebDriver getDriver() {
		return driver;
	}

}