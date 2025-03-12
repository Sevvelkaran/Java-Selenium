package selenium;

import java.time.Duration;
import java.util.List;
import java.lang.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://leafground.com/select.xhtml");
		WebElement UIA = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		org.openqa.selenium.support.ui.Select dd = new org.openqa.selenium.support.ui.Select(UIA);
		List<WebElement> l1 = dd.getOptions();
		System.out.println("The Drop down option size : "+l1.size());
		for(WebElement ls : l1) {
			System.out.println("The Drop down options are : "+ls.getText());
		}
		boolean multiple = dd.isMultiple(); 
		System.out.println("The Multiple Options are "+ multiple);
		dd.selectByIndex(2);
		dd.selectByVisibleText("Cypress");
		
		
	}

}
