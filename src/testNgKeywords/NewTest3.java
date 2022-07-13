package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest3 {
  @Test (groups="Regression")
  
  public void x ()
  {
	  Reporter.log("x Method",true);
  }
  
  @Test (groups="Sanity")
  public void  y() 
  {
	Reporter.log("y Method",true);  
  }
  
  
  
  
}
