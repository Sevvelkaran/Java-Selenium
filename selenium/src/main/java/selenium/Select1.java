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

public class Select1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		WebElement dd = driver.findElement(By.xpath("//select[@id = 'multi']"));
		Select obj = new Select(dd);
		List<WebElement> l1 = obj.getOptions();
		for(WebElement ls : l1) {
		System.out.println("The dropdown is : "+ls.getText());
		}
		boolean multiple = obj.isMultiple(); 
		obj.selectByVisibleText("Eggs");
		obj.selectByVisibleText("Onion gravy");
		
		List<WebElement> l2 = obj.getAllSelectedOptions();
		for(WebElement lss : l2) {
			System.out.println(lss.getText());
		}

		obj.deselectByIndex(1);
		obj.deselectAll();
		
		List<WebElement> options = obj.getOptions();
		List<String> optionTextList = new ArrayList<>();
		for(WebElement option1 : options) {
			optionTextList.add(option1.getText());
		}
		
		Collections.sort(optionTextList);
		System.out.println(optionTextList);
		
		driver.quit();

	}
	

}
