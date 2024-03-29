package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver= new ChromeDriver();
		
		 driver.get(("https://demo.guru99.com/test/drag_drop.html"));
		 Thread.sleep(2000);
		 
		 Actions act=new Actions(driver);
		
		WebElement Source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]")); 
		 WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		 
		 act.dragAndDrop(Source, destination).perform();
	}

}
