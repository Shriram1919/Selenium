package kiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://kite.zerodha.com/");
	     Thread.sleep(1000);
	     
	     WebElement UserID = driver.findElement(By.id("userid"));
	     WebElement Password = driver.findElement(By.id("password"));
	     WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	     
	     UserID.sendKeys("ELR321");
	     Password.sendKeys("Dhana1111");
	     LoginButton.click();
	     Thread.sleep(1000);
	     
	    WebElement Pin = driver.findElement(By.id("pin"));
	  WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
	  
	  Pin.sendKeys("982278");
	  Login.click();
	  Thread.sleep(1000);
	 WebElement UserName = driver.findElement(By.xpath("//span[@class='user-id']"));
	 String ActualID = UserName.getText();
	 String ExpectedID=("ELR321");
	 
	 if(ActualID.equals(ExpectedID))
	 {
		 System.out.println("Test Case Pass");
	 }
	 else
		 System.out.println("Teat Case Fail ");
	 
	 UserName.click();
	 driver.findElement(By.xpath("//a[@target='_self']")).click();
	 
	 driver.quit();
	
	 
	 
	 
	 
	 
	 
	 
	 
	}

	
		
	}


