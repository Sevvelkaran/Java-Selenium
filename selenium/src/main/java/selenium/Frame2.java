package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://leafground.com/frame.xhtml");

        WebElement f1 = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
        driver.switchTo().frame(f1);

        WebElement f2 = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(f2);

        WebElement Click = driver.findElement(By.id("Click"));
        Click.click();

        driver.switchTo().defaultContent();
        driver.quit();
    }
}
