package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		

        System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 Thread.sleep(2000);
		 driver.get("https://demoqa.com/alerts");
		 
		 driver.findElement(By.id("alertButton")).click();
		 Thread.sleep(2000);
		Alert Button = driver.switchTo().alert();

		Button.accept();
	}

}
