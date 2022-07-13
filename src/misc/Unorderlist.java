package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unorderlist {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://www.google.co.in/");

		 Thread.sleep(1000);


		 driver.findElement(By.name("q")).sendKeys("honda");
		 Thread.sleep(1000);
		 
		 List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		 System.out.println(searchResult.size());
		
		 for( WebElement result :searchResult)
		 {
			 System.out.println(result.getText());
		 }
				 
		 for(WebElement Result:searchResult)
		 {
			 String ActualText = Result.getText();
			 String ExpectedText="honda amaze";
			 
			 if(ActualText.equals(ExpectedText))
			 {
				 Result.click();
				 break;
			 }
			 
		 }
		
		 
	}
}
