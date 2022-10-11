package kitePom1;



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
	
//	public void UserIDButton(String expectedID)
//	{
//		String ExpectedID="expectedID";
//		String ActualID = UserID.getText();
//		
//		if(ExpectedID.equals(ActualID))
//		{
//		System.out.println("Actual and Expected User Id are matching TC is passed");
//		}
//		else {
//		System.out.println("Actual and Expected User Id are not matching TC is failed");
//		}
		
	
	public String getUserID()
	{
		String ActualUID = UserID.getText();
		return ActualUID;
	}
		
	public void logoutButton() throws InterruptedException 
	{
		UserID.click();
		Thread.sleep(2000);
		LogOut.click();
	}
}

