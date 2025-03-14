package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        WebElement simple = driver.findElement(By.xpath("//button[@id='alertButton']"));
        simple.click();
        driver.switchTo().alert().accept();

        WebElement time = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        time.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement confirm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        confirm.click();
        driver.switchTo().alert().accept();

        WebElement type = driver.findElement(By.xpath("//button[@id='promtButton']"));
        type.click();
        wait.until(ExpectedConditions.alertIsPresent()); 

        driver.switchTo().alert().sendKeys("Hello"); 
        driver.switchTo().alert().accept(); 

        driver.quit();
    }
}
