package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
  @Test
  
  public void a ()
  {
	  Reporter.log("a Method",true);
  }
  
  @Test(dependsOnMethods = {"c"})
  public void  b() 
  {
	Reporter.log("b Method",true);  
  }
  
  @Test
  public void c()
  {
	  Reporter.log("c method",true);
  }
  
}

