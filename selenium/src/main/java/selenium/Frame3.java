package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.get("https://leafground.com/frame.xhtml");
	        
	        List<WebElement> nos = driver.findElements(By.tagName("iframe"));
	        System.out.println("Total frames on the page: " + nos.size());;
	}

}
