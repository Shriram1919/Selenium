package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodUSE {

	public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		
		//1. get-->to enter url in browser or to open an application.
		
		driver.get("https://vctcpune.com/");
		
		
		
		
		//2.close-->to close the current tab of the browser opened by Selenium tool
		//driver.close();
		
		//3.quit: to close the all the tabs present in browser opened by Selenium tool.
		//driver.quit();
		
		
		//4. maximize/ minimize() - used to maximize/ minimize the browse

		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		
		//5. navigate: this method is use to open an application, move forward, backward & refresh the webpage.

//		Thread.sleep(4000);
//		driver.navigate().to("https://www.google.com/");
//		Thread.sleep(4000);
//		driver.navigate().back();
//		Thread.sleep(4000);
//		driver.navigate().forward();
//		Thread.sleep(4000);
//	    driver.navigate().refresh();
	    
		
		//6. getTitle: this method is use to get title of a webpage. return type of getTitle method is String
		
	//	System.out.println(driver.getTitle());
	//String Title = driver.getTitle();
		//System.out.println(Title);
		
		
		//7. getCurrentURL: this method is use to get URL of a webpage. return type of getCurrentURL method is String

			//System.out.println(driver.getCurrentUrl());	
				
				
				
		
	}
	

}

