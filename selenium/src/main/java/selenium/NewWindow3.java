package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 


public class NewWindow3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5)); 

	        driver.get("https://leafground.com/window.xhtml");
	        
	        String parentWindow = driver.getWindowHandle();
	        System.out.println("Parent window handle: " + parentWindow);
	        
	        WebElement revlead = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Open with delay']")));
	        revlead.click();
		
	}

}
