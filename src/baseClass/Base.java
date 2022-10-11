package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	protected WebDriver driver;
	
	public void StarBrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
	     driver.get("https://kite.zerodha.com/");
		 
	}
}
