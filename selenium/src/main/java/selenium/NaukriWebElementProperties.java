package selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NaukriWebElementProperties {

	public static void main(String [] args) throws IOException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement element = driver.findElement(By.xpath("//a[@class='nav-a']"));
		String test = element.getText();
		System.out.println("Text : "+test);
		
		String attribute = element.getDomAttribute("href");
		System.out.println("Href attributes : "+attribute);
//		
	 	String color = element.getCssValue("color");
		System.out.println("CSS Color:"+color);
//		
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
//		
		System.out.println("Location: X="+x+", Y="+y);
//		
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		System.out.println("Size: width="+width+", Height="+height);
////		try {
//			WebElement searchbutton=driver.findElement(By.cssSelector("input.nav-cart-icon nav-sprite"));
//			System.out.println("\n[2] search button");
//			System.out.println("Enabled:"+searchbutton.isEnabled());
//			System.out.println("displayed:"+searchbutton.isDisplayed());
//		}catch(Exception e) {
//			System.out.println(e);
//		}		
		
		TakesScreenshot sch;
		sch= ((TakesScreenshot)driver);
		File src=sch.getScreenshotAs(OutputType.FILE);
		File dest=new File("Screenshot.png");
		FileHandler.copy(src,dest);

		Robot robot=new Robot();
		Dimension scr_size=Toolkit.getDefaultToolkit().getScreenSize();
		Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(scr_size);
		BufferedImage img=robot.createScreenCapture(rect);
		//File dest=new File("screenshot1.png");
		ImageIO.write(img, "png", dest);
		driver.quit();


		
		
		
	}
}
