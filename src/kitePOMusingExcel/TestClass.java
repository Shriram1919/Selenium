package kitePOMusingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteAppPom.KiteHomePage;
import kiteAppPom.KiteLoginPage;
import kiteAppPom.KitePinPage;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Tushar\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://kite.zerodha.com/");
	     Thread.sleep(1000);
	     
		
		File MyFile =new File("D:\\Tushar\\19thMarch.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
        String USERNAME= MySheet.getRow(1).getCell(0).getStringCellValue();
        String PASSWORD = MySheet.getRow(1).getCell(1).getStringCellValue();
        String PIN = MySheet.getRow(1).getCell(2).getStringCellValue();
       
        KiteLoginPage  Login=new KiteLoginPage(driver);
        Login.UN();
        Login.Pass();
        Login.click();
        Thread.sleep(1000);
        KitePinPage Pin =new KitePinPage(driver);
        Pin.PinPage();
        Pin.ContinueButton();
        Thread.sleep(1000);
//        KiteHomePage Home =new KiteHomePage(driver);
//        Home.
        
        
        
        
        
	}

}
