package testNgKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void a ()
  {
	  Reporter.log("a Method",true);
  }
  
  @Test
  public void  b() 
  {
	 // Assert.fail();
	Reporter.log("b Method",true);  
  }
  
  @Test
  public void c()
  {
	  Reporter.log("c method",true);
  }
  
 
}
