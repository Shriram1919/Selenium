package serialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void MyMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://kite.zerodha.com/");
		 Reporter.log("MyMethod is running",true);
		 Thread.sleep(2000);
		 
	  
  }
}
