package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		WebElement mail = driver.findElement(By.id("input-email"));
		
		
		flashElement(driver,mail);
		driver.quit();
	}
	public static void flashElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String orgclr = element.getCssValue("backgroundColor");
		
		for(int i =0;i<3;i++) {
			js.executeScript("arguments[0].style.backgroundColor='red';",element);
			
		}
		try {
			Thread.sleep(3000);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		js.executeScript("arguments[0].style.backgroundColor ='"+orgclr+"';", element);
		
	}

}
