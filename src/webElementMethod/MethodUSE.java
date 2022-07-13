package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodUSE {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver= new ChromeDriver();
			
			
			//1. Sendkeys():  This method is use to enter value in the input/text field
			

		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Velocity");
		
		//driver.findElement(By.name("enter-name")).sendKeys("Velocity");

		
		//2. Clear():This method is use to clear value in the text field.
		
		//driver.findElement(By.name("enter-name")).clear();
		
		//3. Click(): Click method is use to click on buttons, links also use to select radio buttons & checkboxes
		
		//4. getText:  This method is use to get text present in a webpage. Return type of getText function is String.

		//System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText());

		//5. isEnabled(): This method is use to verify element is enabled or disabled.
		
		
		
	}

}
