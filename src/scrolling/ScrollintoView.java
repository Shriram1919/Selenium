package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoView {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://vctcpune.com");
		 Thread.sleep(2000);

		 
		 WebElement Ref = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		 JavascriptExecutor j= ((JavascriptExecutor)driver);
		 Thread.sleep(2000);
		 j.executeAsyncScript("arguments[0].scrollIntoView(true);",Ref);
		 
		 
	}

}
