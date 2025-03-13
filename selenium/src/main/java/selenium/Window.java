package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window : "+parentWindow);
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("Size : "+allwindows.size());
		
		driver.findElement(By.id("windowButton")).click();
		Set<String> newAllWindowhandles=driver.getWindowHandles();
		
		System.out.println("New count of window: "+newAllWindowhandles.size());
		String Parenthandle=driver.getWindowHandle();
		
		System.out.println("Parent window : "+Parenthandle);
		
		Iterator<String> iterator=newAllWindowhandles.iterator();
		String mainWindow=iterator.next();
		String childWindow=iterator.next();
		System.out.println("Parent window : "+mainWindow);
		System.out.println("Child window : "+childWindow);
		
		driver.switchTo().window(childWindow);
		WebElement child = driver.findElement(By.id("sampleHeading"));
		System.out.println("Child_Title : "+child.getText());
		driver.close();
		driver.switchTo().window(Parenthandle);
		System.out.println("Parent_Title : "+driver.getTitle());
		
		
		driver.quit();
	}

}
