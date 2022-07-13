package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException {

	 System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 Thread.sleep(2000);
		 
		 Actions act=new Actions(driver);
		 
		WebElement clickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(clickButton).perform();
		Thread.sleep(1000);
		
		WebElement seleniumButton = driver.findElement(By.xpath("//a[text()='Insurance Project']"));
		
		act.click(seleniumButton).perform();
		Thread.sleep(1000);
		WebElement DoubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(DoubleClickButton).perform();
		
		
		
		
		
		
		
		
	}

}