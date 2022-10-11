package introduction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCode {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com/");
		
		
	}

}
