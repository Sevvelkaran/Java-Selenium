package selenium;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leaf2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://leafground.com/select.xhtml");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement dropbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='j_idt87:country_label']")));
        dropbtn.click();

        WebElement dropdownList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='j_idt87:country_items']")));
        List<WebElement> options = dropdownList.findElements(By.tagName("li"));

        for (WebElement option : options) {
            if (option.getText().contains("Brazil")) { 
                option.click();
                System.out.println("Clicked: " + option.getText());
                break;
            }
        }

        WebElement cityDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[2]")));
        cityDropdown.click();

        WebElement cityDropdownList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='j_idt87:city_items']")));
        List<WebElement> cityOptions = cityDropdownList.findElements(By.tagName("li"));

        for (WebElement option1 : cityOptions) {
            if (option1.getText().contains("Sao Paulo")) { 
                option1.click();
                System.out.println("Clicked: " + option1.getText());
                break;
            }
        }

        driver.quit();
    }
}
