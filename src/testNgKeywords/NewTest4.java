package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest4 {
  @Test(groups="Regression")
  public void a ()
  {
	  Reporter.log("a Method",true);
  }
  
  @Test(groups="Regression")
  public void  b() 
  {
	Reporter.log("b Method",true);  
  }
}
