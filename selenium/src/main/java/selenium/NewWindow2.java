package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://leafground.com/window.xhtml");
        
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window handle: " + parentWindow);

        WebElement open = driver.findElement(By.xpath("//span[text()='Close Windows']"));
        open.click();

        Set<String> allWindows = driver.getWindowHandles();
        
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                driver.close();  
            }
        }

        driver.switchTo().window(parentWindow);


    }
}
