package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationSstudy {
  @Test
  public void ValidateUserName() 
  {
	  Reporter.log("UserName Validate",true);
  }
  
  @BeforeMethod
  public void LogintOKiteAPP()
  {
	  Reporter.log("Login Success",true);
  }
  @Test
  public void ValidateDashBoard()
  {
	  Reporter.log("DashBoard Validate");
	 Reporter.log("DashBoard Validate",true); 
  }
  
  
  
  
  @AfterMethod
  public void LogOutKiteApp()
  {
	  Reporter.log("Logout Successfully",true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}




