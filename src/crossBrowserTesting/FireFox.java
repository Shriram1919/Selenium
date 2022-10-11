package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class FireFox {
	@Parameters("browserName")
	
  @Test 
  public void ff (String name)  {
	  
	  WebDriver driver = null;
	  if(name.equals("firefox"))
	  {
	     System.setProperty("webdriver.gecko.driver", "D:\\Tushar\\chromedriver_win32\\geckodriver.exe");
		
		  driver= new FirefoxDriver();
		
		
	  }
	  
	  else if(name.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
			
	        driver= new ChromeDriver();
			
		   
		
	  }
	  
	  driver.get("https://www.google.com");
  }
}
