package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	// 1.data members
	@FindBy(id="userid")private WebElement UserName;
	@FindBy(id="password")private WebElement Password;
	@FindBy(xpath ="//button[@type='submit']") private WebElement Login;
	
	//2. constructor
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//3. methods
	
	public void UN()
	{
		UserName.sendKeys("ELR321");
	}
	
	public void Pass()
	{
		Password.sendKeys("Dhana1111");
	}
	public void click()
	{
		Login.click();
	}
	
	
	
}
