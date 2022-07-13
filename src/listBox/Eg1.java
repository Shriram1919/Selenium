package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
			
			 WebDriver driver= new ChromeDriver();
			
			 driver.get("https://www.facebook.com/");
		
			 driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			 Thread.sleep(4000);
			 
			 driver.findElement(By.name("firstname")).sendKeys("Shriram");
			 Thread.sleep(4000);
			 driver.findElement(By.name("lastname")).sendKeys("Kadam");
			 Thread.sleep(4000);
			 driver.findElement(By.name("reg_email__")).sendKeys("9370310574");
			 Thread.sleep(4000);
			 driver.findElement(By.name("reg_passwd__")).sendKeys("Tushar@12");
			 
			 
			WebElement Date = driver.findElement(By.name("birthday_day"));
			
			Select s=new Select(Date);
			s.selectByIndex(27);
			Thread.sleep(4000);
			
			WebElement Month = driver.findElement(By.name("birthday_month"));
			
			Select a=new Select(Month);
			
			a.selectByVisibleText("May");
			Thread.sleep(4000);
			
			WebElement Year = driver.findElement(By.name("birthday_year"));
			
		   Select b=new Select(Year);
		  
			b.selectByVisibleText("1997");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//label[text()='Male']")).click();
			
		   
	}

}
