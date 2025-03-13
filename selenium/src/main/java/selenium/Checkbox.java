package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Checkbox {

	
	public static void main(String [] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/checkbox.xhtml");
		
		WebElement cb = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
	cb.click();
	System.out.println(cb.isEnabled());
	driver.quit();
	
	}
}
