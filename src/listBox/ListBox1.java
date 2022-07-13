package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		
		
         System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 //driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
		
		Select s= new Select(dropdown);
		
		Thread.sleep(2000);
		s.selectByVisibleText("Option2");
		Thread.sleep(2000);
		s.selectByValue("option3");
		Thread.sleep(2000);
		s.selectByIndex(1);
		
	}

}
