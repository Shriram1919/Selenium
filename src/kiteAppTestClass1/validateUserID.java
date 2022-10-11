package kiteAppTestClass1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.Base;
import kitePom1.KiteHomePage;
import kitePom1.KiteLoginPage;
import kitePom1.KitePinPage;
import utilityClass.Utility;

public class validateUserID extends Base {
  
	KiteHomePage Home;
	KiteLoginPage login;
	KitePinPage Pin;
	
	@BeforeClass
	public void openbrowser()
	{
		StarBrowser();
		login =new KiteLoginPage(driver);
	 	 Pin =new KitePinPage(driver);
	 	 Home =new KiteHomePage(driver);
	}
	
	@BeforeMethod
	
	public void loginKite() throws EncryptedDocumentException, IOException
	{
		login.UserName(Utility.readDatafromExcelShrrt(1, 0));
		login.sendPassWord(Utility.readDatafromExcelShrrt(1, 1));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Pin.PinPage(Utility.readDatafromExcelShrrt(1, 2));
		Pin.ContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
	
	@Test
  public void ValidateIderID() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(Home.getUserID(),Utility.readDatafromExcelShrrt(1, 0),"Actual and Expectd not match TC is Fail");
		Reporter.log("Actual and Expectd match TC is Pass");
  }
	@AfterMethod
	public void logout() throws InterruptedException 
	{
		
		Home.logoutButton();
	}
     @AfterClass
     public void closeBrowser()
     {
    	 driver.close();
     }
}
