package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class duckduckgo {
public static void main(String [] args) {
	
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://duckduckgo.com/");
	driver.manage().window().maximize();
	
	WebElement title = driver.findElement(By.xpath("//*[@class = 'homepage-cta-section_title__yh7tH heading_heading2__WFJ4M heading_heading__yebkp']"));
	
	if(title.isDisplayed()) {
		System.out.println("Web page is Verified");
	}
	else {
		System.out.println("Web page is not verified");
	}
	
	WebElement searchBox = driver.findElement(By.xpath("//div[@class='searchbox_searchbox__bfbmv']"));
	if(searchBox.isDisplayed()){
		System.out.println("Searchbox is present");
	}
	else {
		System.out.println("not present");
	}
	
	WebElement searchBox1 = driver.findElement(By.xpath("//div[@class='searchbox_searchbox__bfbmv']"));
	System.out.println(searchBox1.isEnabled()); 
	
	WebElement searchBox2 = driver.findElement(By.xpath("//*[@name='q']"));
	searchBox2.sendKeys("Pokemon"+Keys.ENTER); 
	
	WebElement Findpage = driver.findElement(By.xpath("//span[@class='module__header__label']"));
	if(Findpage.isDisplayed()) {
		System.out.println("Displayed");
	}
	else {
		System.out.println("not displayed");
	}
	
	driver.close();
}
}
