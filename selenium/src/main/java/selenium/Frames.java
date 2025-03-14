package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/frames");
		
		
		WebElement iframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframe);
		
		String Frame_1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by Locator : "+Frame_1);
		
		driver.switchTo().defaultContent();
		String mainPage = driver.findElement(By.xpath("//*[@id='framesWrapper']/h1")).getText();
		System.out.println("Back to main Page : "+mainPage);
		
		driver.switchTo().frame(2);
		String Frame_2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Swith by Index : "+Frame_2);
		
		driver.quit();
		
	}

}
