package testNgKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void x ()
  {
	  Reporter.log("x Method",true);
  }
  
  @Test
  public void  y() 
  {
	//  Assert.fail();
	Reporter.log("y Method",true);  
  }
  
  @Test
  public void z()
  {
	  Reporter.log("z method",true);
  }

}