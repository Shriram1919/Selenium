package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameEg2 {

	     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
	    driver.get("https://chercher.tech/practice/frames");
	    
	    driver.switchTo().frame("frame1");
	    Thread.sleep(2000);
	    driver.findElement(By.tagName("input")).sendKeys("Selenium");
	    Thread.sleep(2000);
	    
	    driver.switchTo().frame("frame3"); 
        driver.findElement(By.id("a")).click();
        Thread.sleep(2000);
        
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frame2");
	    
	   WebElement dropdown = driver.findElement(By.id("animals"));
	   Thread.sleep(2000);
	   
	   Select s=new Select(dropdown);
	   
	   s.selectByVisibleText("Avatar");
	   Thread.sleep(4000);
	   
	   driver.switchTo().defaultContent();
	   String Text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
	   
	   System.out.println(Text);
	   
	   
	    
	    
	   
	}

}
