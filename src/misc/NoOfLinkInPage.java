package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinkInPage {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://vctcpune.com/selenium/practice.html");

		 Thread.sleep(2000);
		  List<WebElement> link = driver.findElements(By.tagName("a"));
		 
		 System.out.println(link.size());
		 
		 Iterator<WebElement> itr = link.iterator();	
		 
//		 while(itr.hasNext())
//		 {
		 
//			 System.out.println(itr.next().getText());
//		 }
//		 
		 for(WebElement AL:link)
		 {
			System.out.println(AL.getText()); 
		 }
		 
		 
	}

}
