package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectMathod {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver= new ChromeDriver();
			
           driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(2000);
		WebElement Box=driver.findElement(By.name("checkBoxOption1"));
		 
          boolean CheckBox = Box.isSelected();
           
			System.out.println(CheckBox);
			
			Box.click();
			
			boolean ChechBox1 = Box.isSelected();
			
			System.out.println(ChechBox1);
           
           
	}
	

}
