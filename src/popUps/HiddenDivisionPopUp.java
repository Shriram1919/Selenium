package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		

        System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 Thread.sleep(2000);
		 driver.get("https://www.flipkart.com/");
          
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 driver.findElement(By.name("q")).sendKeys("Laptop" );
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 

	}

}
