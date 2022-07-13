package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISEnableMethod {

	public static void main(String[] args) throws InterruptedException {
	
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver= new ChromeDriver();
			
			//5. isEnabled(): This method is use to verify element is enabled or disabled.
			
			driver.get("https://www.hotstar.com/in");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[text()='LOGIN']")).click();
			
			
	}	
	}


