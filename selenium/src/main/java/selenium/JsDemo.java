package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class JsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxOptions option = new  FirefoxOptions();
		option.addArguments("--headless");

		WebDriver driver = new FirefoxDriver(option);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver ;

		
	
		System.out.println(js.executeScript("return document.domain"));
		WebElement button = driver.findElement(By.className("gNO89b"));
		JavascriptExecutor(driver, button);

		driver.quit();
		
		
	}
	
	public static void JavascriptExecutor(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("document.getElementsByName('q')[0].value='Selenium'");
		js.executeScript("document.getElementsByClassName('gNO89b')[0].click()");

	}

}
