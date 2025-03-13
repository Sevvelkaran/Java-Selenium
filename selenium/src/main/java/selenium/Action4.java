package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions action = new Actions(driver);
		
		WebElement jqueryurllink = driver.findElement(By.linkText("jqueryui"));
		action.keyDown(Keys.CONTROL).moveToElement(jqueryurllink).click().keyUp(Keys.CONTROL).build().perform();
		
		//driver.quit();
	}

}
