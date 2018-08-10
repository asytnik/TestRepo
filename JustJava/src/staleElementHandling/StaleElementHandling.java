package staleElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/sqa-user/Selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		// Open URL
		driver.get("https://github.com/login");
		
		// locate and type username
		WebElement username= driver.findElement(By.id("login_field"));
		username.sendKeys("amod");
		
		// locate and type password
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("amod");
		
		// locate and click on submit
		WebElement sub= driver.findElement(By.xpath("//input[@value='Sign in']"));
		sub.click();
		
		Thread.sleep(5000);
		
		// again type username
		username.sendKeys("amod");
		
	}
}