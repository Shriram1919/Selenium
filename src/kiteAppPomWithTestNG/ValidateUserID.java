package kiteAppPomWithTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserID {
   
	WebDriver driver;
	
	KiteLoginPage login;
	KitePinPage Pin;
    KiteHomePage Home;
    Sheet MySheet;
    
    @BeforeClass
	public void launchingBrowser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
	     driver.get("https://kite.zerodha.com/");
		 Thread.sleep(2000);
		 File MyFile =new File("D:\\Tushar\\19thMarch.xlsx");
	 	 MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
	 	 login =new KiteLoginPage(driver);
	 	 Pin =new KitePinPage(driver);
	 	 Home =new KiteHomePage(driver);
	 	 
	}
	@BeforeMethod
	public void logintoKiteApp() throws InterruptedException
	{
		String USERNAME= MySheet.getRow(1).getCell(0).getStringCellValue();
        String PASSWORD = MySheet.getRow(1).getCell(1).getStringCellValue();
        String PIN = MySheet.getRow(1).getCell(2).getStringCellValue();
       
		login.UserName(USERNAME);
		login.sendPassWord(PASSWORD);
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Pin.PinPage(PIN);
		Pin.ContinueButton();
		Thread.sleep(2000);driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	
	@Test
  public void validateUserID()
   {
	 String actualUID = Home.getUserID();
	 String expectedUID = MySheet.getRow(1).getCell(0).getStringCellValue();
	 
	 Assert.assertEquals(actualUID, expectedUID,"Actual and Expected not match TC is Fail");
	 Reporter.log("Actual and Expected match TC is Pass");
	 
   }
	
	@AfterMethod
	public void logoutKiteApp() throws InterruptedException 
    {
		Home.logoutButton();
		
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(1000);
	    driver.close();
		
	}
	
		
	
	
}



