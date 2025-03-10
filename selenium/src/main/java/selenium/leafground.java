package selenium;

import java.awt.Desktop.Action;

import javax.lang.model.element.Element;

import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class leafground {

	
	public static void main (String [] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		WebElement search_box = driver.findElement(By.name("j_idt88:name"));
		search_box.sendKeys("Sevvelkaran"+ ""+Keys.ENTER);
		
		WebElement desabled = driver.findElement(By.name("j_idt88:j_idt93"));
		System.out.println(desabled.isEnabled());
		

		//
		
		WebElement search_box1 = driver.findElement(By.name("j_idt88:j_idt91"));
		search_box1.sendKeys(Keys.COMMAND+"a"+Keys.BACK_SPACE);
		search_box1.sendKeys("INDIA"+Keys.ENTER);
		
		WebElement search_box3 = driver.findElement(By.name("j_idt88:j_idt95"));
		search_box3.clear();
		

		WebElement search_boxe = driver.findElement(By.name("j_idt88:j_idt99"));
		search_boxe.sendKeys("2@gmail.com"+ ""+Keys.TAB);
		
		WebElement TAY = driver.findElement(By.name("j_idt88:j_idt101"));
		TAY.sendKeys("a para about it"+Keys.ENTER);
		
		
		WebElement Enter = driver.findElement(By.name("j_idt106:thisform:age"));
		Enter.sendKeys(Keys.ENTER);
		//System.out.println(Enter.isEnabled());


	
		WebElement dob = driver.findElement(By.name("j_idt106:j_idt116_input"));
		dob.sendKeys("03/07/2003"+Keys.TAB);
		
		WebElement cs = driver.findElement(By.name("j_idt106:j_idt118_input"));
		cs.sendKeys("1"+Keys.ENTER);
		
		WebElement cs1 = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt118\"]/a[1]"));
		cs1.click();
		
	
		
		WebElement s2 = driver.findElement(By.name("j_idt106:j_idt116_input"));
		s2.sendKeys("1"+Keys.TAB);
		
		WebElement s3 = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt120\"]/span"));
		for (int i = 1; i <= 15 ; i++) {
            s3.sendKeys(Keys.ARROW_RIGHT);
        }
		
		WebElement key = driver.findElement(By.name("j_idt106:j_idt122"));
		key.click();
		System.out.println(key.isDisplayed());
		
		Thread.sleep(3000);
		
	//driver.close();
		
	}
}
