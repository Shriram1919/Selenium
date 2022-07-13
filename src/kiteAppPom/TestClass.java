package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
	     Thread.sleep(2000);
	     
	     KiteLoginPage KL=new KiteLoginPage(driver);
	     KL.UN();
	     KL.Pass();
	     KL.click();
	     Thread.sleep(2000);
	     KitePinPage KP=new KitePinPage(driver);
	     KP.PinPage();
	     KP.ContinueButton();
	     Thread.sleep(2000);
	     KiteHomePage KH=new KiteHomePage(driver);
	     KH.UserIDButton();
	     KH.logOut();
	     

	}

}
