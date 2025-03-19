package selenium;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table3 {

    public static void main(String[] args) {
        
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("cd@gmail.com" + Keys.ENTER);
        
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("12345678" + Keys.ENTER);
        
        WebElement button = driver.findElement(By.id("submit"));
        button.click();
        
        
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> rows = driver.findElements(By.xpath("//tr[@class='contactTableBodyRow']"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + " ");
            }
            System.out.println();
        }

        driver.quit(); 
    }
}
