package kitePom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {


	@FindBy(id="userid") private WebElement userName;
	@FindBy(id = "password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	
	//2. constructor
	public KiteLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//3. methods
	public void UserName(String USERNAME)
	{
	userName.sendKeys(USERNAME);
	}
	public void sendPassWord(String PASSWORD)
	{
	password.sendKeys(PASSWORD);
	}
	public void clickOnLoginButton()
	{
	loginButton.click();
	}


}

	
	
	

