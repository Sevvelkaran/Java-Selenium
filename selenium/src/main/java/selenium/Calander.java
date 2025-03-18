package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calander {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement dp = driver.findElement(By.xpath("//input[@id='datepicker']"));
		dp.click();
		
		String CurrentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String CurrentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		
	}

}
