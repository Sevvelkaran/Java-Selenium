package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://leafground.com/window.xhtml;jsessionid=node018rbb6lehc9i111lxwg546fde38926540.node0");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window handle: " + parentWindow);

        WebElement open = driver.findElement(By.xpath("//span[text()='Open']"));
        open.click();

        Set<String> allWindows = driver.getWindowHandles();

        if (allWindows.size() > 1) {
            System.out.println("New window has opened successfully.");
        } else {
            System.out.println("No new window opened.");
        }

        driver.quit();
    }
}
