package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exersice4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.manage().window().maximize();
		
		WebElement dd = driver.findElement(By.xpath("//input[@id='adder']"));
		dd.click();
		
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ddf = driver.findElement(By.xpath("//div[@class='redbox']"));
		System.out.println(ddf.getDomAttribute("class"));
		//ddf.click();

		driver.quit();
	}

}