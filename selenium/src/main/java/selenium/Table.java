package selenium;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        List<WebElement> tbody = driver.findElements(By.tagName("thead"));
        for (int i = 0; i < tbody.size(); i++) {
            System.out.println(tbody.get(i).getText());
        }

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
        for (int j = 0; j < rows.size(); j++) {
            List<WebElement> cells = rows.get(j).findElements(By.tagName("td"));
            for (int k = 0; k < cells.size(); k++) {
                System.out.print(cells.get(k).getText() + " ");
            }
            System.out.println();
        }

        driver.quit();
    }
}
