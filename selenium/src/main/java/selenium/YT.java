package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class YT {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.youtube.com");
            driver.manage().window().maximize();
            Thread.sleep(3000);

            WebElement searchBox = driver.findElement(By.name("search_query"));
            searchBox.sendKeys("Selenium WebDriver Tutorial");
            searchBox.sendKeys(Keys.ENTER);
            Thread.sleep(3000);

            WebElement firstVideo = driver.findElement(By.xpath("//ytd-video-renderer[1]//a[@id='thumbnail']"));
            firstVideo.click();

            System.out.println("Video is playing...");
            Thread.sleep(10000);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}