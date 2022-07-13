package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Demo() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 Thread.sleep(2000);
		 
		 Reporter.log("Hi",true);
  }
}

