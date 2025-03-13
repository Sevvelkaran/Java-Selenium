package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement blogsmenu = driver.findElement(By.id("blogsmenu"));
		Actions action = new Actions(driver);
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		action.doubleClick(search).perform();
		
	}

}
