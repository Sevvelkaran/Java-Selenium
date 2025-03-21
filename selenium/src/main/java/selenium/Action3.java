package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement box1 = driver.findElement(By.id("box1"));
		WebElement box2 = driver.findElement(By.id("box101"));

		//action.clickAndHold(box1).moveToElement(box2).release().build().perform();
		action.dragAndDropBy(box2, 102, 42);
		
		String ac = box2.getCssValue("background-color");
		String ec = "rgba(226, 235, 237, 1)";
		
		if(ac.equals(ec)) {
			System.out.println("Match");
			System.out.println("Actual : "+ac);
			System.out.println("Expecteed : "+ec);
		}
		else {
			System.out.println("Nope");
			System.out.println("Actual : "+ac);
			System.out.println("Expecteed : "+ec);
		
		}
	

}
}
