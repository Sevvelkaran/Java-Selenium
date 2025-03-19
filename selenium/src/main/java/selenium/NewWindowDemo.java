package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewWindowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window();
		
		driver.get("https://www.bing.com/");
		System.out.println("Bing has been openend");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com");
		System.out.println("Opned");
	}

}
