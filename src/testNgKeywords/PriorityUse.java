package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority = 1)
  public void a ()
  {
	  Reporter.log("a Method",true);
  }
  
  @Test(priority = 2)
  public void  b() 
  {
	Reporter.log("b Method",true);  
  }
  
  @Test(priority = 3)
  public void c()
  {
	  Reporter.log("c method",true);
  }
  
  @Test(priority = 4)
  public void d() 
  {
	Reporter.log("d method",true);  
  }
}

