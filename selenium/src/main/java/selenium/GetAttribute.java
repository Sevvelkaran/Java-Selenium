package selenium;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetAttribute {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String plt = driver.findElement(By.partialLinkText("OrangeHRM")).getText();
        System.out.println("Text of the partial link: " + plt);

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();  
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();

                try {
            WebElement dashboard = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a"));
           // dashboard.click();
            if (dashboard.isDisplayed()) {
                System.out.println("Login Successful");
            }
        } catch (Exception e) {
            System.out.println("Login Failed");
        }

        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " + linkList.size());

        for (WebElement link : linkList) {
            System.out.println(link.getText() + " -> " + link.getDomAttribute("href"));
        }

        driver.quit();
    }
}
