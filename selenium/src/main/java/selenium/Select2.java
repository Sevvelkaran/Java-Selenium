package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class Select2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//select")).click();
		List<WebElement> allOptions=driver.findElements(By.cssSelector("select option"));
		System.out.println("Options size: "+allOptions.size());
		String option="Lowest to highest";
		for(int i=0;i<allOptions.size();i++) {
			if(allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				System.out.println("Clicked");
				break;
			}
		}

	}

}
