package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageTest {

	public static void main(String args[]) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("standard_user"+ ""+Keys.ENTER);
//		
//		WebElement search_box1 = driver.findElement(By.name("password"));
//		search_box1.sendKeys("secret_sauce"+Keys.ENTER);
		
		String CurrentUrL=driver.getCurrentUrl();
		String title=driver.getTitle();	

//		WebElement gmail_link = driver.findElement(By.linkText("Gmail"));
//		gmail_link.click();
//		WebElement addcart=driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
//		addcart.click();
//		Thread.sleep(1000);
//		driver.navigate().back();
		
	
		
		System.out.println("Title"+title);
		System.out.println("UrL"+CurrentUrL);
		Thread.sleep(2000);
	driver.close();
	}
}