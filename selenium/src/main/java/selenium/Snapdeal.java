package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	
	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement banner = driver.findElement(By.cssSelector("div.banner-item"));
		if(banner.getText().equals("BOB CARD")) {
			banner.click();
		}
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		WebElement banner2 = driver.findElement(By.xpath("//div[@class='banner-item']"));
		if(banner2.getText().equals("India @100 : Envisioning Tomorrow’s Economic Powerhouse")) {
			banner2.click();
		}
		
		WebElement hover = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(hover).perform();
		hover.click();
		
		WebElement blog = driver.findElement(By.xpath("//a[@href='http://blog.snapdeal.com/']"));
		blog.click();
		
		driver.navigate().back();
		
		WebElement help = driver.findElement(By.xpath("//a[@href='/help']"));
		help.click();
		
		WebElement helpisdisplayed = driver.findElement(By.xpath("//*[@class='row banner_text']"));
		System.out.println(helpisdisplayed.isDisplayed());
		
		
		driver.navigate().back();


		WebElement cart = driver.findElement(By.xpath("//*[@class='cartInner']"));
		cart.click();
		System.out.println("cart "+cart.isDisplayed());
		
	
		
		
		WebElement search = driver.findElement(By.cssSelector("input#inputValEnter"));
		search.sendKeys("Men Fashion");
		
		WebElement searchbtn = driver.findElement(By.cssSelector("button.searchformButton"));
		System.out.println(searchbtn.isDisplayed());

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.quit();
	}
}
