package kiteAppPom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	
	@FindBy(xpath ="//span[@class='user-id']")private WebElement UserID;
	@FindBy(xpath ="//a[@target='_self']")private WebElement LogOut;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void UserIDButton()
	{
		String ActualID = UserID.getText();
		String ExpectedID="ELR321";
		if(ExpectedID.equals(ActualID))
		{
		System.out.println("Actual and Expected User Id are matching TC is passed");
		}
		else {
		System.out.println("Actual and Expected User Id are not matching TC is failed");
		}
		
		}
		
			
		public void logOut() throws InterruptedException 
		{
			UserID.click();
		Thread.sleep(200);
		LogOut.click();
		
	}
	}



