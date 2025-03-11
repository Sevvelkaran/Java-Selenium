package selenium;

import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-popup-blocking");
        
        WebDriver driver = new ChromeDriver(options);
        options.addArguments("--disable-notifications");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.manage().window().maximize();
        driver.get("https://configureselenium.blogspot.com");
        
        WebElement name = driver.findElement(By.xpath("//li[@aria-hidden='false']//a[@href='https://configureselenium.blogspot.com/2020/11/selenium-tutorials.html'][contains(text(),'SELENIUM')]"));
        WebElement view1 = driver.findElement(By.xpath("//span[@class='counter-wrapper text-counter-wrapper']"));
        
        System.out.println("Before " + view1.getText());
        
        name.click();
        driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
          view1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='counter-wrapper text-counter-wrapper']")));
       // view1 = driver.findElement(By.xpath("//span[@class='counter-wrapper text-counter-wrapper']"));
		
          
        System.out.println("After " + view1.getText());
        
        //driver.quit();
    }
}
