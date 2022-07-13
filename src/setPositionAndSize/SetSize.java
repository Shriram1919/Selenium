package setPositionAndSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		

		 System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(1000);
		
		Dimension D=new Dimension(200, 400);
		
		driver.manage().window().setSize(D);
		
	}

}
