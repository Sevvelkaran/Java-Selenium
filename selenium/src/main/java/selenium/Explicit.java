package selenium;

import java.time.Duration;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v132.dom.DOM;
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait; 
public class Explicit {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5)); 

driver.manage().window().maximize();
driver.get("https://www.selenium.dev/selenium/web/dynamic.html");



WebElement reveal = driver.findElement(By.xpath("//input[@id='reveal']"));
reveal.click();

WebElement revlead = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='revealed']")));
revlead.sendKeys("Hello");
System.out.println(revlead.getDomAttribute("id"));

System.out.println(revlead.getDomProperty("value"));

}
}