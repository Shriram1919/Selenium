package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.browser.Browser.GetWindowForTargetResponse;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {

		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://skpatro.github.io/demo/links/");
		 Thread.sleep(2000);
//		String mainPageID = driver.getWindowHandle();    //ID of Main Page
//		{
//			System.out.println(mainPageID);
//		}
//	
//		System.out.println("============================================");
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> allPageID = driver.getWindowHandles();
		
		Iterator<String> It = allPageID.iterator();
//		while(It.hasNext())
//		{
//			System.out.println(It.next());
//		}
		
	       String MainPage = It.next();
	       String ChildBrowser = It.next();
		
		driver.switchTo().window(ChildBrowser);
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
	    
	    
		
		//driver.close();
		//driver.quit();
		
	    driver.switchTo().window(MainPage);
	   WebElement Text = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
	    System.out.println(Text.getText());
		
		
		
		
		
		
		
		
		
		
	}
	

}
                                                        