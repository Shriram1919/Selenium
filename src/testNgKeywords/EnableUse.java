package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
  @Test
  
  public void a ()
  {
	  Reporter.log("a Method",true);
  }
  
  @Test(enabled = false)
  public void  b() 
  {
	Reporter.log("b Method",true);  
  }
  
}

