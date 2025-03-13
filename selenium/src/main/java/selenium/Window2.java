package selenium;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window handle: " + parentWindow);
        //driver.findElement(By.id("selenium143")).click();
        driver.findElement(By.linkText("Open a popup window")).click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Window Handle count: " + allWindowHandles.size());

        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to new window: " + windowHandle);

                    WebElement heading = driver.findElement(By.xpath("//h3"));
                    System.out.println("Pop : " + heading.getText());
         
                Thread.sleep(5000);

                driver.close();
                driver.switchTo().window(parentWindow);
                break;
            }
        }
         System.out.println("parent "+driver.getTitle());
        //driver.quit();
    }
}
