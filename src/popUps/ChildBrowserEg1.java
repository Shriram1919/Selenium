package popUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserEg1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://skpatro.github.io/demo/links/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("NewWindow")).click();
			Thread.sleep(2000);
			
			Set<String> AllPageID = driver.getWindowHandles();
			
			
			
	}

}
