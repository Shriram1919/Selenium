package setPositionAndSize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;


public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		
		
		
			 System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
				
			 WebDriver driver= new ChromeDriver();
			
			 driver.get("https://www.facebook.com/");
			 
			 System.out.println(driver.manage().window().getPosition());
			 Thread.sleep(2000);
			
			 Point Pt=new Point(50, 80);
			 
			 driver.manage().window().setPosition(Pt);
			 
	}
	
}
