package singelTonPattern;

import org.openqa.selenium.WebDriver;

/* 
 * Explanation: When you run LoadURL.java, you will see browser will be launched 
 * and URL will be opened in same browser. We have instantiated two instance 
 * of class SingletonBrowserClass, but both give the same instance of driver.
 *  
*/

public class LoadURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingeltonBrowserClass sbc1 = SingeltonBrowserClass.getInstanceOfSingletonBrowserClass();
		WebDriver driver1 = sbc1.getDriver();

		SingeltonBrowserClass sbc2 = SingeltonBrowserClass.getInstanceOfSingletonBrowserClass();
		WebDriver driver2 = sbc2.getDriver();
		driver2.get("https://www.google.com");

	}

}
