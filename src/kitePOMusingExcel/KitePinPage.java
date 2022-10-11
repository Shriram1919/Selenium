package kitePOMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {


	@FindBy(id="pin")private WebElement Pin;
	@FindBy(xpath ="//button[@type='submit']")private WebElement Continue;
	
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void PinPage(String PIN)
	{
		Pin.sendKeys("PIN");
	}
	public void ContinueButton()
	{
		Continue.click();
	}
}
