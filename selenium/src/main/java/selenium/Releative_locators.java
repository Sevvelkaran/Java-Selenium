package selenium;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;
public class Releative_locators {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
//		WebElement lgbtn = driver.findElement(By.xpath("//button[text()='Register']/preceding-sibling::button[text()='Login']"));
//		
//		String lgbtnText = lgbtn.getText();
//		System.out.println(lgbtnText);
//		
//		WebElement submitbtn = driver.findElement(with(By.tagName("button")).toLeftOf(lgbtn));
//		
//		String subbtnText = submitbtn.getText();
//		System.out.println(subbtnText);
//		
//		WebElement reg = driver.findElement(with(By.tagName("button")).toRightOf(lgbtn));
//		
//		String regT = reg.getText();
//		System.out.println(regT);
		
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//label[text()='Username']"));
		WebElement usernamebox=driver.findElement(with(By.tagName("input")).below(username));
		usernamebox.sendKeys("Admin");
		System.out.println(usernamebox.getText());

		WebElement password=driver.findElement(By.xpath("//label[text()='Password']"));
		
	
		
		WebElement passwordbox=driver.findElement(with(By.tagName("input")).near(password));
		passwordbox.sendKeys("admin123");
		System.out.println(passwordbox.getText());

		Thread.sleep(3000);

		WebElement lg = driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement fp = driver.findElement(with(By.tagName("p")).below(lg));
		System.out.println(fp.getText());
		
		lg.click();
		Thread.sleep(3000);

		WebElement logout=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//i"));
		logout.click();
		Thread.sleep(3000);
		WebElement logdown=driver.findElement(with(By.xpath("//a[text()='Logout']")).below(logout));
		Thread.sleep(5000);
		
		
		//TakesScreenshot ts =(TakesScreenshot) driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(source, new File("/Users/sevvelkaranpalanivetrivel/Desktop/EXPLEO"+System.currentTimeMillis()+".png"));
		
		//FileHandler.copy(source, new File("/Users/sevvelkaranpalanivetrivel/Desktop/EXPLEO"+System.currentTimeMillis()+"png"));
		
		//System.out.println("Taken");
//		
//		try {
//			WebElement logo = driver.findElement(By.xpath("//img[@alt='client brand banner']"));
//			File source = ((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(source, new File("/Users/sevvelkaranpalanivetrivel/Desktop/EXPLEO"+System.currentTimeMillis()+".png"));
//			
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		
		logdown.click();
		
		driver.quit();

		
		//driver.quit();
	}

}
