package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
			    
		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		
	    Object source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    System.out.println(source);	
         
	    
	    File dest= new File("D:\\Tushar\\fbimage.png");
	    FileHandler.copy((File) source, dest);

	}

}
