package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node01vfwadk6jqlug1u4diaejchtb28930035.node0");
		WebElement ifr = driver.findElement(By.xpath("//iframe[@src=\"default.xhtml\"]"));
		driver.switchTo().frame(ifr);		
		WebElement clickme = driver.findElement(By.id("Click"));
		clickme.click();
		driver.switchTo().defaultContent();
		
		driver.quit();
	}

}
