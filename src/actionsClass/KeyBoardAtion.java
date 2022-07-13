package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAtion {

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
			
			 WebDriver driver= new ChromeDriver();
			
			 driver.get("https://vctcpune.com/selenium/practice.html");
			 Thread.sleep(2000);
			 
			 Actions act=new Actions(driver);

			 
		    WebElement textBox = driver.findElement(By.id("name"));
			 
			 act.sendKeys(textBox, "Welcome").perform();
			 
			 WebElement Dropdown = driver.findElement(By.id("dropdown-class-example"));
			
			// act.click(Dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
	}

}
