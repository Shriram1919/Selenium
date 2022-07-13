package scrolling;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://vctcpune.com");
		 Thread.sleep(2000);

		 JavascriptExecutor j= ((JavascriptExecutor)driver);
		 //j.executeScript("Window.scrollBy(90,900)");

		 j.executeScript("window.scrollBy(80,900)");
			Thread.sleep(2000);
			j.executeScript("window.scrollBy(80,2000)");
		 
			Thread.sleep(2000);
			j.executeScript("window.scrollBy(80,500)");
			Thread.sleep(2000);
			j.executeScript("window.scrollBy(80,-2000)");
			
		 
		 
	}

}
